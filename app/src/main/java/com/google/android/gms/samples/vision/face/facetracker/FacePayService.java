package com.google.android.gms.samples.vision.face.facetracker;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FacePayService {
    @GET("v1/chain/get_info")
    Call<PayResponse> getInfo();

    @GET("sendPayment")
    Call<List<PayDoneResponse>> sendMoney(@Query("from") String from, @Query("to") String to, @Query("amount") String amount);

    @GET("tink/eat.json")
    Call<List<Content>> getEatContent();
}
