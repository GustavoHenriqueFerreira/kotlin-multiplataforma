package com.senai.vsconnect_kotlin.apis

import com.google.gson.JsonObject
import com.senai.vsconnect_kotlin.models.Login
import com.senai.vsconnect_kotlin.models.Servico
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface EndpointInterface {
    @GET("servicos")
    fun listaServicos() : Call<List<Servico>> //função para receber uma lista de serviços

    @POST("login")
    fun login(@Body usuario: Login) : Call<JsonObject>
}