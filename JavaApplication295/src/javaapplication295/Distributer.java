package javaapplication295;

import java.util.ArrayList;

public class Distributer implements IDistributer {

    ArrayList<ISubscriber> subscribers;

    public Distributer() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void addSubscriber(ISubscriber s) {
        this.subscribers.add(s);
    }

    @Override
    public void cancelSubscriber(ISubscriber s) {
        this.subscribers.remove(s);
    }

    @Override
    public void sendUpdate(String myUpdate) {
        for (int i = 0; i < subscribers.size(); i++) {
            subscribers.get(i).update(myUpdate);
        }
    }

}
