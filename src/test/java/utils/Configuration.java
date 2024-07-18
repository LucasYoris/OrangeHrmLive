package utils;

import java.io.FileReader;
import java.util.Properties;
import java.util.logging.Logger;

public class Configuration {
    private static Properties properties = new Properties();
    private static final Logger logger = Logger.getLogger(Configuration.class.getName());
    private static Configuration instance = null;

    public Configuration() {

        try {
            properties.load(new FileReader("src/test/java/utils/configuration.properties"));
        } catch (Exception e) {
            logger.severe("No se pudo cargar el archivo  configuration.properties");
        }
    }

    public Properties getProperties() {
        return properties;
    }

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    public String getUrl() throws Exception {
        try {
            if (System.getProperty("ambiente") != null && !System.getProperty("ambiente").isEmpty()) {
                return System.getProperty("ambiente");
            } else {
                return properties.getProperty("url.web").trim();
            }
        } catch (Exception e) {
            logger.severe("No se pudo obtener el dato del url.web, verifique configuration.properties");
            throw new Exception(e.getMessage());
        }
    }

    public int getWaitSecond() throws Exception {
        try {
            int seconds = Integer.parseInt(properties.getProperty("selenium.waitTime").trim());
            return seconds;
        } catch (Exception e) {
            logger.severe("No se pudo obtener el dato del Selenium.wait, verifique configuration.properties");
            throw new Exception(e.getMessage());
        }
    }
}

