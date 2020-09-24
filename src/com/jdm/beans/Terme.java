package com.jdm.beans;

public class Terme {

	
	private int id;
	private String nom;
	private boolean is_imported;
	
	
	
	public Terme(int id_terme, String nom_terme, boolean is_imported_terme) {
		this.id = id_terme;
		this.nom = nom_terme;
		this.is_imported = is_imported_terme;
	}
	
	
	public int getId_terme() {
		return id;
	}
	public void setId_terme(int id_terme) {
		this.id = id_terme;
	}
	public String getNom_terme() {
		return nom;
	}
	public void setNom_terme(String nom_terme) {
		this.nom = nom_terme;
	}
	public boolean is_imported_terme() {
		return is_imported;
	}
	public void setIs_imported_terme(boolean is_imported_terme) {
		this.is_imported = is_imported_terme;
	}
	
	
}
