package com.escalade.service;

import java.security.KeyStore.PasswordProtection;
import java.util.Base64;

import com.escalade.dao.UtilisateurDao;
import com.escalade.model.Utilisateur;

public class UtilisateurService {

	private UtilisateurDao utilisateurDao;
	
	public Utilisateur inscription (Utilisateur utilisateur) {
		utilisateur.setMotDePasse(Base64.getEncoder().encodeToString(utilisateur.getMotDePasse().getBytes()));
		return utilisateurDao.save(utilisateur);
	}
//	public static void main(String[] args) {
//		System.out.println(Base64.getEncoder().encodeToString("password".getBytes()));
//		System.out.println(new String(Base64.getDecoder().decode("cGFzc3dvcmQ=")));
//
//	}
	
	public Utilisateur connexion (String login, String motDePasse) {
		return utilisateurDao.rechercheLoginEtMotDePasse (login, Base64.getEncoder().encodeToString(motDePasse.getBytes()));
	}
}
