package paquete01;

public class Hospital {

    private String nombre;
    private Ciudad ciudad;
    private int numeroEsp;
    private Medico[] conjuntoMedico;
    private Enfermerx[] conjuntoEnfermerx;
    private double sueldosC;
    private String direccion;

    //Constructores
    
    public Hospital(String nom) {

        nombre = nom;
        
    }

    //Establecer
    
    public void establecerNombre(String c) {

        nombre = c;
    }

    public void establecerCiudad(Ciudad c) {

        ciudad = c;
    }

    public void establecerConjuntoMed(Medico[] c) {

        conjuntoMedico = c;
    }

    public void establecerConjuntoEnf(Enfermerx[] c) {

        conjuntoEnfermerx = c;
    }

    public void establecerSueldosC() {

        double suma = 0;

        for (int i = 0; i < conjuntoMedico.length; i++) {
            suma = suma + conjuntoMedico[i].obtenerSueldom();
        }

        for (int i = 0; i < conjuntoEnfermerx.length; i++) {
            suma = suma + conjuntoEnfermerx[i].obtenerSueldom();
        }
        
        sueldosC = suma;

    }

    public void establecerDireccion(String c) {
        direccion = c;
    }
    
    public void establecerNumeroEsp() {
        
        int suma = 0;
        
        String [] aux = new String[conjuntoMedico.length];
        
        for (int i = 0; i < conjuntoMedico.length; i++) {
            aux[i] = conjuntoMedico[i].obtenerEspecialidad();
        }
                
        for (int i = 0; i < conjuntoMedico.length; i++) {
            
            for (int j = 0; j < conjuntoMedico.length; j++) {
                
                if (aux[i].equals(conjuntoMedico[j].obtenerEspecialidad())) {
                    suma++;
                }
            }
        }
                     
        numeroEsp = suma - conjuntoMedico.length;
        
    }

    //Obtener 
    
    public String obtenerNombre() {

        return nombre;
    }

    public Ciudad obtenerCiudad() {

        return ciudad;
    }

    public Medico[] obtenerConjuntoMed() {

        return conjuntoMedico;
    }

    public Enfermerx[] obtenerConjuntoEnf() {

        return conjuntoEnfermerx;
    }

    public double obtenerSueldosC() {

        return sueldosC;
    }

    public String obtenerDireccion() {

        return direccion;
    }
    
    public int obtenerNumEsp() {

        return numeroEsp;
    }

    @Override
    public String toString() {
        String cadena = String.format("HOSPITAL %s\n",obtenerNombre());
        cadena = String.format("%sDirección: %s\nCiudad: %s\nProvincia: "
            + "%s\nNúmero de especialidades: %d\n", cadena,
            obtenerDireccion(), ciudad.obtenerNombre(), ciudad.obtenerProvincia(),
            obtenerNumEsp());
        
        cadena = String.format("%s\nListado de Médicos\n",cadena); 
        
        for (int i = 0; i < obtenerConjuntoMed().length; i++) {
            cadena = String.format("%s- %s - Sueldo: %.2f - %s\n", cadena,
                    obtenerConjuntoMed()[i].obtenerNombre(),
                    obtenerConjuntoMed()[i].obtenerSueldom(),
                    obtenerConjuntoMed()[i].obtenerEspecialidad());
        }
        cadena = String.format("%s\n\nListado de enfermeros(as)\n",cadena);
        for (int i = 0; i < obtenerConjuntoEnf().length; i++) {
            cadena = String.format("%s- %s - sueldo: %.2f - %s\n", cadena,
                    obtenerConjuntoEnf()[i].obtenerNombre(),
                    obtenerConjuntoEnf()[i].obtenerSueldom(),
                    obtenerConjuntoEnf()[i].obtenerTipo());   
        } 
        
        cadena = String.format("%s\nTotal de sueldos a pagar por mes: %.2f",cadena
        ,obtenerSueldosC());
              
        return cadena;
    }

}
