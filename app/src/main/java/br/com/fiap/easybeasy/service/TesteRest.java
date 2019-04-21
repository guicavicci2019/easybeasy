package br.com.fiap.easybeasy.service;

import java.util.List;

import br.com.fiap.easybeasy.model.Teste;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface TesteRest {

    //Example headers
    //@Headers("X-Mashape-Key: AuuyclCPjcmshv2iOPq190OpzLrMp1FJWwejsnJrdfwOUr4h44")

    @GET("todos/1")
    Call<List<Teste>> getTeste();

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

}
