package be.steformations.fs.client.ui.widget;


import java.util.Random;

import gwt.material.design.client.ui.MaterialColumn;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialRow;


public class Grille extends MaterialPanel{

	
	
	
	private Case[][] grille = new Case[4][4];
	
	
	public Grille() {
		for (int l = 0; l < grille.length; l++) {
			MaterialRow materialRow = new MaterialRow();
			for (int c = 0; c < grille.length; c++) {
				MaterialColumn column = new MaterialColumn();
				Case cas = new Case();
				cas.setText("");
				column.add(cas);
				materialRow.add(column);
				grille[l][c] = cas;
				
			}
			this.add(materialRow);
			
		}
		this.init();
	}
	
	private void init(){
		Random r = new Random();
		int ligne = r.nextInt(4);
		int col = r.nextInt(4);
		grille[ligne][col].setText("2");
	}
	
}
