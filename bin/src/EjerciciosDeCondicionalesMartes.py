print("inicio ejercicio 1")
num1=31
num2=31
if (num1>num2):
    print("el número mayor es el "+ str(num1))
elif (num2<num2):
    print("el número mayor es el "+ str(num2))
else:
    print("los dos números son iguales")
print("   fin ejercicio 1")

print("inicio ejercicio 2")
numa=10
numb=3
if (numb==0):
    print("el segundo número es cero")  
else:
    div=numa/numb
    print("el resultado de la división es "+ str(div))                                       

print("   fin ejercicio 2")

print("inicio ejercicio 3")
a=1
b=2
c=4
if (a+b<=c) or (a+c<=b) or (b+c<=a):
    print("No se puede hacer un triángulo con las medidas que has proporcionado")
elif (a==b==c):
    print("Triángulo Equilatero")
elif (a!=b and a!=c and b!=c):
    print("Triángulo Escaleno")
elif (a==b or a==c or b==c):
    print("Triángulo Isósceles")
elif (a**2 + b**2 == c**2) or (a**2 + c**2 == b**2) or (b**2 + c**2 == a**2):
    print("Triángulo Rectángulo")
else:
    print("Los datos introducidos no son válidos")


print("   fin ejercicio 3")

print("inicio ejercicio 4")
anio=1987
if anio%4==0:
    print("El año es bisiesto")
else:
    print("El año no es bisiesto")

print("   fin ejercicio 4")

print("inicio ejercicio 5")
dia=8
if dia==1:
    print("Es lunes")
elif dia==2:
    print("Es martes")
elif dia==3:
    print("Es miércoles")
elif dia==4:
    print("Es jueves")
elif dia==5:
    print("El viernes")
elif dia==6:
    print("Es sábado")
elif dia==7:
    print("Es domingo")
else:
    print("El número introducido no esta entre el 1 y el 7")

print("   fin ejercicio 5")

print("inicio ejercicio 6")
mes=13
if mes==2:
    print("Tiene 28 días")
elif mes==1 or mes==3 or mes==5 or mes==7 or mes==8 or mes==10 or mes==12:
    print("Tiene 31 días")
elif mes==2 or mes==4 or mes==6 or mes==9 or mes==11:
    print("Tiene 30 días")
else:
    print("no has indicado un número entre 1 y 12")


print("   fin ejercicio 6")

print("inicio ejercicio 7")
aa=7
bb=5
cc=3
"""
num1 =9
num2 =50
num3= 8
if num1>num2:
    num1,num2=num2,num1
if num2>num3:
    num2,num3=num3,num2
if num1>num2:
    num1,num2=num2,num1    
    print("EL ORDEN ES :{NUM1}, {NUM2},{NUM3})
"""
if (aa>=bb and aa>=cc):
    mayor=aa
    if (bb>=cc):
        medio=bb
        menor=cc
    else:
        medio=cc
        menor=bb            
elif(bb>=aa and bb>=cc):
    mayor=bb
    if (aa>=cc):
        medio=aa
        menor=cc
    else:
        medio=cc
        menor=aa            
else:
    mayor=cc
    if (bb>=aa):
        medio=bb
        menor=aa
    else:
        medio=aa
        menor=bb
print("Lo números ordenados son :"+ str(menor)+","+str(medio)+","+str(mayor))


print("   fin ejercicio 7")

print("inicio ejercicio 8")
numdado=10
resultado=numdado*9
print(resultado)
print("   fin ejercicio 8")

print("inicio ejercicio 9")
nota1=5.3
nota2=5.5
nota3=8
nota4=7
medianota=(nota1+nota2+nota3+nota4)/4
print("la nota media es :"+str(medianota))
if (medianota>=5):
    print("Aprobado")
else:
    print("Suspendido")

print("   fin ejercicio 9")

print("inicio ejercicio ")
print("   fin ejercicio ")

print("inicio ejercicio ")
print("   fin ejercicio ")

print("inicio ejercicio ")
print("   fin ejercicio ")