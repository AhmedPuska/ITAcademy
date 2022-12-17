package javaapplication139;



import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage; 

public class JavaApplication139 {
    public static void main(String[] args) throws AddressException, MessagingException {
        Properties props = new Properties();
        props.setProperty("mail.smtp.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.socketFactory.port", "465");
        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.setProperty("mail.smtp.auth", "true");
        props.setProperty("mail.smtp.port", "465");
        
        Session session = Session.getInstance(props, new Authenticator() {
            
               @Override
               protected PasswordAuthentication getPasswordAuthentication(){
                   return new PasswordAuthentication("ahmed.pule@gmail.com", "puskaahmed...");
               }
        });
        
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("ahmed.pule@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("ahmed.pule@gmail.com"));
            message.setSubject("Test Java Mail");
            message.setText("Hello from Java!");
            
            Transport.send(message);
            
            System.out.println("Message sent");
        }
        catch(MessagingException exc) {
            System.out.println("Error: " + exc.getMessage());
        }
    }
}
