package org.example.Stuctural_Pattern.BT1;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer =new VlcPlay();
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Play();
        }

    }

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVLC(filename);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMP4(filename);
        }
    }
}
