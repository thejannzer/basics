public class MyGenericClass <Thing> {

    Thing x;   //Variable x mit dem Typparameter Thing

    MyGenericClass(Thing x){
        this.x = x;
    }

    public Thing getValue(){
        return x;
    }
    
}
