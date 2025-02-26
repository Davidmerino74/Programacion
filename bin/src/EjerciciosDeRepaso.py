import math
"""se pone al principio por su hay más de uno que lo usa"""
print("inicio ejercicio 1")
print("dame un número")
numuno=10
numdos=10.5
producto=numuno*numdos
"""dos formas de ponerlo, con la , ya lo cambia a string (str) y deja un espacio y con el + hay que convertirlo a string con str ya que no interpreta que es una cadena por lo que no deja el espacio"""
print("la multiplicacion de los dos números es:", (producto))
print("la multiplicación de los dos números es:"+ str(producto))
print("   fin ejercicio 1")

print("inicio ejercicio 2")

pi=3.1416
radio=10
print("el área del círulo es:",(pi*radio*radio))
"""otra forma"""
area=math.pi*math.pow(radio,2)
area=math.pi*(radio**2)
area=math.pi*(radio^2)
area=math.pi*(radio*radio)



print("   fin ejercicio 2")

print("inicio ejercicio 3")
a=5
b=10
c=15
discriminante=b**2 -4*a*c
if discriminante>0:
    """si no importamos math no funciona la formula"""    
    raizdiscriminante= math.sqrt(discriminante)
    x1 = (-b + raizdiscriminante) / (2 * a) 
    x2 = (-b - raizdiscriminante) / (2 * a)
    print("las soluciones son x1=",x1," y x2=",x2)
elif discriminante==0:
    x = -b / (2 * a)
    print("la solución es x=",x)
else:
    print("No hay solución real debido a que el discriminante es negativo")
print("   fin ejercicio 3")

print("inicio ejercicio 4")
nombre="David"
edad=50
print("Tu nombre es",nombre,"y tu edad",edad,"años")
print("Tu nombre es "+nombre+" y tu edad "+str(edad)+" años")
print("   fin ejercicio 4")
print("inicio ejercicio 5")
"""como me quedo con la parte entera de una division en pythonn
Para obtener la parte entera de una división en Python, puedes utilizar el operador de división entera //. Este operador realiza una división y devuelve el cociente entero, descartando cualquier parte fraccionaria. """
dinero=237.88
centimos=dinero*100
moneda=centimos/200
print("monedas de dos euros: " + str (moneda))
moneda=centimos//200
print("monedas de dos euros: " + str (moneda))
moneda=int(centimos/200)
print("monedas de dos euros: " + str (moneda))
"""es lo mismo al ponerle , ya lo pasa a str y le da un espacio"""
print("monedas de dos euros:" ,moneda)

centimos=centimos-(moneda*200)
moneda=int(centimos/100)
print("monedas de 1 Euro: "+str (moneda))
centimos=centimos-(moneda*100)
moneda=int(centimos/50)
print("monedas de 50 cts "+ str(moneda))
centimos=centimos-(moneda*50)
moneda=int(centimos/20)
print("monedas de 20 cts: "+ str(moneda))
centimos=centimos-(moneda*20)
moneda=int(centimos/10)
print("monedas de 10 cts: "+ str(moneda))
centimos=centimos-(moneda*10)
moneda=int(centimos/5)
print("monedas de 5 cts: "+str(moneda))
centimos=centimos-(moneda*5)
moneda=int(centimos/2)
print("monedas de 2 cts: "+str(moneda))
centimos=centimos-(moneda*2)
print("monedas de 1 cts: "+ str(moneda))
print("   fin ejercicio 5")

print("CONDICIONALES inicio ejercicio 1")
numtres=5
if numtres%2==0:
    print("el número es par")
else:
    print("el número es impar")
print("CONDICIONALES    fin ejercicio 1")

print("CONDICIONALES inicio ejercicio 2")
edaddos=19
if edaddos>=19:
    print("tienes carnet de conducir?")
"""si tiene menos de 18 no le preguntamos nada"""


print("CONDICIONALES    fin ejercicio 2")

print("CONDICIONALES inicio ejercicio 3")
aa=3
bb=5
cc=1
if aa<=bb and aa<=cc:
    menor=aa
elif bb<=aa and bb<=cc:
    menor=bb
else:
    menor=cc
print("el número menor es : "+ str(menor))

print("CONDICIONALES    fin ejercicio 3")

print("CONDICIONALES inicio ejercicio 4")
num1=10
num2=1
num3=5
if num1>=num2 and num1>=num3:
    mas=num1
    if num2>=num3:
        menos=num3
    else:
        menos=num2
elif num2>=num1 and num2>=num3:
    mas=num2
    if num1>=num3:
        menos=num3
    else:
        menos=num1
else:
    mas=num3
    if num2>=num3:
        menos=num3
    else:
        menos=num2
print("el número menor es: "+str(menos)+" y el mayor es :"+str(mas))

print("CONDICIONALES    fin ejercicio 4")

print("CONDICIONALES inicio ejercicio 5")
real=100
otrocaso=0
if real<50:
    cuadrado=pow(real,2)
    print("su cuadrado es "+str(cuadrado))
    otrocaso=otrocaso+1
if real==25 or real==30 or real==75:
    raiz=pow(real,1/3)
    print("la raiz cúbica es : "+str(raiz))
    otrocaso+=1
if real==10 or real>100 or (real>=3 and real<=8) or (real>=77 and real<=90):
    division=real/10
    print("la división entre 10 es : "+str(division))
    otrocaso+=1
if otrocaso==0:
    print("el número introducido es : "+ str(real))


print("CONDICIONALES    fin ejercicio 5")

print("CONDICIONALES inicio ejercicio ")
print("CONDICIONALES    fin ejercicio ")