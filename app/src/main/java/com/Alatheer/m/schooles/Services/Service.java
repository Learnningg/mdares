package com.Alatheer.m.schooles.Services;

import com.Alatheer.m.schooles.Models.AllSchoolModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by elashry on 3/3/2018.
 */

public interface Service {

    ///////////////////////////////---------Display All Schools---------//////////////////
    @GET("Api/AllSchool")
    Call<List<AllSchoolModel>>DiaplayAll_Schools();

    ///////////////////////////////---------news Schools---------//////////////////


}