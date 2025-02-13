package org.example.patronesCreacionales.patronSingleton;

public class Configuration {
    private static final String rutaBD = "MYSQL.COM";
    private static final String idioma = "SPANISH";
    private static final String tema = "CASAS";
    private static Configuration instance;
    private Configuration() {
    }

    public static Configuration getInstance() {
        if (instance==null){
            instance=new Configuration();
        }
        return instance;
    }

    public String metodo() {
        return "Conexion realizada " + rutaBD + " " + idioma + " " + tema;
    }

}
