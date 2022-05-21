package paquete01;

public class Medico {

    private String nombre;
    private String especialidad;
    private double sueldom;

    //Constructores
    
    public Medico(String nom, String espe, double suel) {
        nombre = nom;
        especialidad = espe;
        sueldom = suel;
    }

    //Establecer
    
    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerEspecialidad(String c) {
        especialidad = c;
    }
    
    public void establecerSueldom(double c) {
        sueldom = c;
    }

    //Obtener
    
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }
    
    public double obtenerSueldom() {
        return sueldom;
    }

}
