#A partir de este punto empiezan los ejercicios, los nombres de cada método indican a que ejercicio pertenecen.
# Dadle caña y no dudeis en preguntar vuestras dudas :)

def ejercicio1():
    """
    Programa python que realice lo siguiente: declarar una variable N de tipo int, 
    una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor. 
    A continuación muestra por pantalla: El valor de cada variable, la suma de N + A, 
    la diferencia de A - N, el valor numérico correspondiente al carácter que contiene la variable C.
    """

    print("Inicio ejercicio 1")

    #Aquí va vuestro código
    N=10
    A=10.5
    C='C'
    print("el valor de N es : ",N)
    print("el valor de A es : ",A)
    print("el valor de C es : ",C)
    print("la suma de N+A es : ",(N+A))
    print("la resta de A-N es : ",(A-N))   
    numVal=ord(C) 
    print("el código ascii de C es : "+str(numVal))


    print ("Fin ejercicio 1")

def ejercicio2():
    """
    Programa python que realice lo siguiente: declarar dos variables X e Y de tipo int, 
    dos variables N y M de tipo double y asigna a cada una un valor. A continuación reliza 
    y muestra por pantalla una serie de operaciones entre ellas.
    """

    print("Inicio ejercicio 2")

    #Aquí va vuestro código
    x=10
    y=20
    n=10.5
    m=20.5
    print("la suma de x + y es : ",(x+y))
    print("la resta de x - y es : ",(x-y))
    print("la multiplicación de n * m es : ",(n*m))
    print("la división de n entre m es : ",(n/m))

    #otra forma mirar la diferencia entre + y , a la hora de printear
    print("operación1: " +str(x*y))
    print("operacion2 : " +str(n/m))
    print("operación3 : " +str(y+m))

    print ("Fin ejercicio 2")

def ejercicio3():
    """
    Programa python que declare una variable entera N y asígnale un valor. A continuación escribe 
    las instrucciones que realicen lo siguiente: Incrementar N en 77, Decrementarla en 3, Duplicar su valor.
    """

    print("Inicio ejercicio 3")

    #Aquí va vuestro código
    n=10
    print("el número más 77 es : ",(n+77))
    print("el número menos 3 es : ",(n-3))
    print("el doble de su valor es : ",(n*2))

    #otra forma se puede poner o , str(n+77) o también + str(n+77)
    print("El número incrementado es ", str(n+77))
    print("El número decrementado es ", str(n-3))
    print("El número duplicado es ",str(n+2))

    print ("Fin ejercicio 3")

def ejercicio4():
    """
    Programa python que declare cuatro variables enteras A, B, C y D y asígnale un valor acada una.
    A continuación realiza las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, 
    A tome el valor de D, D tome el valor de B. 
    """

    print("Inicio ejercicio 4")

    #Aquí va vuestro código
    a=10
    b=20
    c=30
    d=40
    intermedia=b
    b=c
    c=a
    a=d
    d=intermedia
    print("el valor de a es : ",a)
    print("el valor de b es : ",b)
    print("el valor de c es : ",c)
    print("el valor de d es : ",d)

    print("el valor de a es : "+str(a))
    print("el valor de b es : "+str(b))
    print("el valor de c es : "+str(c))
    print("el valor de d es : "+str(d))

    print ("Fin ejercicio 4")

def ejercicio5():
    """
    Programa python que declare dos variables enteras a y b y asignales un valor a cada una. 
    A continuación printea los valores asignados a cada valor y después intercambia los valores 
    de las variables entre ellos para volver a printear los valores correspondientes.
    """

    print("Inicio ejercicio 5")

    #Aquí va vuestro código
    a=10
    b=20
    intermedia=b
    print("el valor de a es : ",a)
    print("el valor de b es : ",b)
    print(a)
    print(b)
    b=a
    a=intermedia
    print("el valor de a es : ",a)
    print("el valor de b es : ",b)
    print(a)
    print(b)
    
    

    print ("Fin ejercicio 5")

def ejercicio6():
    """
    Programa python que declare dos variables enteras a y b y asignales un valor a cada una. 
    A continuación printea los valores asignados a cada valor y después intercambia los valores de las variables entre ellos, 
    al nuevo valor de la variable a multiplícalo por el nuevo valor de la variable b y, después, al nuevo valor de la variable 
    b restale el nuevo valor de la variable a, el valor posterior a la multiplicación (no entiendo esta última frase). En la terminal printea los valores intercambiados 
    y los posteriores a las operaciones.
    """

    print("Inicio ejercicio 6")

    #Aquí va vuestro código
    a=10
    b=20
    intermedia=b
    print("el valor de a es:",a)
    print("el valor de b es:",b)
    b=a
    a=intermedia
    print("el valor de a es:",a)
    print("el valor de b es:",b)
    print("la multiplicación de las dos variables es ;",(a*b))
    print(" la resta de b menos a es : ",(b-a))

    

    print ("Fin ejercicio 6")


#Método principal, comentad usando # los métodos que no queréis que se ejecuten
if __name__ == '__main__':
    ejercicio1()
    ejercicio2()
    ejercicio3()
    ejercicio4()
    ejercicio5()
    ejercicio6()
