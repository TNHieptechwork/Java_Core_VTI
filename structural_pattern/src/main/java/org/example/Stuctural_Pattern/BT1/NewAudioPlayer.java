package org.example.Stuctural_Pattern.BT1;

public class NewAudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;
    OldMediaPlayer oldMediaPlayer = new OldMediaPlayer();

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("mp3")){
            oldMediaPlayer.playMP3(filename);
        } else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,filename);
        }
        else{
            System.out.println("Media " + audioType + " not support");
        }

    }
}
