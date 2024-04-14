//Main OOP
 public class Main{
    public static void main(String[]args){

      //Klasse importieren und Objekterzeugen (myCar, myCar2)
      car myCar = new car();
      car myCar2 = new car();
      
      //Attribute ausführen
      System.out.println(myCar.model);
      System.out.println(myCar.color);
      System.out.println(myCar.price);
      System.out.println();
      System.out.println(myCar2.model);

      //Methode ausführen
      myCar.drive();
      myCar.brake();
        
    }
 }

 //andere Klassen können auch hier in der Datei angelegt werden