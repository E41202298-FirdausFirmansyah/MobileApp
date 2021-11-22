package com.dausdroid.retrovolley.retrofit;

import com.dausdroid.retrovolley.Request;
import com.dausdroid.retrovolley.User;
import com.dausdroid.retrovolley.UserResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface MethodHTTP {

    @GET("User_Registration.php")
    Call<UserResponse> getUser();

    @POST("User_Registration.php")
    Call<Request> sendUser(@Body User user);
}
