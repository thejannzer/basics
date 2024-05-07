#Variable scopes


counter = 0

def increment():
    global counter
    counter += 1
    print(counter)
    
def increment_2():
    counter = 0
    counter += 1
    print(counter)

counter += 1


increment()
increment_2()


#Variablen können in Funktionen modifiziert werden, aber
#dabei werden in den Funktionen neue lokale Variablen erstellt und
#nicht die globalen Variablen modifiziert... deshalb global

