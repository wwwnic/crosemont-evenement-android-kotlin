package com.even.sourceDeDonnées


import com.even.domaine.entité.Utilisateur
import com.even.domaine.entité.Événement
import retrofit2.Response
import retrofit2.http.*


interface IApiService {

    @POST("api/Utilisateur/New")
    suspend fun creerUtilisateur(@Body utilisateur: Utilisateur): Response<Void>

    @GET("api/Utilisateur/GetAll")
    suspend fun getAllUtilisateurs(): Response<List<Utilisateur>>

    @GET("api/Evenement/GetAll")
    suspend fun getAllEvenements(): Response<List<Événement>>

    @GET("/api/Evenement/GetParRecherche")
    suspend fun getEvenementsParRecherche(
        @Query("nom") nom: String,
        @Query("mois") mois: String,
        @Query("location") location: String,
        @Query("organisateur") organisateur: String
    ): Response<List<Événement>>

    @FormUrlEncoded
    @POST("api/login")
    suspend fun demanderProfil(
        @Field("nomUtilisateur") nomUtilisateur: CharSequence,
        @Field("motDePasse") motDePasse: CharSequence,
    ): Response<ApiReponse>
}