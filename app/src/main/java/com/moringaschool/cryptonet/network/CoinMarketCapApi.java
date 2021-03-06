package com.moringaschool.cryptonet.network;

import com.moringaschool.cryptonet.models.CoinmarketcapListingsLatestResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CoinMarketCapApi {
    @GET("cryptocurrency/listings/latest")
    Call<CoinmarketcapListingsLatestResponse> getData(
            @Query ("limit") int limit
    );


}
