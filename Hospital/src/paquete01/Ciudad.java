package paquete01;

public class Ciudad {

    private String nombrelv;
    private String provincia;
    
    //Constructores
    
    public Ciudad(String nom, String prov){
        nombrelv = nom;
        provincia = prov;
    }

    //Establecer
    
    public void establecerNombre(String c) {
        nombrelv = c;
    }

    public void establecerProvincia(String c) {
        provincia = c;
    }

    //Obtener
    
    public String obtenerNombre() {
        return nombrelv;
    }

    public String obtenerProvincia() {
        return provincia;
    }

}
