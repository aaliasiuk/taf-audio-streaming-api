package com.elearn.epam.api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlaylistApiTest {
    public String baseUrl = "http://localhost:8080/";

    @Test
    public void createPlaylistTest() {
        PlaylistApiPage playlistApiPage = new PlaylistApiPage();
        playlistApiPage.createPlaylist("from Java", true, "New 201", 1);

        /*assertEquals(201, response.getStatusCode(), "Something not right");*/
      /*  String endpoint = baseUrl + "api/playlists";
        Playlist playlist = new Playlist("New 200 playlist", true, "Name 200", 2);

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(playlist)
                .post(endpoint);

        //assertEquals(201,response.getStatusCode(),"Unexpected status code");
        //assertEquals(playlist, response.getBody().toString());
*/


    }
}
