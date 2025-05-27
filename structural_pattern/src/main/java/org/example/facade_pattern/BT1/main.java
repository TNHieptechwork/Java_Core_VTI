package org.example.facade_pattern.BT1;

public class main {
    public static void main(String[] args) {
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem sound = new SoundSystem();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projector, sound);

        homeTheater.watchMovie("Naruto");

        System.out.println("\nPhim kết thúc.");
        homeTheater.endMovie();
    }
}
