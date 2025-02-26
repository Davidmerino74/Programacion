class Autora:
    # Atributos
    nombre=""
    apellidos=""
    #Método constructor
    def __init__(self,nombre,apellidos):
        self.nombre=nombre
        self.apellidos=apellidos
    # Getters y setters
    def getNombre(self):
        return self.nombre
    def setNombre(self,pNombre):
        self.nombre=pNombre
    def getApellidos(self):
        return self.apellidos
    def setApellidos(self,pApellidos):
        self.apellidos=pApellidos