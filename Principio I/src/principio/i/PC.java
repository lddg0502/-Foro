/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principio.i;

/**
 *
 * @author Luis Domingos
 */
public abstract class PC implements PCGames{
    @Override
    public String informacion() {
		String info = "informacion del juego";
		return info;
	}




    @Override
    public String Jugar() throws Exception {
        return "you can play";z
}
}