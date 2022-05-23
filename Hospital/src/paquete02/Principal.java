package paquete02;

import java.util.Scanner;
import paquete01.Ciudad;
import paquete01.Enfermerx;

import paquete01.Hospital;
import paquete01.Medico;

public class Principal {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String nombre, ciudad, prov, dir;

        int numEsp;

        System.out.println("Ingrese el nombre del hospital: ");
        nombre = sc.nextLine();

        Hospital h1 = new Hospital(nombre);

        System.out.println("Ingrese la ciudad: ");
        ciudad = sc.nextLine();

        System.out.println("Ingrese la provincia: ");
        prov = sc.nextLine();

        Ciudad c1 = new Ciudad(ciudad, prov);

        h1.establecerCiudad(c1);       

        sc.nextLine();

        System.out.println("Cuantos médicos desea ingresar: ");
        int numMed = sc.nextInt();

        System.out.println("Cuantos enfermeras desea ingresar: ");
        int numEnf = sc.nextInt();

        Medico[] conjuntoMed = new Medico[numMed];

        Enfermerx[] conjuntoEnf = new Enfermerx[numEnf];

        sc.nextLine();

        for (int i = 0; i < numMed; i++) {

            String nombreMed, especialidad;
            double sueldoMed;

            System.out.print("Ingrese el nombre del Médico " + (i + 1) + ": ");
            nombreMed = sc.nextLine();
            sc.nextLine();

            System.out.print("Ingrese la especialidad del Médico " + (i + 1) + ": ");
            especialidad = sc.nextLine();
            sc.nextLine();

            System.out.print("Ingrese el sueldo mensual del Médico " + (i + 1) + ": ");
            sueldoMed = sc.nextDouble();
            sc.nextLine();

            Medico med = new Medico(nombreMed, especialidad, sueldoMed);

            conjuntoMed[i] = med;

        }

        sc.nextLine();

        for (int i = 0; i < numEnf; i++) {

            String nombreEnf, tipo;
            double sueldoEnf;

            System.out.print("Ingrese el nombre del enfermero(a) " + (i + 1) + ": ");
            nombreEnf = sc.nextLine();
            sc.nextLine();

            System.out.print("Ingrese el tipo (nombremiento/contrato) "
                    + "del enfermero(a)" + (i + 1) + ": ");
            tipo = sc.nextLine();
            sc.nextLine();

            System.out.print("Ingrese el sueldo mensual del enfermero(a) " + (i + 1) + ": ");
            sueldoEnf = sc.nextDouble();
            sc.nextLine();

            Enfermerx enf = new Enfermerx(nombreEnf, tipo, sueldoEnf);

            conjuntoEnf[i] = enf;

        }

        sc.nextLine();

        h1.establecerConjuntoMed(conjuntoMed);
        h1.establecerConjuntoEnf(conjuntoEnf);
        h1.establecerSueldosC();

        System.out.print("Ingrese la dirección del hospital: ");
        dir = sc.nextLine();

        h1.establecerDireccion(dir);
        h1.establecerNumeroEsp();

        System.out.println(h1); 

    }
}
