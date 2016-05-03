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
public class MotoAgua extends Moto 
{
    private int plazas;
    
    public MotoAgua()
    {
        super();
        plazas = 0;
    }
    
    public MotoAgua(String matricula,String propietario,String marca,double precio,int cilindrada,int plazas)
    {
        super(matricula,propietario,marca,precio,cilindrada);
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

