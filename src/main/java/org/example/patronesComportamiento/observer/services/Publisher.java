package org.example.patronesComportamiento.observer.services;


public interface Publisher {
    public void addSubscriptor(String key,Listeners listeners);
    public void removeSubscriptor(String key);
    public void notifyMessages();
    public String message();
}
