package com.sophossolutions.www.util;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesLoader {

    private PropertiesLoader() {
        load();
    }

    public static PropertiesLoader getInstance() {
        if (instance == null)
            instance = new PropertiesLoader();
        return instance;
    }

    private Properties load() {

        try {
            properties.load(new FileInputStream("src/test/resources/prop/serenity.properties"));
        } catch (Exception ex) {
            System.out.println("No se pudo cargar el archivo de propiedades, motivo: \"" + ex.getMessage() + "\"");
        }
        return properties;
    }

    public String getProperty(String prop) {
        return properties.getProperty(prop);
    }

    public String getProperty(String prop, String defaultValue) {

        String value = properties.getProperty(prop);
        if (value == null) {
            value = defaultValue;
        }

        return value;
    }

    public void setProperty(String property, String value) {
        properties.setProperty(property, value);
    }

    private static PropertiesLoader instance;
    private static Properties properties = new Properties();
}
