package org.example.bt2;

public class Logger {
    private static Logger instance = null;

    public static synchronized Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message){
        System.out.println(message);
    }

}
