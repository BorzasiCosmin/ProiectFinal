import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainPage extends AdaugareFilm{
    private JButton btnAfFilme;
    private JButton btnCumpara;
    private JButton btnLogging;
    private JPanel mainPanel;
    private JButton btnAdaugaFilm;
    private JButton btnBack;
    private static JFrame mainPage = new JFrame("Main Page");

    public MainPage() {

        btnAdaugaFilm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    AdaugareFilm.start();
            }
        });
        btnAfFilme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AfisareFilme.start();

            }
        });
        btnCumpara.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CumparaBilete.run();
            }
        });
    }


    public static void start(JFrame frame){


        mainPage.setContentPane(new MainPage().mainPanel);
        mainPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPage.setPreferredSize(new Dimension(450, 474));

        mainPage.pack();

        mainPage.setVisible(true);
        frame.setVisible(false);
    }
}
