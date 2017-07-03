package com.example.karansharma.retrofitnetwork;

/**
 * Created by karansharma on 3/7/17.
 */

public class APIUtils {

    private APIUtils() {}

    public static final String BASE_URL = "http://jsonplaceholder.typicode.com/";

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}