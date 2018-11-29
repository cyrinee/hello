package TP1.RP1;

import java.util.ArrayList;

public class Zoo {
	int visiteurs;
	ArrayList<Secteur> lsecteurs=new ArrayList <Secteur>();

	public Zoo(int v) {
		this.visiteurs=v;
		// TODO Auto-generated constructor stub
	}
	public void nouveauvisiteur()  throws limiteVisiteurException {
		
		visiteurs++;
		if (visiteurs >getLimiteVisiteur()) {
		      throw new limiteVisiteurException();

		}}
	public  int getLimiteVisiteur() {
		return lsecteurs.size()*15;
		
		
	}
	public void nouvelanimal(Animal a)throws typeexception  {
		for(int i=0;i<this.lsecteurs.size();i++) {
			if(a.typeanimal.equals(this.lsecteurs.get(i).typeanimauxdanssecteurs)){
				this.lsecteurs.get(i).ajouteranimal(a);
				throw new typeexception();
			}
		}
		
	}
	public int nombreanimaux() {
		int s=0;
		for(int i=0;i<this.lsecteurs.size();i++) {
			s=s+this.lsecteurs.get(i).animauxdanssecteur.size();
		
	}
		return s;
		
	

}}
