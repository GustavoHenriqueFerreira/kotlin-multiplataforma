package com.senai.vsconnect_kotlin.apis

import com.senai.vsconnect_kotlin.models.Servico
import retrofit2.Call
import retrofit2.http.GET

interface EndpointInterface {
    @GET("servicos")
    fun listaServicos() : Call<List<Servico>> //função para receber uma lista de serviços
}