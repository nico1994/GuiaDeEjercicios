/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaejercicios;

import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class GuiaWhile {
    
public static void Ejercicio36()
{
    
   Integer Contador=0;
   
   while (Contador<100)
   {
       Contador++;
   if (Contador%2==0)
   {
       System.out.println("Es par :"+Contador);
   
   }
   
   }


}
 

public static void Ejercicio37()
{
    Integer Contador=0;
    
    while (Contador<100)
    {
        Contador++;
        
    if (Contador%2!=0)
    {
        System.out.println("Es Impar :"+Contador);
    
    
    }
    }



}


public static void Ejercicio38()
{
    Integer Contador=0;
    Integer Suma=0;
    Integer Numero=0;
    
    while (Contador<100)
    {
        Numero++;
        Suma = Suma + Numero;
        Contador++;
    }

    System.out.println("El total de la suma de los primeros 100 num nat es: "+Suma);


} 
        

public static void Ejercicio39()
{
    Scanner MiTeclado= new Scanner(System.in);
    String Aux;
    Integer Contador=0;
    Integer Pares=0;
    Integer NumeroIngresado;
    while (Contador<10)
    {
        Contador++;
        System.out.println("Ingrese un número: ");
        Aux= MiTeclado.next();
        NumeroIngresado= Integer.parseInt(Aux);
        
    if (NumeroIngresado%2==0)
    {
        Pares++;
    
    }
    }

    System.out.println("La cantidad de num pares ingresados son: "+Pares );


}


public static void Ejercicio40()
{
   Scanner MiTeclado= new Scanner(System.in);
    String Aux;
    Integer Contador=0;
    Integer NumeroIngresado;
    Integer Negativo=0;
    Integer Cero=0;
    Integer Positivo=0;
    
    while (Contador<10)
    {
        Contador++;
        System.out.println("Ingrese un número: ");
        Aux= MiTeclado.next();
        NumeroIngresado= Integer.parseInt(Aux);
        
    if (NumeroIngresado==0)
    {
        Cero++;}
    else 
    { if (NumeroIngresado>0)
        
            Positivo++;
        else
        
        {   Negativo++;
                
                }}}
        
     System.out.println("Cantidad de numeros cero : "+Cero);
     System.out.println("Cantidad de positivos : "+Positivo);
     System.out.println("Cantidad de negativos : "+Negativo);
     

}

public static void Ejercicio41()
{
    Scanner MiTeclado= new Scanner(System.in);
    
    
    Integer NumeroIngresado;
    
    System.out.println("Ingrese un número : ");
    NumeroIngresado= MiTeclado.nextInt();
    
    while (0<NumeroIngresado)
    {
        NumeroIngresado--;
        System.out.println("Numeros: "+NumeroIngresado);
    
    }


}


public static void Ejercicio42()
{
    String Respuesta;
    String Color;
    int Rojos=0;
    int Azules=0;
    int TotalVehiculos=0;
    
    Scanner MiTeclado= new Scanner(System.in);
    
    System.out.println("Desea ingresar un vehiculo?");
    Respuesta= MiTeclado.next();
    
    while (Respuesta.equals("si") )
    {
        System.out.println("Ingrese color: ");
        Color= MiTeclado.next();
        
    if (Color.equals("rojo"))
    
        Rojos++;
    else
    {
         Azules++;   
            
            }
    
    TotalVehiculos= Rojos+Azules;
    
    System.out.println("Desea ingresar otro vehiculo?");
    Respuesta= MiTeclado.next();}
    
    System.out.println("Total de autos: "+TotalVehiculos);
    System.out.println("Total de autos rojos:  "+Rojos);
    System.out.println("Total de autos azules :  "+Azules);
    } 
    
    }    
    

   




    
    
    
    
    
























