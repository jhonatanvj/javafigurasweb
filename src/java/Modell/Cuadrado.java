/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modell;

/**
 *
 * @author jhona
 */
public class Cuadrado extends Figura{
    private float lado;
    
    @Override
    public void calcularArea(){
        this.area=lado*lado;
    }
    
    @Override
    public void calcularPerimetro(){
        this.perimetro=lado+lado+lado+lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
    
}
