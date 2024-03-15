/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modell;

/**
 *
 * @author jhona
 */
public class Triangulo extends Figura {
    private float base;
    private float altura;

    @Override
    public void calcularPerimetro(){
        this.perimetro=base+base+base;
    }
    
    @Override
     public void calcularArea(){
        this.area=(base*altura)/2;
    }
    
    
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
}
