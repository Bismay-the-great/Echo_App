import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Energia_Elettrica extends JFrame implements ActionListener {

    public static void main(String[] args) {
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

        Object Gennaio_E = table.getValueAt(1, 1);
        table.setValueAt(Gennaio_E, 1, 3);
        Object Febbario_E = table.getValueAt(2, 1);
        table.setValueAt(Febbario_E, 2, 3);
        Object Marzo_E = table.getValueAt(3, 1);
        table.setValueAt(Marzo_E, 3, 3);
        Object Aprile_E = table.getValueAt(4, 1);
        table.setValueAt(Aprile_E, 4, 3);
        Object Maggio_E = table.getValueAt(5, 1);
        table.setValueAt(Maggio_E, 5, 3);
        Object Giugno_E = table.getValueAt(6, 1);
        table.setValueAt(Giugno_E, 6, 3);
        Object Luglio_E = table.getValueAt(7, 1);
        table.setValueAt(Luglio_E, 7, 3);
        Object Agosto_E = table.getValueAt(8, 1);
        table.setValueAt(Agosto_E, 8, 3);
        Object Settembre_E = table.getValueAt(9, 1);
        table.setValueAt(Settembre_E, 9, 3);
        Object Ottobre_E = table.getValueAt(10, 1);
        table.setValueAt(Ottobre_E, 10, 3);
        Object Novembre_E = table.getValueAt(11, 1);
        table.setValueAt(Novembre_E, 11, 3);
        Object Dicembre_E = table.getValueAt(12, 1);
        table.setValueAt(Dicembre_E, 12, 3);


        System.out.println("Table rows = " + table.getRowCount());
        System.out.println("Table Column = " + table.getColumnCount());
        Font font = new Font("New Tegomin", Font.PLAIN, 15);
        table.setFont(font);
        JFrame frame = new JFrame();
        frame.add(new JScrollPane(table_pannel));
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

