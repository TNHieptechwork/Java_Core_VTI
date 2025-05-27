package org.example.Stuctural_Pattern.BT1;

public class VlcPlay implements AdvancedMediaPlayer {

    @Override
    public void playMP4(String filename) {
    }

    @Override
    public void playVLC(String filename) {
        System.out.println("playing VLC: " + filename);
    }
}
