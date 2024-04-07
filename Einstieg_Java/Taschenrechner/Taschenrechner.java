//Taschenrechner mit if_statements zur Übung

import javax.swing.JOptionPane;

public class Taschenrechner{
    public static void main(String[]args){
        var eingabe = JOptionPane.showInputDialog("Welche Rechneoperation? (+, -, *, /)");
        var operation = eingabe.charAt(0);
        var zahl_1 = JOptionPane.showInputDialog("Gib die Erste Zahl ein");
        var zahl_2 = JOptionPane.showInputDialog("Gib die zweite Zahl ein");

        
        if (operation == '+'){
            int zahl1 = Integer.parseInt(zahl_1);
            int zahl2 = Integer.parseInt(zahl_2);
            int ergebnis = zahl1 + zahl2;
            JOptionPane.showMessageDialog(null, "Das Ergebnis ist: " + ergebnis);}
        
        else if (operation == '-'){
            int zahl1 = Integer.parseInt(zahl_1);
            int zahl2 = Integer.parseInt(zahl_2);
            int ergebnis = zahl1 - zahl2;
            JOptionPane.showMessageDialog(null, "Das Ergebnis ist: " + ergebnis);}

        else if (operation == '*'){
            int zahl1 = Integer.parseInt(zahl_1);
            int zahl2 = Integer.parseInt(zahl_2);
            int ergebnis = zahl1 * zahl2;
            JOptionPane.showMessageDialog(null, "Das Ergebnis ist: " + ergebnis);}
        
        else if (operation == '/'){
            int zahl1 = Integer.parseInt(zahl_1);
            int zahl2 = Integer.parseInt(zahl_2);
            int ergebnis = zahl1 / zahl2;
            JOptionPane.showMessageDialog(null, "Das Ergebnis ist: " + ergebnis);} 

    }
}

