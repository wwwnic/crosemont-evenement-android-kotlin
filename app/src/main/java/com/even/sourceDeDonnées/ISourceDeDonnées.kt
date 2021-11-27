package com.even.sourceDeDonnées

import com.even.domaine.entité.Utilisateur
import com.even.domaine.entité.UtilisateurÉvénement
import com.even.domaine.entité.Événement
import retrofit2.Response

interface ISourceDeDonnées {
    suspend fun getAllUtilisateurs(): List<Utilisateur>
    suspend fun getAllEvenements(): List<Événement>
    suspend fun getUtilisateursEvenement(): List<UtilisateurÉvénement>
    suspend fun creerUtilisateur(utilisateur: Utilisateur): Response<Void>
    suspend fun demanderProfil(utilisateur: Utilisateur): Utilisateur?
    suspend fun creerEvenement(evenement: Événement): Événement?
    suspend fun getUtilisateurParId(id: Int): Utilisateur?
    suspend fun getEvenementParParticipation(id: Int): List<Événement>
    suspend fun getEvenementsParOrganisateur(id: Int): List<Événement>
    suspend fun getEvenementsParRecherche(
        nom: String,
        mois: String,
        location: String,
        organisateur: String
    ): List<Événement>
    suspend fun getEvenementParId(id : Int)
    fun getImageUtilisateur(id: Int): String
    fun getImageEvenement(id: Int): String
}