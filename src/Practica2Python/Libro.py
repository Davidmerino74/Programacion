class Libro:
    # Atributos
    titulo=""
    fecha_publ=""
    autor=""
    genero=""
    sinopsis=""
    #Método constructor
    def __init__(self,titulo, fecha_publ,autor,genero,sinopsis):
        self.titulo=titulo
        self.fecha_publ=fecha_publ
        self.autor=autor
        self.genero=genero
        self.sinopsis=sinopsis
    # Getters y setters
    def getTitulo(self):
        return self.titulo
    def setTitulo(self,pTitulo):
        self.titulo=pTitulo
    def getFecha_publ(self):
        return self.titulo
    def setFecha_publ(self,pFecha_publ):
        self.fecha_publ=pFecha_publ
    def getAutor(self):
        return self.autorç
    def setAutor(self,pAutor):
        self.autor=pAutor
    def getGenero (self):
        return self.genero
    def setGenero (self,pGenero):
        self.genero=pGenero
    def getSinopsis(self):
        return self.sinopsis
    def setSinopsis(self,pSinopsis):
        self.sinopsis=pSinopsis
        