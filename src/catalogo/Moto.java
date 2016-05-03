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
public abstract class Moto extends Vehiculo 
{
    private int cilindrada;
    
    public Moto()
    {
        super();
        cilindrada = 0;
    }
    
    public Moto(String matricula,String propietario,String marca,double precio,int cilindrada)
    {
        super(matricula,propietario,marca,precio);
        this.cilindrada = cilindrada;
    }
    
    public void set_cilindrada(int cilindrada)
    {
        this.cilindrada = cilindrada;
    }
    
    public int get_cilindrada()
    {
        return this.cilindrada;
    }
    
    @Override public String toString()
    {
        return(super.toString()+" CILINDRADA: "+this.get_cilindrada());
    }
}
