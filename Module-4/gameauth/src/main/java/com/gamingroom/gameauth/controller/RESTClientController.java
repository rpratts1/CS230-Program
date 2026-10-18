package com.gamingroom.gameauth.controller;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.gamingroom.gameauth.representations.GameUserInfo;

/**
 * The RESTClientController class acts as a client that calls
 * the application's REST API endpoints.
 *
 * This controller uses the Jersey Client API to send HTTP requests
 * to the /gameusers endpoints.
 */
@Produces(MediaType.TEXT_PLAIN)
@Path("/client/")
public class RESTClientController {

    /**
     * Jersey Client object used to send HTTP requests.
     */
    private Client client;

    /**
     * Constructor that receives the Jersey Client object.
     *
     * @param client Jersey Client used to communicate with the REST API
     */
    public RESTClientController(Client client) {
        this.client = client;
    }

    /**
     * Retrieves all game users from the /gameusers REST endpoint.
     *
     * @return a String representation of all game users
     */
    @GET
    @Path("/gameusers")
    public String getGameUsers() {

        /*
         * Create a WebTarget for the /gameusers endpoint.
         *
         * This tells the Jersey Client where the request should be sent.
         */
        WebTarget webTarget =
                client.target("http://localhost:8080/gameusers");

        /*
         * Create the request and specify that JSON is expected
         * from the REST service.
         */
        Invocation.Builder invocationBuilder =
                webTarget.request(MediaType.APPLICATION_JSON);

        /*
         * IMPORTANT AUTHENTICATION CHANGE:
         *
         * The /gameusers endpoint is protected by Basic Authentication.
         * Because this REST client is making the request internally,
         * it must send a valid Authorization header.
         *
         * "Basic dXNlcjpwYXNzd29yZA==" represents:
         *
         * user:password
         *
         * encoded using Base64.
         *
         * Without this header, the internal request receives HTTP 401
         * Unauthorized. The program would then try to read that error
         * response as an ArrayList, which causes the ProcessingException
         * and HTTP 500 error that appeared in the browser.
         */
        Response response = invocationBuilder
                .header(
                        "Authorization",
                        "Basic dXNlcjpwYXNzd29yZA==")
                .get();

        /*
         * Convert the JSON response into an ArrayList.
         */
        @SuppressWarnings("rawtypes")
        ArrayList gameusers =
                response.readEntity(ArrayList.class);

        /*
         * Return the user list as text so it can be displayed
         * in the browser.
         */
        return gameusers.toString();
    }

    /**
     * Retrieves one game user by ID.
     *
     * @param id identification number of the user
     * @return a String representation of the requested user
     */
    @GET
    @Path("/gameusers/{id}")
    public String getGameUserById(@PathParam("id") int id) {

        /*
         * Create a WebTarget for a specific user.
         *
         * Example:
         * http://localhost:8080/gameusers/1
         */
        WebTarget webTarget =
                client.target(
                        "http://localhost:8080/gameusers/" + id);

        /*
         * Create the request and specify that JSON is expected.
         */
        Invocation.Builder invocationBuilder =
                webTarget.request(MediaType.APPLICATION_JSON);

        /*
         * IMPORTANT AUTHENTICATION CHANGE:
         *
         * This endpoint is also protected by Basic Authentication.
         * The Authorization header supplies the same valid
         * user/password credentials used by the application.
         *
         * The Base64 text below represents:
         *
         * user:password
         */
        Response response = invocationBuilder
                .header(
                        "Authorization",
                        "Basic dXNlcjpwYXNzd29yZA==")
                .get();

        /*
         * Convert the JSON response into a GameUserInfo object.
         */
        GameUserInfo gameUserInfo =
                response.readEntity(GameUserInfo.class);

        /*
         * Return the user's information as readable text.
         */
        return gameUserInfo.toString();
    }
}