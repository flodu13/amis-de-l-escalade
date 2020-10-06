package com.escalade.dao;

import com.escalade.model.Utilisateur;

public interface UtilisateurDao {

	Utilisateur save(Utilisateur utilisateur);

	Utilisateur rechercheLoginEtMotDePasse(String login, String motDePasseEncode);

	Utilisateur rechercheParId(int emprunteurId);

}
