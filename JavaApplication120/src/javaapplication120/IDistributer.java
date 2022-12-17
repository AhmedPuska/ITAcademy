package javaapplication120;
public interface IDistributer {
void addSubscriber(Subscriber s);
void cancelSubscriber(Subscriber s);
void sendUpdate(String msg);
}
