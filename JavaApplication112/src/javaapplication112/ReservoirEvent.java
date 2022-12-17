package javaapplication112;
import java.util.EventObject;
public class ReservoirEvent extends EventObject
{
String msg;
public ReservoirEvent(Object source, String msg)
    {
        super(source);
        this.msg = msg;
    }
}