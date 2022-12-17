package javaapplication112;

import java.util.EventObject;

public interface ReservoirListener {
    public void statusChanged(ReservoirEvent event);
    public void reserveReached(EventObject evt);
}