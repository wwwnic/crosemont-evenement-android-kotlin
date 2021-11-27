package com.even.domaine.interacteur

import android.util.Log
import com.even.domaine.entité.Événement
import com.even.sourceDeDonnées.ApiClient.apiService
import com.even.sourceDeDonnées.ISourceDeDonnées
import retrofit2.Response

class IntDétailÉvenement(val api : ISourceDeDonnées) {

    suspend fun getInfoÉvenement(id : Int) : Événement {
        val reponseRequête = apiService.getEvenementParId(id)
        return reponseRequête
    }

}