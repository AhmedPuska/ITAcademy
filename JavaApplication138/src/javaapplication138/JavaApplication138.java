package javaapplication138;

import java.io.IOException;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;

public class JavaApplication138 {
    public static void main(String[] args) throws NoSuchProviderException, MessagingException, IOException {
        Properties props = new Properties();
        props.setProperty("mail.store.protocol", "imaps");
        
        
        Session session = Session.getInstance(props);

        
        Store store = session.getStore();
        Message msg = null;
        
        store.connect("imap.gmail.com", "gg6625122@gmail.com", "123456789Fatih");
        Folder inbox = store.getFolder("INBOX");
        inbox.open(Folder.READ_ONLY);

        msg = inbox.getMessage(inbox.getMessageCount());
        System.out.println("Last mail received from " + msg.getFrom()[0].toString());
        System.out.println("Received date: " + msg.getReceivedDate().toString());
        System.out.println("Mail subject: " + msg.getSubject());
        System.out.println("Mail body: " + msg.getContent());
        
        


    }
}