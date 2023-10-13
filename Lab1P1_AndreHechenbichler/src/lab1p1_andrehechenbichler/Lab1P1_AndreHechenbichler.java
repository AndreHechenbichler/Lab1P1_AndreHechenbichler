/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p1_andrehechenbichler;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Lab1P1_AndreHechenbichler {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int numero=2;
        char character='a';
        double doble=1.25;
        boolean VoF=true;
        
        System.out.println("Elija el ejercicio");
        numero = scanner.nextInt();
        
        if(numero==1){
            int num1 =15;
            int num2 =30;
            int resultado;
            resultado=15*30;
            System.out.print("Resultado:");
            System.out.println(resultado);
            
        }else if(numero==2){
            System.out.println("ingrese un numro entero:");
            int numeroUsuario = scanner.nextInt();
            System.out.println("ingrese un numro entero:");
            int numeroUsuario2 = scanner.nextInt();
            System.out.println("ingrese un numro entero:");
            int numeroUsuario3 = scanner.nextInt();
            
            double promedio  = (numeroUsuario+numeroUsuario2+numeroUsuario3)/3;
            System.out.println("Promedio:"+ promedio);
        }else{
            System.out.println("salio del programa.");
        }
        
        }
    
}
