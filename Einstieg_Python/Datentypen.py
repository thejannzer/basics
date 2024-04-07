import math
#beim importiern immer importierte libary mit angeben beim verwenden... siehe winkelf, oder auch RANDOM.randint(...)

#Typ ermitteln
def typ():
    a = 2
    b = "Hello_World"
    c = 2+4==6
    d = 3.454

    print (type(a))
    print (type(b))
    print (type(c))
    print (type(d))

#Exponentialisieren
def exponent():
    x = 5**3     # 5 hoch 3
    print(x)

#runden
def runden():
    x = 5/12
    print (x)
    print ("gerundet auf 3 Stellen: ", round(x,3))
    print ("gerundet auf eine Stelle: ", round(x,1))

#math
#import math
#Winkelfunktionen
def winkelf():
    x = 30
    print (math.sin(x))

#komplexe Zahlen
def komplex():
    a = 2-4j
    print ("a= ", a)
    print (f"Realteil: {a.real}")
    print (f"Imaginärteil: {a.imag}")
    print (f"Betrag von a: ", abs(a))

#binär
def binär():
    a = 4
    print (bin(a))


#Listen
#Liste ist im Gegensatz zum String veränderbar []
#Index[0,1,2,3,4,...]

Liste = [6,3,2,5,4,3]

print("Liste: ")
for element in Liste:
    print (element)

print (Liste)

print("---------------------------------------")
#mehrdimensionale Listen (Liste die Listen enthält (Arrays))

z = [[2, 8, 3, 4], ["Java", "Python", "Rust"]]
print ("Länge: ", len(z))
print ("Element: ", z[0][3])
print (len(z[1]))

#Listenoperatoren
def Listenoperatoren():
    z = [3,6,5,8,2,9,5,6,11]
    print (len(z))           #Länge von z
    del(z[4])                #Element an 4. Position der Liste wird entfernt
    print (z)
    z.insert(2, "Hallo")     #Fügt "Hallo" in die 2. Position der Liste ein
    print (z)

    #append fügt element an das ende der liste an
    #reverse kehrt die liste um
    #sort sortiert die liste alphabetisch bei strings oder von der kleinsten zu größten zahl

#Tupel
#sind listen die mehrere element enthalten, aber nicht verändert werden dürfen
def Tupel():
    t = (1,4,3,2)
    print (t)

#Dictionarys
#bestehen aus einem eindeutigen Schlüssel und einem zugeordneten Wert
def dictionary():
    dc = {"Julia":18, "Peter": 25, "Hans": 46}     #jedem Name wird ein Alter zugeordnet
    print (dc["Julia"])

    del (dc["Peter"])              #löscht Peter alter

    dc_hinzu = {"Max":22}           # fügt neuen eintrag hinzu
    dc.update(dc_hinzu)
    print(dc)


dictionary()





#Wahrheitswerte und Nichts
#Vergleiche liefern den Wahrheitswert True oder False
#None wird von Funktionen ohne Rückgabewert ausgegeben


#numpy libary
#Der Name "NumPy" ist eine Abkürzung für "Numerical Python". 
#Diese Bibliothek bietet leistungsstarke Funktionen und Datenstrukturen für die Arbeit mit mehrdimensionalen Arrays und Matrizen 
#sowie eine Vielzahl von mathematischen Funktionen, um Operationen auf diesen Daten durchzuführen.

import numpy as np

def mean_of_array(arr):
    return np.mean(arr)

# Beispielarray
arr = np.array([1, 2, 3, 4, 5])

# Berechnung des Mittelwerts
mean_value = mean_of_array(arr)

print("Mittelwert des Arrays:", mean_value)

#Diese Funktion verwendet die np.mean()-Funktion von NumPy, um das arithmetische Mittel des übergebenen Arrays zu berechnen.

