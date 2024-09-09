package no.hvl.data100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt; 

public class OppgaveO1 {

	public static void main(String[] args) {
		
		for (int i= 0; i< 10; i++) {
			
				String poengsummet = showInputDialog("Hva er poengsummen til sudent nummer "+ (i+1) + "?");
				int poengsummet2 = parseInt( poengsummet);
	
				
				if (poengsummet2>=90 &&poengsummet2 <=100) {
				
				showMessageDialog(null," Karakteren er A");
				
				}else if (poengsummet2>=80 && poengsummet2<=89) {
					showMessageDialog(null, "Karaketren er B");
				}else if (poengsummet2>=60 && poengsummet2<=79) {
					showMessageDialog(null," Karakteren er C");

				} else if (poengsummet2>=50 && poengsummet2<=59) {
					showMessageDialog(null, "Karakter er  D");
				} else if (poengsummet2>=40 && poengsummet2<=49) {
					showMessageDialog(null, " karakter er E ");
				} else if (poengsummet2>=0 && poengsummet2<=39){
					showMessageDialog(null, "Karakter er F ");
				} else { 
		
					showMessageDialog(null, "Feilmelding: Ugydlig pengsum.Poengsummen må være mellom 0 til 100.");
}
				
 
	 
	 
		}
	 
	 
 }


}





