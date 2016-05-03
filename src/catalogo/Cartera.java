/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo;

import java.util.ArrayList;


/**
 *
 * @author Alejandro
 */
public class Cartera 
{
    private ArrayList <Vehiculo> cartera_vehiculos;
    
    public Cartera()
    {
        cartera_vehiculos = new ArrayList<>();
    }
    
    public void colocar(Vehiculo V)
    {
        cartera_vehiculos.add(V);
    }
    
    public void mostrar_cartera()
    {
        for (Vehiculo aux : cartera_vehiculos) 
        {
            System.out.println(aux.toString());
        }
    }
    
    public void mostrar_vehiculo(String matricula)
    {
        for (Vehiculo aux : cartera_vehiculos) 
        {
            if (matricula.equals(aux.get_matricula())) System.out.println("• " +aux.toString());
        }
    }
    
    public void mostrar_motos()
    {
        for (Vehiculo aux : cartera_vehiculos) 
        {
            if (aux instanceof MotoAgua || aux instanceof MotoTierra) System.out.println(aux.toString());
        }
    }
}
