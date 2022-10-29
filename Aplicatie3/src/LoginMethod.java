import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginMethod {
    private JTextField tfUsername;
    private JPasswordField pfPassword;
    private JButton btnLogin;
    private JPanel loginPanel;
    private static JFrame frame = new JFrame("Login");

    public LoginMethod() {
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = tfUsername.getText();
                String pass = pfPassword.getText();
                if(user.equals(AdminUser.getUtilizator()) && pass.equals(AdminUser.getPassword()))
                   MainPage.start(frame);
                else
                    JOptionPane.showMessageDialog(null,"Utilizator sau parola gresita");
            }
        });
    }

    public static void main(String[] args) {


        frame.setContentPane(new LoginMethod().loginPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setPreferredSize(new Dimension(450, 474));
        ImageIcon image = new ImageIcon("home.png");
        frame.setIconImage(image.getImage());
        frame.pack();

        frame.setVisible(true);
    }
}
