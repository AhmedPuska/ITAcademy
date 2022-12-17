package javaapplication115;

import java.util.EventObject;

public class BankomatTransactionEvent extends EventObject{
    public int suma;
    public int transid;
    public BankomatTransactionEvent(Object o, int suma) {
        this(o, suma, 0);
    }
    public BankomatTransactionEvent(Object o, int suma, int transid) {
        super(o);
        this.suma = suma;
        this.transid = transid;
    }
}