package com.escalade.model;

public class Utilisateur {

	private int id;
	private boolean membre;
	private String nom;
	private String login;
	private String motDePasse;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isMembre() {
		return membre;
	}
	public String getNom() {
		return nom;
	}
	public String getLogin() {
		return login;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
	
	
}
