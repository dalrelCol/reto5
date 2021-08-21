package Vista;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Controlador.ElControladorDeRequerimientos;

import java.awt.BorderLayout;
//import Modelo.dao.*;

import Modelo.vo.Requerimiento_1;

public class VistaRequerimiento1  extends JFrame {
    public VistaRequerimiento1() throws SQLException {
        initUI();
    }
    
    private void initUI() throws SQLException {
        this.setLayout( new BorderLayout());
        String[]nombres= { "Ciudad", " Acabados ", "Clasificacion", "Banco_vinculado", "Constructora" }; 
        JTable table = new JTable(mostrar(), nombres );
        JScrollPane panel = new JScrollPane(table);
        add (panel, BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize (400, 150);
        setLocationRelativeTo(null);
        setVisible (true);
    }
    public String[][] mostrar() throws SQLException{
        ArrayList<Requerimiento_1>lista= new ArrayList<Requerimiento_1>();
        //Requerimiento_1Dao requerimiento_1= new Requerimiento_1Dao();
        ElControladorDeRequerimientos controlador= new ElControladorDeRequerimientos();
        lista=controlador.consultarRequerimiento1();
        String matris[][]= new String [lista.size()][5];
        for (int i=0; i< lista.size(); i++){
            matris[i][0]=String.valueOf(lista.get(i).getCiudad());
            matris[i][1]=lista.get(i).getAcabados();
            matris[i][2]=lista.get(i).getClasificacion();
            matris[i][3]=lista.get(i).getBanco_Vinculado();
            matris[i][4]=lista.get(i).getConstructora();
        }
        return matris;
    }
}
