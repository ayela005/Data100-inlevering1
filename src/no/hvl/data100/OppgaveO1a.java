
package no.hvl.data100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class OppgaveO1a {

    public static void main(String[] args) {
        
        String poengsummet = showInputDialog("Hva er poengsummen til studenten?");
        
     
        int poengsummet2 = parseInt(poengsummet);
        
        
        if (poengsummet2 >= 90 && poengsummet2 <= 100) {
            showMessageDialog(null, "Karakteren er A");
        } else if (poengsummet2 >= 80 && poengsummet2 <= 89) {
            showMessageDialog(null, "Karakteren er B");
        } else if (poengsummet2 >= 60 && poengsummet2 <= 79) {
            showMessageDialog(null, "Karakteren er C");
        } else if (poengsummet2 >= 50 && poengsummet2 <= 59) {
            showMessageDialog(null, "Karakteren er D");
        } else if (poengsummet2 >= 40 && poengsummet2 <= 49) {
            showMessageDialog(null, "Karakteren er E");
        } else if (poengsummet2 >= 0 && poengsummet2 < 40) {
            showMessageDialog(null, "Karakteren er F");
        } else {
            showMessageDialog(null, "Ugyldig poengsum. Vennligst oppgi en poengsum mellom 0 og 100.");
        }
    }
}
