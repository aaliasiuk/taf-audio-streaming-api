package com.elearn.epam.api.controllers;

import com.elearn.epam.api.data.ResponseData;
import com.elearn.epam.api.models.Playlist;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;


public class PlaylistController {
    public String baseUrl = "http://localhost:8080/";
    ResponseData responseData = new ResponseData();

    public Response createPlaylist(String description, boolean isPublic, String name, int userId) {
        String endpoint = baseUrl + "api/playlists";
        Playlist playlist = new Playlist(description, isPublic, name, userId);

        Response response = given()
                .header("Content-Type", "application/json")
                .body(playlist)
                .when()
                .post(endpoint);
        responseData.setStatusCode(response.getStatusCode());
        responseData.setResponseMessage(response.getBody().asString());
        return response;
    }

    public Response getPlaylistById(int id) {
        String endpoint = baseUrl + "api/playlists/{id}";
        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", id)
                .when()
                .get(endpoint);
        responseData.setStatusCode(response.getStatusCode());
        return response;
    }

    public Response updatePlaylist(int playlistId, String description, boolean isPublic, String name, int userId) {
        String endpoint = baseUrl + "api/playlists/{id}";
        Playlist playlist = new Playlist(playlistId, description, isPublic, name, userId);
        Response response = given()
                .header("Content-Type", "application/json")
                .pathParams("id", playlistId)
                .when()
                .body(playlist)
                .put(endpoint);

        return response;
    }

}
