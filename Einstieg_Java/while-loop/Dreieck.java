//Übung zu Schleifen

public class Dreieck{
    public static void main(String[]args){
        int counter=0;
        int a=0;
       
        while(counter<10) {
           
            System.out.print(a+" ");    //printet immer a aus dem vorherigem Schritt
           
            if(a==counter) {
                a=0;
                counter++;
                System.out.println();   //erzeugt nur einen Zeilenumbruch
            }
            else a++;
       
        }
    }
}

//einzelne Schritte auf Papier durchgehen zum verstehen
/*
 * 1. a=0 wird geprintet
 * 0
 * 2. a wird auf 0 gesetzt und counter auf 1
 * 3. 0 wird geprinted. a!=counter --> a wird auf 1 gesetzt und am Schleifenanfang geprintet
 * 0 1
 * 4. a==counter --> a wird auf 0 gesetzt und counter auf 2
 * 5. a=0 wird am anfang geprintet. Da a!=counter wird a auf 1 gesetzt und geprinted
 * 6. a!=counter --> a wird auf 2 gesetzt und geprinted.
 * 0 1 2
 * .........
 */
  