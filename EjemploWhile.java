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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //EjemploWhile.PromedioConIf();
    EjemploWhile.TomarDatosValidados();
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
    
    
    /**
     * Pide los datos de una persona y valida cada uno
     * datos a pedir:
    nombre,edad(entre 1 y 100),sexo(f o m),estado civil(s c d v), nacionalidad
    (N,E,L,EURO,R)
    Sueldo (entre 8000 y 58000)
    Donar organos (Si o No)
    * clave de no menos de 6 caracteres
   
    */
    public static void TomarDatosValidados()
    {
        Scanner MiTeclado= new Scanner(System.in);
        String Aux;
        String Nombre,Sexo,EstadoCivil,Nacionalidad,Donador,Clave;
        Integer Edad,Sueldo;
        
        System.out.println("¿Cuál es su nombre?");
        Nombre= MiTeclado.next();
        
        System.out.println("Indique su edad : ");
        Aux= MiTeclado.next();
        Edad= Integer.parseInt(Aux);
        
        while (Edad<1 || Edad>100)
        {
            System.out.println("Ingrese su edad nuevamente: ");
            Aux= MiTeclado.next();
            Edad= Integer.parseInt(Aux);}
        
        
        System.out.println("Indique sexo : ");
        Sexo= MiTeclado.next();
            
        while (!Sexo.equals("masculino") && !Sexo.equals("femenino") )
         { System.out.println("Ingrese su sexo nuevamente: ");
             Sexo= MiTeclado.next();}
             
           
            System.out.println("Estado civil?");
            EstadoCivil= MiTeclado.next();
            
        while (!EstadoCivil.equals("casado") && !EstadoCivil.equals("divorciado") &&
                    !EstadoCivil.equals("soltero") && !EstadoCivil.equals("viudo"))
            
                { System.out.println("Ingrese su estado civil nuevamente: ");
                  EstadoCivil= MiTeclado.next();}
            
            System.out.println("Nacionalidad? ");
            Nacionalidad= MiTeclado.next();
            
        while (!Nacionalidad.equals("nativo")&& !Nacionalidad.equals("europeo")
                  &&  !Nacionalidad.equals("extranjero") && !Nacionalidad.equals("resto del mundo")
                  &&  !Nacionalidad.equals("latinoamericano"))
                {
                System.out.println("Ingrese su nacionalidad nuevamente: ");
                Nacionalidad= MiTeclado.next();}
            
            System.out.println("Ingrese su sueldo: ");
            Aux= MiTeclado.next();
            Sueldo= Integer.parseInt(Aux);
               
        while (!(Sueldo>8000 && Sueldo<58000))
               {
                System.out.println("Ingrese su sueldo nuevamente :");
                Aux= MiTeclado.next();
                Sueldo= Integer.parseInt(Aux);}
                   
            System.out.println("¿Donar organos? ");
            Donador= MiTeclado.next();
               
        while (!Donador.equals("si") && !Donador.equals("no"))
               {
                System.out.println("Ingrese nuevamente (si o no)");
                Donador= MiTeclado.next();}
              
            System.out.println("Ingrese una clave de no menos de 6 caracteres:");
            Clave= MiTeclado.next();
               
        while (!Clave.equals("123456"))
               {
                System.out.println("Ingrese clave nuevamente: ");
                Clave=MiTeclado.next();}
               
              
               
               
               
               
               
               System.out.println("Su nombre es: "+Nombre);
               System.out.println("Su edad es: "+Edad);
               System.out.println("Su sexo es: "+Sexo);
               System.out.println("Su Estado Civil es: "+EstadoCivil);
               System.out.println("Su nacionalidad es: "+Nacionalidad);
               System.out.println("Su sueldo es: "+Sueldo);   
               System.out.println("Dona organos: "+Donador);
               
               }
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    

