//Zahlendreieck umgekehrt

public class Dreieck_reverse{
    public static void main(String[]args){
        int zeile = 10;
        int a = 0;

        while (zeile >= 0){
            System.out.print(a + " ");

            if (zeile == a){
                a = 0;
                zeile--;
                System.out.println();
            }
            else a++;
        }



    }
}