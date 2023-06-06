package com.elearn.epam.api;

public class Playlist {
    private String description;
    private int id;
    private boolean isPublic;
    private String name;
    private int userId;

    public Playlist(String description, int id, boolean isPublic, String name, int userId) {
        this(description,isPublic,name,userId);
        this.id = id;
    }
    public Playlist(String description, boolean isPublic, String name, int userId) {
        this.description = description;
        this.isPublic = isPublic;
        this.name = name;
        this.userId = userId;
    }
}
