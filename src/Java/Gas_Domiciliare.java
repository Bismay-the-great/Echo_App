import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Gas_Domiciliare {

    public static void main(String[] args ){
        JPanel table_pannel = new JPanel();
        table_pannel.setLayout(new BorderLayout());
        DefaultTableModel tableModel = new DefaultTableModel();
        JTable table = new JTable(tableModel);
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

        Object Gennaio_G = table.getValueAt(1,1);
        table.setValueAt(Gennaio_G,1,3);
        Object Febbario_G = table.getValueAt(2,1);
        table.setValueAt(Febbario_G,2,3);
        Object Marzo_G = table.getValueAt(3,1);
        table.setValueAt(Marzo_G,3,3);
        Object Aprile_G = table.getValueAt(4,1);
        table.setValueAt(Aprile_G,4,3);
        Object Maggio_G = table.getValueAt(5,1);
        table.setValueAt(Maggio_G,5,3);
        Object Giugno_G = table.getValueAt(6,1);
        table.setValueAt(Giugno_G,6,3);
        Object Luglio_G = table.getValueAt(7,1);
        table.setValueAt(Luglio_G,7,3);
        Object Agosto_G = table.getValueAt(8,1);
        table.setValueAt(Agosto_G,8,3);
        Object Settembre_G = table.getValueAt(9,1);
        table.setValueAt(Settembre_G,9,3);
        Object Ottobre_G = table.getValueAt(10,1);
        table.setValueAt(Ottobre_G,10,3);
        Object Novembre_G = table.getValueAt(11,1);
        table.setValueAt(Novembre_G,11,3);
        Object Dicembre_G = table.getValueAt(12,1);
        table.setValueAt(Dicembre_G,12,3);

        System.out.println("Table rows = " + table.getRowCount());
        System.out.println("Table Column = " + table.getColumnCount());
        Font font = new Font("New Tegomin", Font.PLAIN ,15);
        table.setFont(font);
        JFrame frame = new JFrame();
        frame.add(new JScrollPane(table_pannel));
        frame.setVisible(true);
    }
}
