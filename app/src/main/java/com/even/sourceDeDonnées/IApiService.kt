package com.even.sourceDeDonnées

import com.even.domaine.entité.Utilisateur
import com.even.domaine.entité.UtilisateurÉvénement
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

    @GET("api/Utilisateur/GetById")
    suspend fun getUtilisateurParId(@Query("id") id: Int): Response<Utilisateur>

    @GET("api/Utilisateur/GetByName")
    suspend fun getUtilisateursParNom(@Query("name") nom : String): Response<List<Utilisateur>>

    @GET("api/Evenement/GetParRecherche")
    suspend fun getEvenementsParRecherche(
        @Query("nom") nom: String,
        @Query("mois") mois: String,
        @Query("location") location: String,
        @Query("organisateur") organisateur: String
    ): Response<List<Événement>>

    @POST("api/Evenement/New")
    suspend fun creerEvenement(@Body evenement: Événement): Response<Événement>

    @PUT("api/Evenement/Update")
    suspend fun updateEvenement(@Body evenement: Événement): Response<Void>

    @DELETE("delete/{id}/secret")
    suspend fun deleteEvenement(@Path ("id")id : Int): Response<Void>

    @POST("api/Utilisateur/Login")
    suspend fun demanderProfil(
        @Body utilisateur: Utilisateur
    ): Response<Utilisateur?>

    @GET("api/Evenement/GetParParticipant/{id}")
    suspend fun getEvenementsParParticipation(@Path("id") id: Int): Response<List<Événement>>

    @GET("api/Evenement/GetParOrganisateur/{id}")
    suspend fun getEvenementsParOrganisateur(@Path("id") id: Int): Response<List<Événement>>

    @GET("/api/Evenement/GetById")
    suspend fun getEvenementParId(@Query("id") id : Int) : Response<Événement>

    @POST("/api/Utilisateur/addParticipation")
    suspend fun ajouterParticipation(@Body utilisateurÉvenement : UtilisateurÉvénement) : Response<Void>

    @DELETE("/api/Utilisateur/deleteParticipation")
    suspend fun retirerParticipation(@Body utilisateurÉvenement: UtilisateurÉvénement) : Response<Void>
}