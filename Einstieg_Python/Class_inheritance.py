#Klassen und Vererbung
#Klassen sind Bauplaene von aehnlichen Objekten
#Objekte sind Instanzen der Klassen

#self muss immer dabei sein... ist referenz auf Objekt

class MyClass:

    def __init__(self, counter):
        self.counter = counter

    def increment(self):
        self.counter += 1
        print(f"New counter value: {self.counter}")

instance = MyClass(0) # erzeugt ein Objekt
instance.increment() 


#Klassen können von Superklassen erben
#Methoden der Superklasse können überschrieben werden
#Superklasse wird mit super() aufgerufen

class Star:
    def __init__(self, location):
        self.location = location
        #initialisiert Attribut location
    def getEstimatedLifespan(self):
        NeutronStar(1.4).getEstimatedLifespan()
        # Erstellt Instanz der Klasse NeutronStar mit einem Massenwert von 1.4 und ruft dann die Methode getEstimatedLifespan auf.

class NeutronStar(Star):
    #Unterklasse von Star
    def __init__(self, location, mass):
        #ruft __init__ übergeordneten Klasse auf und fügt Attribut mass hinzu
        super(NeutronStar, self).__init__(location)
        self.mass = mass

