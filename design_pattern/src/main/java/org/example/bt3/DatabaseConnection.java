package org.example.bt3;

public enum DatabaseConnection {
    instance;
    private boolean connected = false;

    public void connect(){
        if(!connected){
            System.out.println("Connected");
            connected = true;
        }
        else{
            System.out.println("Have a connection");
        }
    }
    public void disconnect() {
        if (connected) {
            System.out.println("interrupted Connection.");
            connected = false;
        } else {
            System.out.println("Not have connection to interrupt.");
        }
    }
}
