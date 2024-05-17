// Map ist ein Set von Schlüsselwortpaaren (Wie Dictionary in Python)
// Map ist Interface (abstrakt (kein Body)) und HashMap ist Implementation von Map

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        
        HashMap<String, Integer> empIds = new HashMap<>();   // Map von String zu Integer

        empIds.put("John", 12345);     //John wird Schlüssel 12345 zugewiesen
        empIds.put("Carl", 54321);
        empIds.put("Jerry", 86);

        System.out.println(empIds.get("Carl"));
        System.out.println(empIds.containsKey("Jerry"));
        System.out.println(empIds.containsValue(86));
    }    
}
