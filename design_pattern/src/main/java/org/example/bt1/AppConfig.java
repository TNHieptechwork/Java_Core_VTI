package org.example.bt1;

public class AppConfig {
    private static AppConfig instance = null;
    private String appName;
    private String version;

    public AppConfig() {
        this.appName = "My Application";
        this.version = "1.0.0";
    }

    public AppConfig getInstance() {
        if(instance == null){
            instance = new AppConfig();
        }
        return instance;
    }
}
