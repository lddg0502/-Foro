/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package princpio.l;

/**
 *
 * @author Luis Domingos
 */
public class Adulto extends Persona {
    private String dni;
    private String tarjeta;
    
    public void pagar() {
 
        System.out.println("mi dni es " +dni+ "pago con la tarjeta" + tarjeta);
}
}
