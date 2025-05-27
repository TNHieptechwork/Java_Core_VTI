package org.example.Stuctural_Pattern.BT1;

public class Mp4Play implements AdvancedMediaPlayer {
    @Override
    public void playMP4(String filename) {
        System.out.println("Playing MP4: " + filename);
    }

    @Override
    public void playVLC(String filename) {

    }
}
