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
public class MotoTierra extends Moto
{
    private String tipo;
    
    public MotoTierra()
    {
        super();
        tipo = "";
    }
    
    public MotoTierra(String matricula,String propietario,String marca,double precio,int cilindrada,String tipo)
    {
        super(matricula,propietario,marca,precio,cilindrada);
        this.tipo = tipo;
    }
    
    public void set_tipo(String tipo)
    {
        this.tipo = tipo;
    }
    
    public String get_tipo()
    {
        return this.tipo;
    }
    
    @Override public String toString()
    {
        return(super.toString()+" TIPO: "+this.get_tipo());
    }
}
