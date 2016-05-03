/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Gestion 
{
    private Cartera vehiculos;
    
    public Gestion()
    {
        vehiculos = new Cartera();
    }
    
    private void mostrar(String cadena)
    {
        System.out.print(cadena);
    }
    
    private int escribir_entero()
    {
        Scanner read = new Scanner (System.in);
        int escribir = read.nextInt();
        return escribir;
    }
    
    private double escribir_double()
    {
        Scanner read = new Scanner (System.in);
        double escribir = read.nextDouble();
        return escribir;
    }
    
    private String escribir_cadena()
    {
        Scanner read = new Scanner (System.in);
        String escribir = read.nextLine();
        return escribir;
    }
    
    public void menu_alta()
    {
        mostrar("\n-------------------------------------------\n");
        mostrar("             TIPO DE VEHICULO:     \n");
        mostrar("-------------------------------------------\n");
        mostrar("1 - COCHE\n");
        mostrar("2 - CAMIÓN\n");
        mostrar("3 - MOTOCICLETA\n");
        mostrar("4 - MOTO DE AGUA\n");
    }
    
    public void mostrar_menu()
    {
        mostrar("\n-------------------------------------------\n");
        mostrar("    CARTERA DE VEHICULOS - ASEGURADORA     \n");
        mostrar("-------------------------------------------\n");
        mostrar("1 - ALTA DE VEHICULO\n");
        mostrar("2 - MOSTRAR CARTERA\n");
        mostrar("3 - MOSTRAR MOTOS\n");
        mostrar("4 - MOSTRAR INFORMACIÓN DE VEHICULO\n");
        mostrar("-------------------------------------------\n");
        mostrar("0 - SALIR\n");
        mostrar("-------------------------------------------\n");
    }
    
    private void insertar_coche(Vehiculo V)
    {
        mostrar("MATRICULA: ");
        String matricula = escribir_cadena();
        mostrar("PROPIETARIO: ");
        String propietario = escribir_cadena();
        mostrar("MARCA: ");
        String marca = escribir_cadena();
        mostrar("PRECIO: ");
        double precio = escribir_double();
        mostrar("PLAZAS: ");
        int plazas = escribir_entero();
        V = new Coche(matricula,propietario,marca,precio,plazas);
        vehiculos.colocar(V);
    }
    
    private void insertar_camion(Vehiculo V)
    {
        mostrar("MATRICULA: ");
        String matricula = escribir_cadena();
        mostrar("PROPIETARIO: ");
        String propietario = escribir_cadena();
        mostrar("MARCA: ");
        String marca = escribir_cadena();
        mostrar("PRECIO: ");
        double precio = escribir_double();
        mostrar("CARGA MAXIMA: ");
        int carga = escribir_entero();
        V = new Camion(matricula,propietario,marca,precio,carga);
        vehiculos.colocar(V);
    }
    
    private void insertar_moto_tierra(Vehiculo V)
    {
        mostrar("MATRICULA: ");
        String matricula = escribir_cadena();
        mostrar("PROPIETARIO: ");
        String propietario = escribir_cadena();
        mostrar("MARCA: ");
        String marca = escribir_cadena();
        mostrar("PRECIO: ");
        double precio = escribir_double();
        mostrar("CILINDRADA: ");
        int cilindrada = escribir_entero();
        mostrar("TIPO: ");
        String tipo = escribir_cadena();
        V = new MotoTierra(matricula,propietario,marca,precio,cilindrada,tipo);
        vehiculos.colocar(V);
    }
    
    private void insertar_moto_agua(Vehiculo V)
    {
        mostrar("MATRICULA: ");
        String matricula = escribir_cadena();
        mostrar("PROPIETARIO: ");
        String propietario = escribir_cadena();
        mostrar("MARCA: ");
        String marca = escribir_cadena();
        mostrar("PRECIO: ");
        double precio = escribir_double();
        mostrar("CILINDRADA: ");
        int cilindrada = escribir_entero();
        mostrar("PLAZAS: ");
        String plazas = escribir_cadena();
        V = new MotoTierra(matricula,propietario,marca,precio,cilindrada,plazas);
        vehiculos.colocar(V);
    }
    
    private void mostrar_vehiculos()
    {
        vehiculos.mostrar_cartera();
    }
    
    private void mostrar_motos()
    {
        vehiculos.mostrar_motos();
    }
    
    private void info_vehiculo()
    {
        String matricula = escribir_cadena();
        vehiculos.mostrar_vehiculo(matricula);
    }
    
    public void alta_de_vehiculo()
    {
        Vehiculo V = null;
        int opcion;
        menu_alta();
        opcion = escribir_entero();
        switch (opcion)
        {
            case 1:
                insertar_coche(V);
                break;
            case 2:
                insertar_camion(V);
                break;
            case 3:
                insertar_moto_tierra(V);
                break;
            case 4:
                insertar_moto_agua(V);
                break;
            default:
                mostrar("Opción no válida");       
        }
    }
    
    public void programa()
    {
        int opcion;
        do
        {
            mostrar_menu();
            opcion = escribir_entero();
            switch (opcion)
            {
                case 0:
                    break;
                case 1:
                    alta_de_vehiculo();
                    break;
                case 2:
                    mostrar_vehiculos();
                    break;
                case 3:
                    mostrar_motos();
                    break;
                case 4:
                    info_vehiculo();
                    break;
                default:
                    mostrar("Opción no válida");       
            }
        }
        while (opcion != 0);
    }
}
