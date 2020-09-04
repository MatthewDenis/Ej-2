/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

/**
 *
 * @author mateo
 */
public class Socios {
    private String Codigo;
    private String Nombre;
    private  int nroLibros;
    public String getCodigo(){
        return Codigo;
    }
    public String getNombre(){
        return Nombre;
    }
    public int getNroLibros(){
        return nroLibros;
    }
    public void setNombre(String nn){
        Nombre = nn;
    }
    public void setCodigo(String nc){
        Codigo = nc;
    }
    public void setNroLibros(int srl){
        nroLibros = srl;
    }
    public boolean SeguirSacando(){
        if (nroLibros <3){
            return true;
        }
        else{
            return false;
        }
    }
    public void RestarNroLibros(){
        nroLibros = nroLibros - 1;
    }
    public void SumarNroLibros(){
        nroLibros = nroLibros + 1;
    }
    public String findNombre(){
        return "Nombre del socio";
    }
}
