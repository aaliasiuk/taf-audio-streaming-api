package com.elearn.epam.api.models;

public class Track {
    private String album;
    private String artist;
    private int duration;
    private int id;
    private String title;
    private int year;

    public Track(String album, String artist, int duration, int id, String title, int year) {
        this.album = album;
        this.artist = artist;
        this.duration = duration;
        this.id = id;
        this.title = title;
        this.year = year;
    }
}
