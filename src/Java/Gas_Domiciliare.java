
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        String[] Mesi = {"Gennaio", "Febbraio","Marzo","Aprile","Maggio","Giugno",
                "Luglio","Agosto","Settembre","Ottobre","Novembre","Dicembre"};
        int row = table.getRowCount();
        for(int i = 0; i < row; ++i){
            tableModel.addColumn(new Object[]{Mesi[i]});
        }
        for(int i = 0; i < row; ++i){
            int row1 = 1;
            int column1 = 1;
            int column2 = 3;
            int controllo = (int) table.getValueAt(row1,column1);
            if( controllo != 0)
                for(int j = 0; j < row; ++j){
                    int Mese_vuoto = (int) table.getValueAt(row1, column1);
                    int Mv = Mese_vuoto * 2;
                    table.setValueAt(Mv, row1, column2);
                    ++row1;
                }
        }



        setContentPane(table_pannel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Energy_Electric::new);
    }

}





//        System.out.println("Table rows = " + table.getRowCount());
//        System.out.println("Table Column = " + table.getColumnCount());
//        Font font = new Font("New Tegomin", Font.PLAIN, 15);
//        table.setFont(font);
//        JFrame frame = new JFrame();
//        frame.add(new JScrollPane(table_pannel));
//        frame.setVisible(true);