/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplowhile;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploWhile {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        
    //EjemploWhile.PromedioConIf();
    EjemploWhile.PedirNumeros();
    }//finaliza el main
    
    /**
     * Pide dos numeros e informa el promedio
     */
    public static void PromedioConIf()
    {
        Scanner MiTeclado= new Scanner(System.in);
        Integer NumeroUno,NumeroDos,Promedio;
        String Aux;
        
        System.out.println("Ingrese un número: ");
        Aux=MiTeclado.next();
        NumeroUno=Integer.parseInt(Aux);
        
        System.out.println("Ingrese otro número: ");
        Aux=MiTeclado.next();
        NumeroDos=Integer.parseInt(Aux);
        
        Promedio= (NumeroUno+NumeroDos)/2;
        System.out.println("El promedio es "+Promedio);
        
            }//Finaliza promedio con if
    
    /**
     * Pido dos numero e informo el promedio
     */
    public static void PromedioConWhile()
    { 
        Scanner MiTeclado= new Scanner(System.in);
        Integer Numero,Promedio,Contador=0,Suma=0;
        String Aux;
        
        while (Contador<2)
        {   
            Contador++;
            System.out.println("Ingrese número: ");    
            Aux=MiTeclado.next();
            Numero=Integer.parseInt(Aux);
            Suma= Numero+Suma;
        }
        
        Promedio= (Suma/Contador);
        System.out.println("El promedio es "+Promedio);
        
        
        
        
    
    }//Finaliza promedio con while
    
    
    /**
     * Cuando no sabemos la cantidad de iteraciones
     */
    public static void IteracionSinCantidad()
    {
    String Continuar="si";
    
    while(!Continuar.equals("no"))
    {
        System.out.println("Hola,¿desea continuar?");
        Scanner MiTeclado= new Scanner(System.in);
        Continuar= MiTeclado.next();
    
    }
        
        
    }
    
    public static void SalidaPorLogica() //igual al iteracion sin cantidad,diferente logica.
    {
        String Continuar="si";
        while(true)
        {
            System.out.println("Hola, desea continuar?");         
            Scanner MiTeclado= new Scanner(System.in);
            Continuar=MiTeclado.next();
            if (Continuar.equals("no"))
            {
            break;
            }
        }    
    
    }
    
    
    /**
     * 
     */
    public static void PedirNumeros()
    {
        Integer Numero,Contador=0,Suma=0;
        String Aux;
        Scanner MiTeclado= new Scanner(System.in);
        
        while(Contador<10 && Suma<50)
        {
            Contador++;
            System.out.println("Ingrese número "+Contador+":");
            Aux= MiTeclado.next();
            Numero= Integer.parseInt(Aux);
            Suma=Suma+Numero;
            
            /*if (Suma>50)
            {
                break;
            }*/
            
          }
        System.out.println("La suma es "+Suma);
        System.out.println("La cantidad es "+Contador);
        
    }
    
    
 
    
}
