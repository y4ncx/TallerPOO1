    //Creacion de Clase
public class Libro {
    private String Titulo;
    private String Autor;
    private int NumeroPaginas;


    //Constructores

    //Por Defecto
    public Libro() {
        this.Titulo = "Titulo Por Defecto";
        this.Autor = "Autor Por Defecto";
        this.NumeroPaginas = 0;
    }

    //Con Parametros
    public Libro (String Titulo, String Autor, int NumeroPaginas){
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroPaginas = NumeroPaginas;
    }

    // Se muestran los detalles del libro
    public void MostrarDetalles(){
        System.out.println("Titulo = " + this.Titulo);
        System.out.println("Autor = " + this.Autor);
        System.out.println("Numero De Paginas = " + NumeroPaginas);
    }

    @Override
        public String toString() {
        return "Titulo = " + Titulo + " \nAutor = " + Autor + " \nNumero De Paginas = " + NumeroPaginas;
    }

}