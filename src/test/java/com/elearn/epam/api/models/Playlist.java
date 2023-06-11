package com.elearn.epam.api.models;

public class Playlist {
    private String description;
    private int id;
    private boolean isPublic;
    private String name;
    private int userId;
    private int playlistId;

    public Playlist(String description, int id, boolean isPublic, String name, int userId) {
        this(description, isPublic, name, userId);
        this.id = id;
    }

    public Playlist(String description, boolean isPublic, String name, int userId) {
        this(isPublic, name, userId);
        this.description = description;
    }
    public Playlist(boolean isPublic, String name, int userId){
        this.isPublic = isPublic;
        this.name = name;
        this.userId = userId;
    }

    public Playlist(int playlistId, String description, boolean isPublic, String name, int userId) {
        this(description,isPublic,name,userId);
        this.playlistId = playlistId;
    }
    public int getPlaylistId(){
        return playlistId;
    }
    public void setPlaylistId(int id){
        this.playlistId = playlistId;
    }

}
