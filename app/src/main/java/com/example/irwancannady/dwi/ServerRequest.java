package com.example.irwancannady.dwi;

/**
 * Created by irwancannady on 8/8/16.
 */
public class ServerRequest {

    private String operation;
    private User user;

    public void setOperation(String operation){
        this.operation = operation;
    }

    public void setUser(User user){
        this.user = user;
    }
}
