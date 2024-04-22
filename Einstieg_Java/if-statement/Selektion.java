//verschachtelte if-Anweisung

import javax.swing.JOptionPane;

public class Selektion{
    public static void main(String[]args){
        var eingabe = JOptionPane.showInputDialog("Bitte gib dein Alter ein");
        int alter;

        //Fehlerbehandlung
        try{
        alter = Integer.parseInt(eingabe);
        }
        catch (NumberFormatException e) {       //siehe Exception Methoden (Vorlesung)
            JOptionPane.showMessageDialog(null, "Bitte gib eine Zahl ein");
            return;                             //beendet das Programm
        }
        //Conditions
        if (alter < 18){
            JOptionPane.showMessageDialog(null, "Tut mir leid, noch nicht volljährig");}
        else if (alter >= 18){
            JOptionPane.showMessageDialog(null, "Ja du bist volljährig");
            var coffee = JOptionPane.showInputDialog("Magst du Kaffee? j/n");
            char antwort;
            try{
            antwort = coffee.charAt(0);
            }
            catch (Exception e){   //funktioniert noch nicht
                JOptionPane.showMessageDialog(null, "Gib j für ja und n für nein ein");
                return;
            }
            if (antwort == 'j'){
                JOptionPane.showMessageDialog(null, "Du bist toll");}
            else if (antwort == 'n'){
                JOptionPane.showMessageDialog(null, "Wie kann man keinen Kaffee mögen?");
            }
        }
    }
}