/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1810;

/**
 *
 * @author alumno
 */
public class Ejercicio {
    
public static void RetornarMayor()
{
    int numerouno=3,numerodos=6,numerotres=9;
    
    if (numerouno>numerodos & numerouno>numerotres)
    {
        System.out.println("el primer numero "+numerouno+ " es el mayor");
    }
    if (numerodos>numerouno & numerodos>numerotres)
    {
        System.out.println("El segundo numero "+numerodos+" es el mayor");
    
    }
    else 
    {
        System.out.println("el tercer numero "+numerotres+" es el mayor");
    
    }








}
    
public static void Fibonacci()
        {       
            
    int fibonacci;
    int actual=1;
    int anterior=0;
    int auxanterior;
    
    for (int contador = 0; contador < 30; contador++) {
        
        fibonacci=anterior+actual;
        
        anterior=actual;
        actual=fibonacci;
        System.out.println("es el " +fibonacci);    
    }
    
        }

/**
 * Recorrer los números del  1 al 100.
 * Mostrar en lugar del número la palabra "UTN" para todos los múltiplos de 3.
 * Mostrar en lugar del número la palabra "FRA" para todos los múltiplos de 5.
 * Mostrar la palabra "UTNFRA" para todos los múltiplos de 3 y 5.
 */

public static void SerieUtnFra()
{
    
    
    for (int contador = 1; contador < 100; contador++) {
        
        
        if (contador%3==0 && contador%5==0){
            
            System.out.println("UTNFRA");
        }
        else if (contador%3==0){
        
            System.out.println("UTN");
        }
        else if (contador%5==0){
        
            System.out.println("FRA");
        }
        
       
        
        System.out.println(contador);
    }



}

/**
 * 153 = 1^3+5^3+3^3= 153
 */
public static void NumeroArmstrong()
{   
    int NumeroIngresado=153;
    int numero=NumeroIngresado;
    int CantidadDeDigitos=0;
    
    if (numero<0)
    {
            numero=numero*-1;
    }
    
    
    
    while(numero>0)
    {
            numero=numero/10;
            CantidadDeDigitos++;
    }
    System.out.println(CantidadDeDigitos);
    
    int Digito;
    int suma=0;
    int AuxNumero=NumeroIngresado;
    while(NumeroIngresado>0){
    Digito=AuxNumero%10;
    suma=suma+(int) Math.pow(Digito, CantidadDeDigitos);
    AuxNumero= AuxNumero/10;
    
    System.out.println(Digito);
    }
    System.out.println(suma);
    
    if (suma==NumeroIngresado)
    {
        System.out.println("Es armstrong");
    
    }else{
    
        System.out.println("no es");
    }
    
}






}
    
    
    
    
    
    
    
    
    
    
    

