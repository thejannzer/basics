print ("Inch Rechner")

operation: str = input ("wollen Sie in Inch oder cm umrechen (inch/cm): ")
if operation == "inch":
    try:
        wert = input ("Bitte geben Sie den Wert in cm ein: ")
        wert = float (wert)
    except:
        print("Bitte gib eine Zahl ein")

    print(f"{wert}cm entsprechen {wert/2.54} Inch")

if operation == "cm":
    try:
        wert = input ("Bitte geben Sie den Wert in Inch ein: ")
        wert = float (wert)
    except:
        print ("Bitte gib eine Zahl ein")

    print (f"{wert} Inch entsprechen {wert*2.54}cm")

    
