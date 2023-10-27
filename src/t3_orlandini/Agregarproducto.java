/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3_orlandini;

/**
 *
 * @author Lenovo
 */
public class Agregarproducto {
    private String Nombre;
    private int Stock;
    private float Precio;
    
    public Agregarproducto(String Nombre, int Stock, float Precio){
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Stock = Stock;
    }
    public String getNombre(){
       return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    public int getStock(){
        return Stock;
    }
    public void setStock(int Stock){
        this.Stock=Stock;
    }
    public float getPrecio(){
        return Precio;
    }
    public void setPrecio(int Precio){
        this.Precio=Precio;
    }
}
    
