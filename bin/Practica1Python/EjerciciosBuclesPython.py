#A partir de este punto empiezan los ejercicios, los nombres de cada método indican a que ejercicio pertenecen.
# Dadle caña y no dudeis en preguntar vuestras dudas :)

def ejercicio1():
    """
    Programa python que printee en pantalla todos los números del 0 al 100, ambos incluídos.
    """    
    print("Inicio ejercicio 1")
    for i in range(1,101,1):
        print (i)
    #Aquí va vuestro código

    print ("Fin ejercicio 1")

def ejercicio2():
    """
    Programa python que printee en pantalla únicamente los números pares que vayan del 0 al 100, ambos incluídos. 
    Recordad que el 0 es un número par. 
    """
    for i in range(0,101,2):
        print(i)

    print("Inicio ejercicio 2")

    #Aquí va vuestro código

    print ("Fin ejercicio 2")

def ejercicio3():
    """
    Programa python que declare dos variables con un valor entero. La función de este programa es ir sumándole a la primera variable a 
    la segunda hasta que el valor de esta primera pase de 100, una vez pase de ese valor printear el valor final en la pantalla.
    """
    a=5
    b=10
    suma=a
    while suma<100:
        suma=suma+b
    print(suma)
    print("Inicio ejercicio 3")
    #Aquí va vuestro código
    print ("Fin ejercicio 3")

def ejercicio4():
    """
    Programa python que declare dos variables enteras, la idea para este proyecto es multiplicar el valor de la primera variable 
    por el de la segunda pero sin usar la multiplicación. Por ejemplo, si queremos hacer la operación 2 * 3 no podemos hacerla tal cual, 
    deberíamos sumar 2 en 3 ocasiones, o sea, 2 + 2 + 2.
    """
   
    print("Inicio ejercicio 4")

    #Aquí va vuestro código
    a=5
    b=10
    resultado=0
    for i in range(1,b+1,1):
        resultado=resultado+a
    print(resultado)
    print ("Fin ejercicio 4")

def ejercicio5():
    """
        Programa que declare dos variables enteras, la idea de este programita es que saque el resultado de la potencia de esos dos valores introducidos 
        aunque no se puede utilizar el operador de la potencia. (Es muy parecido al ejercicio anterior).
    """

    print("Inicio ejercicio 5")

    #Aquí va vuestro código

    print ("Fin ejercicio 5")

def ejercicio6():
    """
        Como último ejercicio, para rizar el rizo vais declarar dos variables enteras y mezclar tanto el ejercicio 4 como el 5, o sea, 
        tenéis que conseguir el resultado de la potencia entre dos números pero sin usar ni el operador de la potencia ni el de la multiplicación, 
        véase, a base de puras sumas y bucles. 
    """

    print("Inicio ejercicio 6")

    #Aquí va vuestro código

    print ("Fin ejercicio 6")


#Método principal, comentad usando # los métodos que no queréis que se ejecuten
if __name__ == '__main__':
    ejercicio1()
    ejercicio2()
    ejercicio3()
    ejercicio4()
    ejercicio5()
    ejercicio6()
