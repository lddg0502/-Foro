
package principio.s;


public class printLibro {
    public void imprimirLibro (Libro libro){
        String titulo = libro.titulo;
        int pag = libro.paginas;
        String fabricante = libro.fabricante;
        String tdc = libro.tipodecapa;
        System.out.print("Titulo"+titulo+"paginas"+pag+"Fabricante"+fabricante+"Tipo de capa"+tdc);
}
}
