package com.elearn.epam.api.tests;

import com.elearn.epam.api.controllers.PlaylistController;
import com.elearn.epam.api.data.ResponseData;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import io.restassured.path.json.JsonPath;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlaylistApiTest {
    private int playlistId;

    @Test
    public void createPlaylistTest() {
        PlaylistController playlistController = new PlaylistController();
        Response response = playlistController.createPlaylist("from Java", true, "New 201", 1);
        int statusCode = response.getStatusCode();
        assertEquals(201, statusCode);

        String responseBody = response.getBody().asString();
        JsonPath jsonPath = new JsonPath(responseBody);

        assertThat(jsonPath.getString("name"), equalTo("New 201"));
        playlistId = jsonPath.getInt("id");

    }

    @Test
    public void retrieveNewlyCreatedPlaylist() {
        PlaylistController playlistController = new PlaylistController();
        Response response1 = playlistController.getPlaylistById(playlistId);

        int statusCode = response1.getStatusCode();
        assertThat(statusCode, equalTo(200));
    }
}
