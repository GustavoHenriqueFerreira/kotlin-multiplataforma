package com.senai.vsconnect_kotlin.apis

import com.google.gson.JsonObject
import com.senai.vsconnect_kotlin.models.Login
import com.senai.vsconnect_kotlin.models.Servico
import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.*
import java.util.UUID

interface EndpointInterface {
    @GET("servicos")
    fun listarServicos(): Call<List<Servico>>

    @POST("login")
    fun login(@Body usuario: Login): Call<JsonObject>

    @GET("usuarios/{idUsuario}")
    fun buscarUsuarioPorID(@Path(value = "idUsuario", encoded = true) idUsuario: UUID) : Call<JsonObject>

    @Multipart
    @PUT("usuarios/editarImagem/{idUsuario}")
    fun editarImagemUsuario(@Part imagem: MultipartBody, @Path(value = "idUsuario", encoded = true) idUsuario : UUID)
    : Call<JsonObject>
}

