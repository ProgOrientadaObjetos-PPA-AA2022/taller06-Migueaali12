package paquete01;

public class Hospital {

   private String nombre;
   private Ciudad ciudad;
   private int numeroE;
   private Medico[] conjuntoMedico;
   private Enfermerx[] conjuntoEnfermerx;
   private int sueldos;
   private String direccion;
   
   //Establecer
   
   public Hospital(String nom, Ciudad ciu, int num, Medico[] med,
           Enfermerx [] enf, int suel, String dir) {
       
       nombre = nom;
       ciudad = ciu;
       numeroE = num;
       conjuntoMedico = med;
       conjuntoEnfermerx = enf;
       sueldos = suel;
       direccion = dir;
       
   }
   
}
