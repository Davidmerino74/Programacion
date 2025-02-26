class Genero:
    # Atributos
    nombre=""
    edad_recomentada=0
    #Método constructor
    def __init__(self,nombre,edad_recomentada):
        self.nombre=nombre
        self.edad_recomentada=edad_recomentada
    # Getters y setters
    def getNombre(self):
        return self.nombre
    def setNombre(self,pNombre):
        self.nombre=pNombre
    def getEdad_recomendada(self):
        return self.edad_recomentada
    def setEdad_recomendada(self,pEdad_recomendada):
        self.edad_recomentada=pEdad_recomendada