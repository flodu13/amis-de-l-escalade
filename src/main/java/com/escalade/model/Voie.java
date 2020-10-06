package com.escalade.model;

public class Voie {

String cotation;
boolean equipe;
Secteurs secteur;
public String getCotation() {
	return cotation;
}
public void setCotation(String cotation) {
	this.cotation = cotation;
}
public boolean isEquipe() {
	return equipe;
}
public void setEquipe(boolean equipe) {
	this.equipe = equipe;
}
public Secteurs getSecteur() {
	return secteur;
}
public void setSecteur(Secteurs secteur) {
	this.secteur = secteur;
}


}
