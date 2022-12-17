package javaapplication316;

import java.io.UnsupportedEncodingException;
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

public class Mail {

    static Properties mailServerProperties;
    static Session getMailSession;
    static MimeMessage generateMailMessage;

    public static void main(String args[]) throws AddressException, MessagingException, UnsupportedEncodingException {
        generateAndSendEmail();
        System.out.println("\n\n ===> Your Java Program has just sent an Email successfully. Check your email..");
    }

    public static void generateAndSendEmail() throws AddressException, MessagingException, UnsupportedEncodingException {

        // Step1
        System.out.println("\n 1st ===> setup Mail Server Properties..");
        mailServerProperties = System.getProperties();
        mailServerProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        mailServerProperties.put("mail.smtp.port", "587");
        mailServerProperties.put("mail.smtp.auth", "true");
        mailServerProperties.put("mail.smtp.starttls.enable", "true");
        System.out.println("Mail Server Properties have been setup successfully..");

        // Step2
        System.out.println("\n\n 2nd ===> get Mail Session..");
        getMailSession = Session.getDefaultInstance(mailServerProperties, null);
        MimeMessage msg = new MimeMessage(getMailSession);
                //Header stuff
                msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
                msg.addHeader("format", "flowed");
                msg.addHeader("Content-Transfer-Encoding", "8bit");

                msg.setFrom(new InternetAddress("gg6625122@gmail.com", "NoReply-JD"));
                msg.setSubject("Java mail", "UTF-8");
                msg.setText("Pozdrav sa java mail bota <br>Ovo je uvod u mail sendder<br>zasto se ne vidi ova poruka", "UTF-8");
                msg.setSentDate(new Date());
//                msg.setReplyTo(InternetAddress("ahmed.pule@gmail.com", false));
                msg.addRecipient(Message.RecipientType.TO, new InternetAddress("ahmed.pule@gmail.com"));
//        getMailSession = Session.getDefaultInstance(mailServerProperties, null);
//        generateMailMessage = new MimeMessage(getMailSession);
//        generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress("ahmed.pule@gmail.com"));
//        generateMailMessage.addRecipient(Message.RecipientType.CC, new InternetAddress("ahmed_pule@hotmail.com"));
//        generateMailMessage.setSubject("Pozdrav Od Java Maila");
//        String emailBody = "Testiram da li radi " + "<br><br> Regards, <br>Puska Ahmed</br>";
//        generateMailMessage.setContent(emailBody, "text/html");
        System.out.println("Mail Session has been created successfully..");

        // Step3
        System.out.println("\n\n 3rd ===> Get Session and Send mail");
        Transport transport = getMailSession.getTransport("smtp");

        // Enter your correct gmail UserID and Password
        // if you have 2FA enabled then provide App Specific Password
        transport.connect("smtp.gmail.com", "gg6625122@gmail.com", "123456789Fatih");
        transport.sendMessage(msg, msg.getAllRecipients());
        transport.close();
    }
}
