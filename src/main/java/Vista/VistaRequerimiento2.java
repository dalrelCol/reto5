package Vista;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
//import Modelo.dao.*;
import Controlador.ElControladorDeRequerimientos;
import Modelo.vo.Requerimiento_2;

public class VistaRequerimiento2  extends JFrame {

    public VistaRequerimiento2() throws SQLException {
        initUI();
    }
    
    private void initUI() throws SQLException {
        this.setLayout( new BorderLayout());
        String[]nombres= { "Nombre", " Primer_Apellido ", "Ciudad_Residencia", "Cargo", "Salario" }; 
        JTable table = new JTable(mostrar(), nombres );
        JScrollPane panel = new JScrollPane(table);
        add (panel, BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize (400, 150);
        setLocationRelativeTo(null);
        setVisible (true);
    }
    public String[][] mostrar() throws SQLException{
        ArrayList<Requerimiento_2>lista= new ArrayList<Requerimiento_2>();
        //Requerimiento_2Dao requerimiento_2= new Requerimiento_2Dao();
        ElControladorDeRequerimientos controlador= new ElControladorDeRequerimientos();
        lista=controlador.consultarRequerimiento2();
        String matris[][]= new String [lista.size()][5];
        for (int i=0; i< lista.size(); i++){
            matris[i][0]=String.valueOf(lista.get(i).getNombre());
            matris[i][1]=lista.get(i).getPrimer_Apellido();
            matris[i][2]=lista.get(i).getCiudad_Residencia();
            matris[i][3]=lista.get(i).getCargo();
            matris[i][4]=String.valueOf(lista.get(i).getSalario());
        }
        return matris;
    }
}
