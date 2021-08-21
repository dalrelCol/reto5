package reto4;
import java.sql.SQLException;
import Vista.VistaRequerimiento1;
import Vista.VistaRequerimiento2;
import Vista.VistaRequerimiento3;
import Vista.VistaRequerimientos;


/**
 * Esta clase solo se debe usar para hacer pruebas locales,
 * no se debe subir en iMaster
 */
public class Principal {
    public static void main(String[] args) throws  SQLException {

        System.out.println("Requerimiento 1");
        VistaRequerimientos.requerimiento1();
        VistaRequerimiento1 reque = new VistaRequerimiento1();

        System.out.println("\nRequerimiento 2");
        VistaRequerimientos.requerimiento2();
        VistaRequerimiento2 reque1 = new VistaRequerimiento2();

        System.out.println("\nRequerimiento 3");
        VistaRequerimientos.requerimiento3();
        VistaRequerimiento3 reque2 = new VistaRequerimiento3();
    }
}
