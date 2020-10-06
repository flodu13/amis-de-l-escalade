package com.escalade.model;

import java.util.Date;

public class Topo {
Disponibilites disponibilite;
String nom;
String description;
String lieu;
Date dateParution;
Utilisateur utilisateurEmprunteur;
Utilisateur utilisateurProprietaire;
Site site;
public Disponibilites getDisponibilite() {
	return disponibilite;
}
public void setDisponibilite(Disponibilites disponibilite) {
	this.disponibilite = disponibilite;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getLieu() {
	return lieu;
}
public void setLieu(String lieu) {
	this.lieu = lieu;
}
public Date getDateParution() {
	return dateParution;
}
public void setDateParution(Date dateParution) {
	this.dateParution = dateParution;
}
public Utilisateur getUtilisateurEmprunteur() {
	return utilisateurEmprunteur;
}
public void setUtilisateurEmprunteur(Utilisateur utilisateurEmprunteur) {
	this.utilisateurEmprunteur = utilisateurEmprunteur;
}
public Utilisateur getUtilisateurProprietaire() {
	return utilisateurProprietaire;
}
public void setUtilisateurProprietaire(Utilisateur utilisateurProprietaire) {
	this.utilisateurProprietaire = utilisateurProprietaire;
}
public Site getSite() {
	return site;
}
public void setSite(Site site) {
	this.site = site;
}


}
