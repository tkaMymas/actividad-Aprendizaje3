public class Profesor extends Persona{
    private boolean maestria;
    private Persona[] registros = new Persona[50];
    private int numRegistros = 0;

    public Profesor(String nombre, String apellido, String fechaNacimiento, String genero, float estatura, float peso, boolean maestria){
        super(nombre, apellido, fechaNacimiento, genero, estatura, peso);
        this.maestria = maestria;
    }
    public void IngresoRegistros(Persona persona){
        if (numRegistros <= 50){
            registros[numRegistros] = persona;
            numRegistros++;
            System.out.println("Registro ingresado correctamente!");
        }
        else{
            System.out.println("Capacidad Maxima de los Registros!");
        }
    }
}
