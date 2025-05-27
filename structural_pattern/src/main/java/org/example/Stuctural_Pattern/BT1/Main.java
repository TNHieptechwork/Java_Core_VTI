package org.example.Stuctural_Pattern.BT1;

public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new NewAudioPlayer();

        mediaPlayer.play("mp3","alone.mp3");
        mediaPlayer.play("mp4","music.mp4");
        mediaPlayer.play("vlc","music.vlc");
        mediaPlayer.play("vid","music.vid");

    }
}
