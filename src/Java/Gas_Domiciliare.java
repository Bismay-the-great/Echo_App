import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Gas_Domiciliare {

    public static void main(String[] args ){
        JPanel table_pannel = new JPanel();
        table_pannel.setLayout(new BorderLayout());
        DefaultTableModel tableModel = new DefaultTableModel();
        JTable table = new JTable(tableModel);
        table_pannel.add((table), BorderLayout.NORTH);

        tableModel.addColumn(new Object[]{"Mese"});
        tableModel.addColumn(new Object[]{"Consumo in m^3"});
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

        int Gennaio_G = (int) table.getValueAt(1, 1);
        int G_G = Gennaio_G * 2;
        table.setValueAt(G_G, 1, 3);

        int Febbraio_G = (int) table.getValueAt(2, 1);
        int F_G = Febbraio_G * 2;
        table.setValueAt(F_G, 2, 3);

        int Marzo_G = (int) table.getValueAt(3, 1);
        int M_G = Marzo_G * 2;
        table.setValueAt(M_G, 3, 3);

        int Aprile_G = (int) table.getValueAt(4, 1);
        int A_G = Aprile_G * 2;
        table.setValueAt(A_G, 4, 3);

        int Maggio_G = (int) table.getValueAt(5, 1);
        int Mg_G = Maggio_G * 2;
        table.setValueAt(Mg_G, 5, 3);

        int Giugno_G = (int) table.getValueAt(6, 1);
        int Go_G = Giugno_G * 2;
        table.setValueAt(Go_G, 6, 3);

        int Luglio_G = (int) table.getValueAt(7, 1);
        int L_G = Luglio_G * 2;
        table.setValueAt(L_G, 7, 3);

        int Agosto_G = (int) table.getValueAt(8, 1);
        int Ag_G = Agosto_G * 2;
        table.setValueAt(Ag_G, 8, 3);

        int Settembre_G = (int) table.getValueAt(9, 1);
        int S_G = Settembre_G * 2;
        table.setValueAt(S_G, 9, 3);

        int Ottobre_G = (int) table.getValueAt(10, 1);
        int O_G = Ottobre_G * 2;
        table.setValueAt(O_G, 10, 3);

        int Novembre_G = (int) table.getValueAt(11, 1);
        int N_G = Novembre_G * 2;
        table.setValueAt(N_G, 11, 3);

        int Dicembre_G = (int) table.getValueAt(12, 1);
        int D_G = Dicembre_G / 2;
        table.setValueAt(D_G, 12, 3);


        System.out.println("Table rows = " + table.getRowCount());
        System.out.println("Table Column = " + table.getColumnCount());
        Font font = new Font("New Tegomin", Font.PLAIN ,15);
        table.setFont(font);
        JFrame frame = new JFrame();
        frame.add(new JScrollPane(table_pannel));
        frame.setVisible(true);


    }
}
