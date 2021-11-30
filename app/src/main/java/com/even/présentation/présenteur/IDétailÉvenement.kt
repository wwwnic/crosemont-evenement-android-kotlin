package com.even.présentation.présenteur

import com.even.domaine.entité.Commentaire
import com.even.domaine.entité.Utilisateur
import com.even.domaine.entité.Événement

interface IDétailÉvenement {

    interface IVue {
        fun afficherToastErreurServeur()
        fun afficherToastAucunCommentaire()
        fun afficherToastParticipationAjouté()
        fun afficherToastParticipationRetiré()
        fun setInfo(evenement: Événement)
        fun afficherNePlusParticiper()
        fun afficherParticipation()
        fun afficherListeParticipants(participants : List<Utilisateur>,imageUrl : (Int) -> String)
        fun afficherListeCommentaires(commentaires : List<Commentaire>)
    }

    interface IPrésentateur {
        fun traiterRequêteAfficherDétailÉvenement(id : Int)
        fun traiterRequêteAjouterParticipation(idEvenement: Int)
        fun traiterRequêteAfficherParticipants()
        fun traiterRequêteAfficherCommentaires()
    }

}