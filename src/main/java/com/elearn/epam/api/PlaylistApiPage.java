package com.elearn.epam.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlaylistApiPage {
    public String baseUrl = "http://localhost:8080/";

    public void createPlaylist(String description, boolean isPublic, String name, int userId) {
        String endpoint = baseUrl + "api/playlists";
        Playlist playlist = new Playlist(description, isPublic, name, userId);

        given()
                .header("Content-Type", "application/json")
                .body(playlist)
                .post(endpoint)
                .then()
                .log().body();
    }
    public void getPlaylistById(){

    }
}
