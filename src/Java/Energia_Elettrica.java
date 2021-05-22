import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Energia_Elettrica extends JFrame{

    public static void main(String [] args){
        JPanel table_pannel = new JPanel();
        table_pannel.setLayout(new BorderLayout());
        DefaultTableModel tableModel = new DefaultTableModel();
        JTable table = new JTable(tableModel);
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

        Object e = table.getValueAt(1,1);
        table.setValueAt(e,1,3);
        Object f = table.getValueAt(2,1);
        table.setValueAt(f,2,3);
        Object g = table.getValueAt(3,1);
        table.setValueAt(g,3,3);
        Object h = table.getValueAt(4,1);
        table.setValueAt(h,4,3);
        Object i = table.getValueAt(5,1);
        table.setValueAt(i,5,3);
        Object l = table.getValueAt(6,1);
        table.setValueAt(l,6,3);
        Object m = table.getValueAt(7,1);
        table.setValueAt(m,7,3);
        Object n = table.getValueAt(8,1);
        table.setValueAt(n,8,3);
        Object o = table.getValueAt(9,1);
        table.setValueAt(o,9,3);
        Object p = table.getValueAt(10,1);
        table.setValueAt(p,10,3);
        Object q = table.getValueAt(11,1);
        table.setValueAt(q,11,3);
        Object r = table.getValueAt(12,1);
        table.setValueAt(r,12,3);




        System.out.println("Table rows = " + table.getRowCount());
        System.out.println("Table Column = " + table.getColumnCount());
        Font font = new Font("New Tegomin", Font.PLAIN ,15);
        table.setFont(font);
        JFrame frame = new JFrame();
        frame.add(new JScrollPane(table_pannel));
        frame.setVisible(true);


    }

}

