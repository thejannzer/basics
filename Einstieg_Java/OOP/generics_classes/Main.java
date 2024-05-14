public class Main{
    public static void main(String[] args) {
        
        //normalerweise müsste man 4 verschiedene Klassen mit 4 verschiedenen Datentypen schreiben
       
        /*MyIntegerClass myInt = new MyIntegerClass(1);
         MyDoubleClass myDouble = new MyDoubleClass(3.14);
         MyCharacterClass myChar = new MyCharacterClass('@');
         MyStringClass myString = new MyStringClass("Hello");
        
        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());*/

        //Generische Klasse
        MyGenericClass <Integer> myInt = new MyGenericClass<>(1);
        MyGenericClass <Double> myDouble = new MyGenericClass<>(3.14);
        MyGenericClass <Character> myChar = new MyGenericClass<>('@');
        MyGenericClass <String> myString = new MyGenericClass<>("Hello");
        
        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());
    }   
}