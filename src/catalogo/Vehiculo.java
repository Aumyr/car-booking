/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo;

/**
 *
 * @author Alejandro
 */
public abstract class Vehiculo 
{
    private String matricula;
    private String propietario;
    private String marca;
    private double precio;
    
    public Vehiculo()
    {
        matricula = "";
        propietario = "";
        marca = "";
        precio = 0.0;
    }
    
    public Vehiculo (String matricula, String propietario, String marca, double precio)
    {
        this.matricula = matricula;
        this.propietario = propietario;
        this.marca = marca;
        this.precio = precio;
    }
    
    public void set_matricula(String matricula)
    {
        this.matricula = matricula;
    }
    
    public void set_propietario(String propietario)
    {
        this.propietario = propietario;
    }
    
    public void set_marca(String marca)
    {
        this.marca = marca;
    }
    
    public void set_precio(float precio)
    {
        this.precio = precio;
    }
    
    public String get_matricula()
    {
        return this.matricula;
    }
    
    public String get_propietario()
    {
        return this.propietario;
    }
    
    public String get_marca()
    {
        return this.marca;
    }
    
    public double get_precio()
    {
        return this.precio;
    }
    
    @Override
    public String toString()
    {
        return ("MATRICULA: " +this.get_matricula()+" PROPIETARIO: "+this.get_propietario()+" MARCA: "+this.get_marca()+" PRECIO: " +this.get_precio());
    }
}
