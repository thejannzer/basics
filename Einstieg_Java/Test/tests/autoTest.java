import junit.framework.TestCase;
import Main.auto;

//testmethode schreiben
public class autoTest extends TestCase{

    public void testGetFarbe(){
    auto myAuto = new auto();
    String expectedFarbe = "Blau";
    String actualFarbe = myAuto.getFarbe(expectedFarbe);

    //vergleicht die Werte (expected, actual)
    assertEquals(expectedFarbe, actualFarbe);
}

public void testGetGeschwindigkeit(){
    auto myAuto = new auto();
    try{
        int expectedGeschwindigkeit = 100;
        int actualGeschwindigkeit = myAuto.getGeschwindigkeit(expectedGeschwindigkeit);
        }
    catch (IllegalArgumentException e){
        assertEquals("Geschwindigkeit darf nicht größer als 100 sein", e.getMessage());
        }
    }
}

//mit javac -cp ... Test Klasse kompilieren, danach entsteht ....class Datei im Ordner
//danach mit java -cp ... Testen mit junit.swingui.TestRunner (graphisch)