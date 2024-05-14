// Generische Klassen 
public class Main{
    public static void main(String[] args) {
        
        //referenz Datentypen
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"B", "Y", "E"};
        //Um alle diese Arrays zu printen müsste man 4 Methoden mit 4 verschiedenen Datetypen schreiben
        
        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);

        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));
    }
    
    //Typparameter "Thing (beliebig nennbar)", erlaubt nur eine Methode für alle Arrays zu schreiben
    //<..> kommt vor return Typ der Methode
    public static <Thing> void displayArray(Thing[] array){
        for(Thing x:array){
            System.out.println(x + " ");
        }
        System.out.println();
    }
    
    //gibt das erste Element jeder Liste zurück unabhängig vom Typ
    public static <Thing> Thing getFirst (Thing[] array){
        return array[0];
    }
    
    //zusätzliche Methoden die man ohne Typparameter bräuchte:
    /*public static void displayArray(Double[] array){
        for(Double x:array){
            System.out.println(x + " ");
        }
        System.out.println();
    }
    public static void displayArray(Character[] array){
        for(Character x:array){
            System.out.println(x + " ");
        }
        System.out.println();
    }
    public static void displayArray(String[] array){
        for(String x:array){
            System.out.println(x + " ");
        }
        System.out.println();
    }*/
}