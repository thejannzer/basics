#OOP (objektorientierte Programmierung)
#hier werden Klassen erzeugt in denen Methoden und Eigenschaften festgelegt werden
#methoden sind Funktionen, die nur auf Objekte der betreffenden Klasse angewendet werden können
#Eigenschaften und Methoden zusammen bilden die Member der Klasse
#Klassen können ihre Eigenschaften auf vererben  bsp... die Klassen PKW und LKW werden von der Klasse Fahrzeug abgeleitet
class Fahrzeug:
    geschwindigkeit = 0
    def beschleunigen(self, wert):                    #self ist die Referenz auf das Objekt selbst und muss in jeder Methode auftauchen
        self.geschwindigkeit += wert                  #wert ist wert für änderung der Geschwindigkeit, der in Methode verarbeitet wird
    def ausgabe(self):
        print ("Geschwindigkeit", self.geschwindigkeit)

volvo = Fahrzeug()                                    #volvo wird als Objekt der Klasse Fahrzeug erzeugt (Instanz)
volvo.beschleunigen(20)                               
volvo.ausgabe()


#Besondere Member
#__init__() initialisiert ein Objekt zu Beginn seiner Lebensdauer mit seinen Anfangswerten
#__str__() gib die Eigenschaften eines Objektes aus
#__dict__() stellt ein Dictionary mit den Namen und Werten der Eigenschaften bereit
class Fahrzeug():
    def __init__(self, bez=("leer"), ge=0):
        self.bezeichnung = bez
        self.geschwindigkeit = ge
    def __str__(self):
        return f"{self.bezeichnung}, {self.geschwindigkeit} km/h"
    def beschleunigen(self, wert):
        self.geschwindigkeit += wert

opel = Fahrzeug("Opel", 40)      #(Bezeichung, Geschwindigkeit)
renault = Fahrzeug(30)
mercedes = Fahrzeug("Baba Wagen", 250)
    
print(opel)
print(renault)
print(mercedes)

print ("Mercedes Daten: ", mercedes.__dict__)





