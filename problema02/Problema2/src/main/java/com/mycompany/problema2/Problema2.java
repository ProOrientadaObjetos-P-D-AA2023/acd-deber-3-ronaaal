/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema2;

import java.util.Scanner;

/**
 *
 * @author Ronal
 */
public class Problema2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Empleado[] empleados = new Empleado[10]; // Tamaño del arreglo es 10
        
        int contadorEmpleados = 0;
        
        boolean salir = false;

        while (!salir) {
            
            System.out.println("\n--- GESTIÓN DE EMPLEADOS ---");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar información de los empleados");
            System.out.println("3. Calcular aumento de salario");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            
            scanner.nextLine(); // Consumir salto de línea

            switch (opcion) {
                
                case 1:
                    
                    if (contadorEmpleados < empleados.length) {
                        System.out.print("Ingrese el nombre del empleado: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese el salario del empleado: ");
                        double salario = scanner.nextDouble();
                        System.out.print("Ingrese la edad del empleado: ");
                        int edad = scanner.nextInt();
                        
                        Empleado empleado = new Empleado(nombre, salario, edad);
                        empleados[contadorEmpleados] = empleado;
                        contadorEmpleados++;
                        
                        System.out.println("El empleado ha sido agregado correctamente.");
                    } else {
                        System.out.println("No se pueden agregar más empleados. El límite ha sido alcanzado.");
                    }
                    break;
                    
                case 2:
                    
                    System.out.println("\n--- INFORMACIÓN DE LOS EMPLEADOS ---");
                    
                    for (int i = 0; i < contadorEmpleados; i++) {
                        System.out.println(empleados[i].toString());
                    }
                    break;
                    
                case 3:
                    
                    System.out.print("Ingrese el porcentaje de aumento salarial: ");
                    double porcentajeAumento = scanner.nextDouble();
                    double sumaSalarios = 0;
                    
                    for (int i = 0; i < contadorEmpleados; i++) {
                        sumaSalarios += empleados[i].getSalario();
                    }
                    
                    double promedioSalarios = sumaSalarios / contadorEmpleados;
                    System.out.println("\n--- AUMENTO DE SALARIO ---");
                    
                    for (int i = 0; i < contadorEmpleados; i++) {
                        
                        if (empleados[i].getSalario() < promedioSalarios) {
                            
                            double aumento = empleados[i].getSalario() * (porcentajeAumento / 100);
                            empleados[i].aumentarSalario(aumento);
                            System.out.println("Nuevo salario de " + empleados[i].getNombre() + ": $" + empleados[i].getSalario());
                        }
                    }
                    break;
                    
                case 4:
                    
                    salir = true;
                    break;
                    
                default:
                    
                    System.out.println("Opción inválida, inténtelo de nuevo.");
                    break;
            }
        }
    }
}

