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
public class Coche extends Vehiculo
{
    private int plazas;
    
    public Coche()
    {
        super();
        plazas = 0;
    }
    
    public Coche (String matricula,String propietario,String marca,double precio,int plazas)
    {
        super(matricula,propietario,marca,precio);
        this.plazas = plazas;
    }
    
    public void set_plazas(int plazas)
    {
        this.plazas = plazas;
    }
    
    public int get_plazas()
    {
        return this.plazas;
    }
    
    @Override public String toString()
    {
        return(super.toString()+" PLAZAS: "+this.get_plazas());
    }
}
