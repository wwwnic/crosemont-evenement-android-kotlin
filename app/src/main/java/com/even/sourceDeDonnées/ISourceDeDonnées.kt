package com.even.sourceDeDonnées

import coil.compose.ImagePainter
import com.even.domaine.entité.Utilisateur
import com.even.domaine.entité.UtilisateurÉvénement
import com.even.domaine.entité.Événement
import retrofit2.http.Url

interface ISourceDeDonnées {
    suspend fun getAllUtilisateurs() : List<Utilisateur>
    suspend fun getAllEvenements() : List<Événement>
    suspend fun getUtilisateursEvenement() : List<UtilisateurÉvénement>
    suspend fun creerUtilisateur()
    suspend fun creerEvenement(evenement : Événement) : Événement?
    suspend fun getUtilisateurParId(id : Int) : Utilisateur?
    suspend fun getEvenementsParRecherche(nom : String,mois : String,location : String,organisateur : String) : List<Événement>
    fun getImageUtilisateur(id:Int) : String
    fun getImageEvenement(id:Int) : String
}