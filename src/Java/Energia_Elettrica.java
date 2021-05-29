import User.Login;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Energia_Elettrica extends JFrame implements ActionListener {

    public Energia_Elettrica() {

        JPanel table_pannel = new JPanel();
        table_pannel.setLayout(new BorderLayout());
        DefaultTableModel tableModel = new DefaultTableModel();
        JTable table = new JTable(tableModel);
        table_pannel.add((table), BorderLayout.NORTH);

        tableModel.addColumn(new Object[]{"Mese"});
        tableModel.addColumn(new Object[]{"Consumo in KW"});
        tableModel.addColumn(new Object[]{"Costo in Euro"});
        tableModel.addColumn(new Object[]{"CO2 Prodotta"});

        tableModel.addRow(new Object[]{" Gennaio "});
        tableModel.addRow(new Object[]{" Febbraio "});
        tableModel.addRow(new Object[]{" Marzo "});
        tableModel.addRow(new Object[]{" Aprile "});
        tableModel.addRow(new Object[]{" Maggio "});
        tableModel.addRow(new Object[]{" Giugno "});
        tableModel.addRow(new Object[]{" Luglio "});
        tableModel.addRow(new Object[]{" Agosto "});
        tableModel.addRow(new Object[]{" Settebre "});
        tableModel.addRow(new Object[]{" Ottobre "});
        tableModel.addRow(new Object[]{" Novembre "});
        tableModel.addRow(new Object[]{" Dicembre "});


        setContentPane(table_pannel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Energia_Elettrica::new);
    }

}



//        int Gennaio_E = (int) table.getValueAt(1, 1);
//        int G_E = Gennaio_E / 2;
//        table.setValueAt(G_E, 1, 3);
//
//        int Febbraio_E = (int) table.getValueAt(2, 1);
//        int F_E = Febbraio_E / 2;
//        table.setValueAt(F_E, 2, 3);
//
//        int Marzo_E = (int) table.getValueAt(3, 1);
//        int M_E = Marzo_E / 2;
//        table.setValueAt(M_E, 3, 3);
//
//        int Aprile_E = (int) table.getValueAt(4, 1);
//        int A_E = Aprile_E / 2;
//        table.setValueAt(A_E, 4, 3);
//
//        int Maggio_E = (int) table.getValueAt(5, 1);
//        int Mg_E = Maggio_E / 2;
//        table.setValueAt(Mg_E, 5, 3);
//
//        int Giugno_E = (int) table.getValueAt(6, 1);
//        int Go_E = Giugno_E / 2;
//        table.setValueAt(Go_E, 6, 3);
//
//        int Luglio_E = (int) table.getValueAt(7, 1);
//        int L_E = Luglio_E / 2;
//        table.setValueAt(L_E, 7, 3);
//
//        int Agosto_E = (int) table.getValueAt(8, 1);
//        int Ag_E = Agosto_E / 2;
//        table.setValueAt(Ag_E, 8, 3);
//
//        int Settembre_E = (int) table.getValueAt(9, 1);
//        int S_E = Settembre_E / 2;
//        table.setValueAt(S_E, 9, 3);
//
//        int Ottobre_E = (int) table.getValueAt(10, 1);
//        int O_E = Ottobre_E / 2;
//        table.setValueAt(O_E, 10, 3);
//
//        int Novembre_E = (int) table.getValueAt(11, 1);
//        int N_E = Novembre_E / 2;
//        table.setValueAt(N_E, 11, 3);
//
//        int Dicembre_E = (int) table.getValueAt(12, 1);
//        int D_E = Dicembre_E / 2;
//        table.setValueAt(D_E, 12, 3);


//        System.out.println("Table rows = " + table.getRowCount());
//        System.out.println("Table Column = " + table.getColumnCount());
//        Font font = new Font("New Tegomin", Font.PLAIN, 15);
//        table.setFont(font);
//        JFrame frame = new JFrame();
//        frame.add(new JScrollPane(table_pannel));
//        frame.setVisible(true);