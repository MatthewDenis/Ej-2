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
public class Libros {
    private String Titulo;
    private String Autor;
    private int Estado; /* solo cambia cuando ya no hay*/
    private String Prestador;
    private String Codigo;
    public void setCodigo(String nc){
        Codigo = nc;
    }
    public String getCodigo(){
        return Codigo;
    }
    public void setTitulo(String nt){
        Titulo = nt;
    }
    public void setAutor(String na){
        Autor = na;
    }
    public void setEstado(int boo){
        if (boo == 0){
            Estado = 0;
        }
        else{
           Estado = 1;
        }
    }
    
    public String getTitulo(){
        return Titulo;
    }
    public String getAutor(){
        return Autor;
    }
    public int getEstado(){
        return Estado;
    }
    public String getPrestador(){
        return Prestador;
    }
    public void setPrestador(String np){
        Prestador = np;
    }
    public String findTitulo(){
        return "Nombre del libro";
    }
    public String findAutor(){
         return "Nombre del autor";
    }
}