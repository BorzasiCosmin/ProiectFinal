import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AdaugareFilm {
    private JTextField txtNume;
    private JTextField txtGen;
    private JTextField txtDurata;
    private JPanel addPanel;
    private JButton addButton;
    private JTextField tfBilete;
    private JLabel Bilete;
    public static ArrayList<Film> arr;


    public AdaugareFilm() {
        arr = new ArrayList<Film>();
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nume = txtNume.getText();
                String gen = txtGen.getText();
                String durata = txtDurata.getText();
                int bil = Integer.parseInt(tfBilete.getText());
                Film f= new Film(nume,gen,durata,bil);
                arr.add(f);
            }
        });
    }

    public static void start(){
        JFrame mainPage = new JFrame("Adaugare Film");
        mainPage.setContentPane(new AdaugareFilm().addPanel);

        mainPage.setPreferredSize(new Dimension(450, 474));

        mainPage.pack();

        mainPage.setVisible(true);
    }
}
