package org.example.patronesComportamiento.observer.services;

import java.util.HashMap;
import java.util.Map;

public class ServidorNotificaciones implements Publisher{
    private HashMap<String,Listeners> subs = new HashMap<>();
    @Override
    public void addSubscriptor(String key, Listeners listeners) {
        subs.put(key,listeners);
    }

    @Override
    public void removeSubscriptor(String key) {
        subs.remove(key);
    }

    @Override
    public void notifyMessages() {
        for(Map.Entry<String,Listeners> entry:subs.entrySet()){
            Listeners listeners = entry.getValue();
            listeners.update(message());
        }
    }

    @Override
    public String message() {
        return "Se actulizo el servidor";
    }
}
