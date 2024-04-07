//verschachtelte if-Anweisung

import javax.swing.JOptionPane;

public class Selektion{
    public static void main(String[]args){
        var eingabe = JOptionPane.showInputDialog("Bitte gib dein Alter ein");
        var alter = Integer.parseInt(eingabe);

        if (alter < 18){
            JOptionPane.showMessageDialog(null, "Tut mir leid, noch nicht volljährig");}
        else if (alter >= 18){
            JOptionPane.showMessageDialog(null, "Ja du bist volljährig");
            var coffee = JOptionPane.showInputDialog("Magst du Kaffee? j/n");
            var antwort = coffee.charAt(0);
            if (antwort == 'j'){
                JOptionPane.showMessageDialog(null, "Du bist toll");}
            else if (antwort == 'n'){
                JOptionPane.showMessageDialog(null, "Wie kann man keinen Kaffee mögen?");
            }
        }
    }
}