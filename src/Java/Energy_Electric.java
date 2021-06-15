
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Energy_Electric extends JFrame implements ActionListener {

        public Energy_Electric() {
                JPanel table_pannel = new JPanel();
                table_pannel.setLayout(new BorderLayout());
                DefaultTableModel tableModel = new DefaultTableModel();
                JTable table = new JTable(tableModel);
                table_pannel.add((table), BorderLayout.NORTH);

                tableModel.addColumn(new Object[]{"Mese"});
                tableModel.addColumn(new Object[]{"Consumo in M^3"});
                tableModel.addColumn(new Object[]{"Costo in Euro"});
                tableModel.addColumn(new Object[]{"CO2 Prodotta"});

                String[] Mesi = {"Gennaio", "Febbraio","Marzo","Aprile","Maggio","Giugno",
                        "Luglio","Agosto","Settembre","Ottobre","Novembre","Dicembre"};

                int row = 12;
                for(int i = 0; i < row; ++i){
                        tableModel.addRow(new Object[]{Mesi[i]});
                }

                for(int i = 1; i < row; ++i){
                        int row1 = 1;
                        int column1 = 1;
                        int column2 = 3;
                        int controllo = (int) table.getValueAt(row1,column1);
                        if( controllo != 0)
                                for(int j = 0; j < row; ++j){
                                        int Mese_vuoto = (int) table.getValueAt(row1, column1);
                                        int Mv = Mese_vuoto / 2;
                                        table.setValueAt(Mv, row1, column2);
                                        ++row1;
                                }

                        // a fine anno aggiungo riga con il totale di tutti i dati della specifica colonna

                        int fine_anno = (int) table.getValueAt(13,3);
                        int row2 = 1;
                        int consumo_totale = 0;
                                if(fine_anno != 0)
                                        for(int z = 1; z < row; ++z){

                                                int value1 = (int) table.getValueAt(row2, column1);
                                                if(value1 != 0){
                                                consumo_totale += value1;
                                                ++row2;}
                                        }
                                table.setValueAt(consumo_totale,row2,column1);
                        int row3 = 1;
                        int column3 = 2;
                        int costo_totale = 0;



                                if(fine_anno != 0)
                                        for(int y = 1; y < row; ++y) {
                                                int value2 = (int) table.getValueAt(row3, column3);
                                                if(value2 != 0){
                                                costo_totale += value2;
                                                ++row3;}
                                        }
                                table.setValueAt(costo_totale,row3,column3);
                        int row4 = 1;
                        int c02_prodotta_totale = 0;
                                        
                                if(fine_anno != 0)
                                        for(int y = 1; y < row; ++y) {

                                                int value3 = (int) table.getValueAt(row4, column2);
                                                if(value3 != 0){
                                                c02_prodotta_totale += value3;
                                                ++row4;}
                                        }
                                table.setValueAt(c02_prodotta_totale,row4,column2);



                setContentPane(table_pannel);
                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                setSize(500, 500);
                setVisible(true);

        }}

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