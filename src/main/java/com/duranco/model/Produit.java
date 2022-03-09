package com.duranco.model;

public class Produit {
private int id;
private String titre,description;
private double prix;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public Produit(int id, String titre, String description, double prix) {
	super();
	this.id = id;
	this.titre = titre;
	this.description = description;
	this.prix = prix;
}
public Produit() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Produit [id=" + id + ", titre=" + titre + ", description=" + description + ", prix=" + prix + "]";
}






}
