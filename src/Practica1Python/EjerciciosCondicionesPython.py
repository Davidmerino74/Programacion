#A partir de este punto empiezan los ejercicios, los nombres de cada método indican a que ejercicio pertenecen.
# Dadle caña y no dudeis en preguntar vuestras dudas :)

def ejercicio1():
    """
    Programa python que declare una variable A de tipo entero y asígnale un valor. A continuación muestra  un mensaje indicando si A es par o impar. Utiliza el operador condicional ( ? : ) dentro del println 
    para resolverlo.
    """

    print("Inicio ejercicio 1")

    #Aquí va vuestro código
    A=11
    print("es par" if A%2==0 else "es impar")

    print ("Fin ejercicio 1")

def ejercicio2():
    """
    Programa python que declare una variable B de tipo entero y asígnale un valor. A continuación muestra un  mensaje indicando si el valor de B es positivo o negativo. Consideraremos el 0 como positivo. 
    Utiliza el operador condicional (? : ) dentro del println para resolverlo.
    """

    print("Inicio ejercicio 2")

    #Aquí va vuestro código
    B=-10
    print("es positivo" if B>=0 else "es negativo")
    if (b<=0):
        print("es positivo")
    else:
        print("es negativo")

    print ("Fin ejercicio 2")

def ejercicio3():
    """
    Programa python que declare una variable C de tipo entero y asígnale un valor. A continuación muestra un mensaje indicando si el valor de C es positivo o negativo, si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que 100. Consideraremos el 0 como positivo. Utiliza el operador condicional ( ? : ) dentro del println para resolverlo. 
    """

    print("Inicio ejercicio 3")

    #Aquí va vuestro código
    c=10
    print(("es positivo" if c>=0 else "es negativo") + 
          (", es par" if c%2==0 else ", es impar") +
          (", es multiplo de 5" if c%5==0 else "")+ 
          (", es multiplo de 10" if c%10==0 else "") + 
          (", es mayor que 100" if c>100 else ", es menor que 100"))



    print ("Fin ejercicio 3")

def ejercicio4():
    """
    Programa python que declare una variable numérica de 8 cifras. La idea de este programa es calcular la letra del DNI asociada a esos ocho números, para ello vais a tener que seguir el pequeño tutorial de la siguiente página: 
    https://www.interior.gob.es/opencms/es/servicios-al-ciudadano/tramites-y-gestiones/dni/calculo-del-digito-de-control-del-nif-nie/

    Se divide el número entre 23 y el resto se sustituye por una letra que se determina por inspección mediante la siguiente tabla:

            RESTO	0	1	2	3	4	5	6	7	8	9	10	11
            LETRA	T	R	W	A	G	M	Y	F	P	D	X	B
            

            RESTO	12	13	14	15	16	17	18	19	20	21	22
            LETRA	N	J	Z	S	Q	V	H	L	C	K	E
    """

    print("Inicio ejercicio 4")

    #Aquí va vuestro código
    NUM=30670769
    a=NUM%23
    print("la letra del dni es: ")
    if a == 0:
        print("T")
    elif a == 1:
        print("R")
    elif a == 2:
        print("W")
    elif a == 3:
        print("A")
    elif a == 4:
        print("G")
    elif a == 5:
        print("M")
    elif a == 6:
        print("Y")
    elif a == 7:
        print("F")
    elif a == 8:
        print("P")
    elif a == 9:
        print("D")
    elif a == 10:
        print("X")
    elif a == 11:
        print("B")
    elif a == 12:
        print("N")
    elif a == 13:
        print("J")
    elif a == 14:
        print("Z")
    elif a == 15:
        print("S")
    elif a == 16:
        print("Q")
    elif a == 17:
        print("V")
    elif a == 18:
        print("H")
    elif a == 19:
        print("L")
    elif a == 20:
        print("C")
    elif a == 21:
        print("K")
    elif a == 22:
        print("E")
    else:
        print("número introducido incorrecto")

    
    print ("Fin ejercicio 4")

def ejercicio5():
    """
    Programa python que declare una variable entera y asignale un valor que vaya del 1 al 10. A continuación desarrolla un programa que printee ese número pero con palabras, por ejemplo si le asignas el valor número 7 el programa debería printear Siete.
    """

    print("Inicio ejercicio 5")

    #Aquí va vuestro código
    a = 10

    if a == 1:
        print("uno")
    elif a == 2:
        print("dos")
    elif a == 3:
        print("tres")
    elif a == 4:
        print("cuatro")
    elif a == 5:
        print("cinco")
    elif a == 6:
        print("seis")
    elif a == 7:
        print("siete")
    elif a == 8:
        print("ocho")
    elif a == 9:
        print("nueve")
    elif a == 10:
        print("diez")
    else:
        print("Valor no válido")

    print ("Fin ejercicio 5")

def ejercicio6():
    """
    Programa python que declare dos variables de tipo entero y asignales un valor. A continuación indica vía println si el primer número es mayor, menor o los dos números son iguales. 
    """

    print("Inicio ejercicio 6")

    #Aquí va vuestro código
    a=100
    b=100
    print("a es mayor que b" if a>b else
        "b es mayor que a" if b>a else "los dos números son iguales")

    print ("Fin ejercicio 6")


#Método principal, comentad usando # los métodos que no queréis que se ejecuten
if __name__ == '__main__':
    ejercicio1()
    ejercicio2()
    ejercicio3()
    ejercicio4()
    ejercicio5()
    ejercicio6()
