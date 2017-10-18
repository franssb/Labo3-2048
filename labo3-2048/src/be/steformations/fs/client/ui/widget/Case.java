package be.steformations.fs.client.ui.widget;

import gwt.material.design.client.ui.MaterialButton;

//element graphique (label? button)
public class Case extends MaterialButton{

	
	//posede un int?
	private Integer valeur;

	public int getValeur() {		
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
}
