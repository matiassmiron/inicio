package com.techlab.inicio;

import java.util.Scanner;

public class Ejercicio2 {
//     Variables y Operadores:
//     Creá variables para representar el precio de un producto y la cantidad deseada por el cliente. Calculá y mostrale en pantalla el costo total.
//     Modificá el precio o la cantidad y verificá el resultado.
//     Entrada y Salida de Datos:
// Pedile al usuario que ingrese su nombre y la cantidad de productos que quiere comprar.
// Mostrá un mensaje personalizado con el monto total (asignando un precio fijo por unidad).
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola "+ nombre);
        
        int precioProducto = 200;

        System.out.println("Ingrese la cantidad de productos que desea comprar: ");
        int cantidadProducto = Integer.parseInt(scanner.nextLine());
        System.out.println("El monto total es: " + cantidadProducto * precioProducto);

        if (cantidadProducto > 100) {
            System.out.println(nombre + ": ¡Le ofrecemos un descuento especial!");
        }else{
            System.out.println(nombre + ": El monto total es: " + cantidadProducto * precioProducto);
        }
        System.out.println(nombre + ": Ingrese un numero desde el 1: ");
        int numero = scanner.nextInt();
         for(int i = 1; i <= numero; i++){
            System.out.println(i);
         }
         System.out.println(nombre + ": Ingrese un numero desde el 1: ");
         int numero2 = scanner.nextInt();
         int aux = 1;
         while( aux <= numero2){
            System.out.println(aux);
            aux++;
         }
    }
    }

}

