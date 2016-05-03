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
public class Camion extends Vehiculo
{
    private int carga_max;
    
    public Camion()
    {
        super();
        carga_max = 0;
    }
    
    public Camion(String matricula,String propietario,String marca,double precio,int carga_max)
    {
        super(matricula,propietario,marca,precio);
        this.carga_max = carga_max;
    }
    
    public void set_carga_max(int carga_max)
    {
        this.carga_max = carga_max;
    }
    
    public int get_carga_max()
    {
        return this.carga_max;
    }
    
    @Override public String toString()
    {
        return(super.toString()+" CARGA MAXIMA: "+this.get_carga_max());
    }
}
