
package paquete01;


public class Enfermerx {
    
    private String nombre;
    private String tipo;
    private double sueldom;
    
    //Constructores
    
    public Enfermerx(String nom, String tip, double suel) {
        nombre = nom;
        tipo = tip;
        sueldom = suel;
    }

    //Establecer
    
    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerTipo(String c) {
        tipo = c;
    }
    
    public void establecerSueldom(double c) {
        sueldom = c;
    }

    //Obtener
    
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerEspecialidad() {
        return tipo;
    }
    
    public double obtenerSueldom() {
        return sueldom;
    }
    
}
