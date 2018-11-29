package TP1.RP1;

public class limiteVisiteurException extends Exception{
String message;
	public limiteVisiteurException()  {
		// TODO Auto-generated constructor stub
		super();
		
	}
	public String toString() {
		return "le nombre de visiteur dépasse les 15 personnes par secteur";
	}

}
