/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofor;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class FuncionesParaFor {
    
    
    
public static void MostrarNumeroCreciente()
{
    //igual al while
    // for (inic variable;true o false; ++)
    int contador;
    for (contador=0; contador <100; contador++)
    {
        System.out.println("el numero es : "+ contador);
       
    }
}
  

public static void MostrarNumerosDecrecientes()
{
    for (int contador=100; contador>0;contador--)
    {
        System.out.println("el numero es : "+contador);
    
    }
    
            





}

public static void MostrarNumerosPares()
{
    for (int contador = 0; contador < 100; contador++) {
       if (contador%2==0)
       {
           System.out.println("pares : "+contador);
       
       }
    }


}


public static void MostrarNumerosDivisiblesPorSeis()
{
    
            for (int contador = 0,Pares; contador <100; contador++) {
        
               
    }


}  


public static void MostrarTablaDeMultiplicar()
{
    Scanner misc= new Scanner(System.in);
    int numero;
    int resultado;
    
    System.out.println("Ingrese un numero entre 0 y 20");
    numero= misc.nextInt();
     
   
   
    for (int contador = 1; contador < 11; contador++) {
        resultado=  contador*numero;
        //System.out.println("resultado" +resultado);
        System.out.println(numero+"*"+contador+"="+resultado);    
    }
       
       
       System.out.println("Ingrese un numero entre 0 y 20");
        numero= misc.nextInt();
}
        
        
public static void MostrarTablaDeDividir()
{
    Scanner misc = new Scanner(System.in);
    int numero;
    float resultado;
    String aux;
    System.out.println("Ingrese un numero entre 0 y 20");
    numero= misc.nextInt();
     
   
   
    for (int contador = 1; contador < 11; contador++) {
        resultado=  numero/contador;
        //System.out.println("resultado" +resultado);
        System.out.println(numero+"/"+contador+"="+resultado);    
    }
       
       
       System.out.println("Ingrese un numero entre 0 y 20");
        numero= misc.nextInt();







}        


public static void Ejercicio46()
{
    Scanner misc= new Scanner(System.in);
    int numero=5;
    int contador;
    String bandera="no";
    //o sino con boolean
    boolean banderas=true;
    
       for (contador = 2; contador < numero; contador++) 
           {
               if (numero%contador==0)
               { banderas=false;
                   break;
                }}
      
       if (banderas==false)
       {
           System.out.println("no es primo");
           
       }
       else 
       {
           System.out.println("es primo");
       
       }}
       
       
       /*
       if (bandera.equals("si"))
       {
           System.out.println("no es primo");
       }
           else 
           
           {
               System.out.println("es un num primo");   
                   }
           
           
       }}
     /*if (contador == numero)
       {
           System.out.println("es primo");
       
       }else 
           System.out.println("no es primo");
           
}*/

public static void MostrarNumerosPrimos()
{
    int contador=99;
    int primos=0;
    
        for (contador =99; contador < 100; contador--) {
        
        if (contador%2==0)
        {
        
        }
        else
        {
            primos++;
            System.out.println("num primo"+primos);
        
        }
        
    }
    



}


public static void CentroNumerico()
{
   /* int numero=6;
    int SumaAnteriores=0;
    int SumaPosteriores=0;
    boolean EsCentroNumerico=false;
    for (int contador = 1; contador < numero; contador++) {
        
        SumaAnteriores= SumaAnteriores+contador;
        
    }
    //System.out.println(SumaAnteriores);
    
    for (int posterior = numero+1; ; posterior++) {
       
        SumaPosteriores=SumaPosteriores+posterior;
        if (SumaAnteriores==SumaPosteriores)
        {
            EsCentroNumerico=true;
            break;
        }
        if (SumaPosteriores>SumaAnteriores)
        {
            break;
        }
        
    }
    
    if (EsCentroNumerico)
    {
        System.out.println("es centro numerico "+numero);
    }else 
    {
        System.out.println("No es.");
    
    }
   */
    
    int numero;
    int SumaAnteriores=0;
    int SumaPosteriores=0;
    boolean EsCentroNumerico=false;
    
       
   
    //System.out.println(SumaAnteriores);
    
    for (numero = 0; numero < 1000; numero++) {
        SumaAnteriores=0;
        SumaPosteriores=0;
        EsCentroNumerico=false;
        
          for (int posterior = numero+1; ; posterior++) {
       
           SumaPosteriores=SumaPosteriores+posterior;
          if (SumaAnteriores==SumaPosteriores)
          {
            EsCentroNumerico=true;
            
            
            break;
           }
        if (SumaPosteriores>SumaAnteriores)
        {
            break;
        }
        
       if (EsCentroNumerico)
       {
           System.out.println("Es centro numerico");
      }else
       {
           System.out.println("no es");
       
       }
    }
    }
numero++;}
    
    
public static void FibonacciSucesion()
{
    int numero=1;
    int suma=1;
    int anterior=1;
    int fibonacci=0;
    int auxanterior;
    
    for (int contador = 1; contador < 10; contador++) {
        auxanterior=fibonacci;
        fibonacci=suma+anterior;
        anterior=fibonacci;
        System.out.println("serie"+fibonacci);
        
    }
    


}
 
   

}







    
