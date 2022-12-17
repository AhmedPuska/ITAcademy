package bean;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/dest")
    ,
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class HelloMessageBean implements MessageListener {
    
    public HelloMessageBean() {
    }
    
    @Override
    public void onMessage(Message message) {
        
        TextMessage textMessage = (TextMessage) message;

        try {
            System.err.println(textMessage.getText());
        } catch (JMSException exc) {
            
        }
    }
}