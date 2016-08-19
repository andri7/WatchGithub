package io.fisache.watchgithub.data.github;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public interface GithubApiService {
    @GET("/users/{username}")
    Observable<UserResponse> getGithubUser(
            @Path("username") String username
    );

    @GET("/users/{username}/repos")
    Observable<List<RepositoryResponse>> getGithubRepositories(
            @Path("username") String username, @Query("page") int page
    );
}
