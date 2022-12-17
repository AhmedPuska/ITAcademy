package javaapplication138;

import java.util.Date;
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

/**
 *
 * @author user
 */
public class Email {

    public static void main(String[] args) throws AddressException, MessagingException {
        System.out.println("Saljem poruku");
        Properties props = System.getProperties();
//        props.setProperty("mail.smtp.host", "smtp.gmail.com");
//        props.setProperty("mail.smtps.starttls.enable", "true");
//        props.setProperty("mail.smtp.socketFactotry.port", "465");
//        props.setProperty("mail.smtp.socketFactotry.class", "javax.net.ssl.SSLSocketFactory");
//        props.setProperty("mail.smtp.auth", "true");
//        props.setProperty("mail.smtps.debug", "true");
//        props.setProperty("mail.smtp.socketFactory.fallback", "false");
////        props.setProperty("mail.smtp.port", "465");
        
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
//        props.put("mail.smtp.port", "587");
        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        System.out.println("Mail Server Properties have been setup successfully..");
        props.put("mail.smtp.port", "465");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("gg6625122@gmail.com", "123456789Fatih");
            }
        });
//        Session session = Session.getDefaultInstance(props, null);
        System.out.println("EEE");
        try {
            System.out.println("Ulazim tu");
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress("gg6625122@gmail.com"));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("ahmed.pule@gmail.com"));
            msg.setSubject("TEST java mail probafsafas");
            msg.setText("Zdravo sa jave od ahmeda <br>ovo je trebao bitgi novi red");
                    
            Transport.send(msg);
                    

            Transport transport = session.getTransport("smtp");
//            transport.send(msg);

            transport.connect("smtp.gmail.com", 465, "gg6625122@gmail.com", "123456789Fatih");
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();
            System.out.println("Izalzim tu");
        } catch (MessagingException exc) {
            System.out.println("Greska");
            System.out.println(exc.getMessage());
        }
//        System.out.println("Poruka stigla?");
    }

}
