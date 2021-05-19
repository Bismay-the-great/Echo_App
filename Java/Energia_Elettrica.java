import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.PseudoColumnUsage;

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
        System.out.println("Table rows = " + table.getRowCount());
        System.out.println("Table Column = " + table.getColumnCount());
        Font font = new Font("New Tegomin", Font.PLAIN ,15);
        table.setFont(font);
        JFrame frame = new JFrame();
        frame.add(new JScrollPane(table_pannel));
        frame.setVisible(true);


    }

}


class Tabella_Energia extends JFrame
{

}

// CLASS RENDERER

class RowRenderer extends JLabel implements ListCellRenderer{

    // CONSTRUCTOR
    public RowRenderer(JTable table) {

    }





    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        //create auto generated method

        return null;
    }
}














