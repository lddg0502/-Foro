
package principio.o;

public class Cuadrado extends Formas {
    private int area;
    @Override
    public void Area(){
        area = base*altura;
        System.out.println(area);
    }
}
