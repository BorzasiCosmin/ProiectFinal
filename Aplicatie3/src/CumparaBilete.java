import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CumparaBilete {
    private JTextField txtNumeCautat;
    private JTextField txtNrBilete;
    private JButton cumparaButton;
    private JPanel buyPanel;

    public CumparaBilete() {
        cumparaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeFilm = txtNumeCautat.getText();
                Integer bil = Integer.parseInt(txtNrBilete.getText());
                for(int i=0;i<AdaugareFilm.arr.size();i++)
                    if(AdaugareFilm.arr.get(i).getNumeFilm().equals(numeFilm))
                    {
                        int comp=Integer.compare(AdaugareFilm.arr.get(i).getBileteFilm(),bil);
                        if(comp>=0)
                            AdaugareFilm.arr.get(i).setBileteFilm(bil);
                        else
                            if(comp<0)
                                JOptionPane.showMessageDialog(null,"Nu sunt atatea bilete disponibile");

                    }
            }
        });
    }

    public static void run(){
        JFrame buyPage = new JFrame("Cumpara Bilete");
        buyPage.setContentPane(new CumparaBilete().buyPanel);


        buyPage.setPreferredSize(new Dimension(450, 474));

        buyPage.pack();

        buyPage.setVisible(true);
    }
}
