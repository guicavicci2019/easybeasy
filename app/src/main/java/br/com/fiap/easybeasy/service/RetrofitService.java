package br.com.fiap.easybeasy.service;

import br.com.fiap.easybeasy.payload.PayloadTeste;
import br.com.fiap.easybeasy.payload.ProdutoPayload;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface RetrofitService {

    //Example headers
    //@Headers("X-Mashape-Key: AuuyclCPjcmshv2iOPq190OpzLrMp1FJWwejsnJrdfwOUr4h44")

    @FormUrlEncoded
    @POST("todos/1")
    Call<PayloadTeste> converterUnidade(@Field("userId") String userId,
                                        @Field("id") String id,
                                        @Field("title") String title,
                                        @Field("completed") Boolean completed);

}
