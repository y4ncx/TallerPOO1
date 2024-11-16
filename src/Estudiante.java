public class Estudiante {
    private String Nombre;
    private int Edad;
    private String Curso;

    //Constructores


    //Por Defecto
    public Estudiante(){
        this.Nombre = "Nombre Genérico";
        this.Edad = 0;
        this.Curso = "Curso Genérico";
    }

    //Con Parametros
    public Estudiante(String Nombre, int Edad){
        this();
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public Estudiante(String Nombre, int Edad, String Curso){
        this(Nombre,Edad);
        this.Curso = Curso;
    }

    //Detalles Del Estudiante
    public void Estudiante(){
        System.out.println("Nombre Del Estudiante = " + Nombre);
        System.out.println("Edad Del Estudiante = " + Edad);
        System.out.println("Curso Del Estudiante = " + Curso);

    }

    @Override
    public String toString() {
        return "Estudiante = " + Nombre + " \nEdad = " + Edad + " \nCurso = " + Curso;
    }
}
