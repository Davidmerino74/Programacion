

class Reloj:
    # Atributos
    hora=0
    minutos=0
    segundos=0
    # Método constructor
    def __init__(self,hora,minutos,segundos):
        self.hora=hora
        self.minutos=minutos
        self.segundos=segundos
    # Getters y setters
    def getHora(self):
        return self.hora
    def setHora(self,pHora):
        self.hora=pHora
    def getMinutos(self):
        return self.minutos
    def setMinutos(self,pMinutos):
        self.minutos=pMinutos
    def getSegundos(self):
        return self.segundos
    def setSegundos(self,pSegundos):
        self.segundos=pSegundos
    # Otros métodos que os pedimos

   # Método toString que devuelve la hora actual en formato HH:mm:ss
    def __str__(self):
        return f"{self.hora:02d}:{self.minutos:02d}:{self.segundos:02d}"

    # Método: enSegundos - devuelve el tiempo en ese momento en segundos
    def enSegundos(self):
        return self.hora * 3600 + self.minutos * 60 + self.segundos

    # Método: crearHoraConSegundos - convierte segundos en horas y minutos
    def crearHoraConSegundos(self, psegundos):
        self.hora = psegundos // 3600
        psegundos = psegundos % 3600
        self.minutos = psegundos // 60
        self.segundos = psegundos % 60
        return f"{self.hora:02d}:{self.minutos:02d}:{self.segundos:02d}"

    # Método que suma un segundo
    def sumaSegundos(self):
        self.segundos += 1
        if self.segundos >= 60:
            self.segundos = 0
            self.minutos += 1
        if self.minutos >= 60:
            self.minutos = 0
            self.hora += 1
        if self.hora >= 24:
            self.hora = 0

    # Método que suma un minuto
    def sumaMinutos(self):
        self.minutos += 1
        if self.minutos >= 60:
            self.minutos = 0
            self.hora += 1
        if self.hora >= 24:
            self.hora = 0

    # Método que suma una hora
    def sumaHoras(self):
        self.hora += 1
        if self.hora >= 24:
            self.hora = 0
