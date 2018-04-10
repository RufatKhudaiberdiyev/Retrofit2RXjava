package com.example.rufat.retrofit2rxjava.Model.Retrofit;

import com.example.rufat.retrofit2rxjava.Model.Post;

import java.util.List;
import java.util.Observable;

import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Rufat on 10.04.2018.
 */

public interface IMyAPI {

    @GET("posts")
    io.reactivex.Observable<List<Post>> getPosts();
}


