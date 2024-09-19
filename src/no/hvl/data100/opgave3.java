package no.hvl.data100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class opgave3 {

	public static void main(String[] args) {
	
		        String tallInput = showInputDialog("Skriv inn et heltall n > 0 for å beregne n!");

		       
		        int tall = Integer.parseInt(tallInput);

		        
		        if (tall > 0) {
		           
		            long resultat = 1;

		           
		            for (int i = 1; i <= tall; i++) {
		                resultat *= i;
		            }

		            
		            showMessageDialog(null, tall + "! = " + resultat);
		        } else {
		           
		            showMessageDialog(null, "Tallet må være større enn 0.");
		        }
		    }
		}
