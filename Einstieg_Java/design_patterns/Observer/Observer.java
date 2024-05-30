public interface Observer {
    void update(String message);
}

//Methode update() wird von allen Beobachtern implementiert
//Empfängt Benachrichtigungen vom Subject