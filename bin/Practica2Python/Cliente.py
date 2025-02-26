class Cliente:
    # Atributos
    nombre=""
    apellidos=""
    dni=0
    email=""
    fecha_nacimiento=""
    listaLibros=[]
    #Método constructor
    def __init__(self,nombre,apellidos,dni,email,fecha_nacimiento,listaLibros):
        self.nombre=nombre
        self.apellidos=apellidos
        self.dni=dni
        self.email=email
        self.fecha_nacimiento=fecha_nacimiento
        self.listaLibros=listaLibros
    # Getters y setters
    def getNombre(self):
        return self.nombre
    def setNombre(self,pNombre):
        self.nombre=pNombre
    def getApellidos(self):
        return self.apellidos
    def setApellidos(self,pApellidos):
        self.apellidos=pApellidos
    def getDni(self):
        return self.dni
    def setDni(self,pDni).
        self.dni=pDni
    def getEmail(self):
        return self.email
    def setEmail(self,pEmail):
        self.email=pEmail
    def getFecha_nacimiento(self):
        return self.fecha_nacimiento
    def setFecha_nacimiento(self,pFecha_nacimiento).
        self.fecha_nacimiento=pFecha_nacimiento
    def getListaLibros(self):
        return self.listaLibros
    def setListaLibros(self,pListaLibros)
        self.listaLibros=pListaLibros