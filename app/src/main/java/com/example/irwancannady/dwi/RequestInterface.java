package com.example.irwancannady.dwi;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by irwancannady on 8/8/16.
 */
public interface RequestInterface {

    @POST("dwi/")
    Call<ServerResponse> operation(@Body ServerRequest request);
}
