import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AfisareFilme extends LoggingPage {
    private JList lstAfisare;
    private JButton afiseazaButton;
    private JPanel afisPanel;


    public AfisareFilme() {
        afiseazaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshList();
                String s = "S-au afisat filmele";
                adaugaLog(s);



            }
        });
    }
    private void refreshList(){
        lstAfisare.setListData(AdaugareFilm.arr.toArray());
    }

    public static void start(){
        JFrame afisPage = new JFrame("Afisare filme");
        afisPage.setContentPane(new AfisareFilme().afisPanel);


        afisPage.setPreferredSize(new Dimension(1000, 474));

        afisPage.pack();

        afisPage.setVisible(true);
    }
}
