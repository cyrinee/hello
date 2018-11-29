package TP1.RP1;

import java.util.ArrayList;

public class Secteur {
	String typeanimauxdanssecteurs;
	ArrayList<Animal> animauxdanssecteur=new ArrayList <Animal>();
	int nbvisiteurs;

	public Secteur() {
		// TODO Auto-generated constructor stub
	}
	public void ajouteranimal(Animal a) {
		this.animauxdanssecteur.add(a);
	}
	public int getnombreanimaux() {
		return this.animauxdanssecteur.size();
		
	}
	public String obtenirtype() {
		return this.typeanimauxdanssecteurs;
	}

}
