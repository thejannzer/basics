print("Inch-Rechner")
zahl = input("Bitte gib den Wert in cm ein: ")
try:
    zahl = int (zahl)
except:
    print("Bitte gib eine ganze Zahl ein")
    
if type(zahl)==str:
    print("Nur Datentyp Integer oder Float sind erlaubt")
else:
    while zahl != 0:
        print (f"Der wert in Inch ist {zahl/2.54}")
        break



    
