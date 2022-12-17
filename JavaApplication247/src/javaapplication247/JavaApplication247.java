package javaapplication247;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;

public class JavaApplication247 {

    public static void main(String[] args) throws ParserConfigurationException, TransformerConfigurationException, TransformerException, SQLException, FileNotFoundException {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();

        Document doc = db.newDocument();

        Element prognoze = doc.createElement("prognoze");
        doc.appendChild(prognoze);

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/g4_prognoza", "root", "");
        ResultSet rs = conn.createStatement().executeQuery("select * from prognoze");

        while (rs.next()) {

            Element prognoza = doc.createElement("prognoza");
            prognoze.appendChild(prognoza);
            prognoza.setAttribute("id", rs.getString("id"));

            Element grad = doc.createElement("grad");
            grad.setTextContent(rs.getString("grad"));
            prognoza.appendChild(grad);

            Element temperatura = doc.createElement("temperatura");
            temperatura.setTextContent(rs.getString("temperatura"));
            prognoza.appendChild(temperatura);
        }

        DOMSource xmldoc = new DOMSource(doc);
        ByteOutputStream bos = new ByteOutputStream();
        StreamResult result = new StreamResult(new FileOutputStream("C:\\wamp64\\www\\prognoza.xml"));
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer tr = tf.newTransformer();
        tr.transform(xmldoc, result);

        System.out.println(new String(bos.getBytes()));

    }

}
