/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pincipio.d;

/**
 *
 * @author Luis Domingos
 */
public class Aplicar {
    public void ralizarAplicacion(Persona persona){
        Guardar guardar = new Guardar(); 
        guardar.guardar(persona);
    }
}
