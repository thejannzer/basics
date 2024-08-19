#get-Methode

class WhiteLightbulb:

    global color 

    def __init__(self, color):
        self.color = color;

    def get_color(self):
        return color;

    def set_color(self, c):
        if not type(c) is color:
            raise TypeError("expected 'Color'")
    
