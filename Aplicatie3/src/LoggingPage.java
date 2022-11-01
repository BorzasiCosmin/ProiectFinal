import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LoggingPage {
    private JList lstActionLog;
    private JPanel panelLog;
    private JButton btnAfiseaza;

    public static ArrayList<String> arrayLog;


    public LoggingPage() {
        btnAfiseaza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshList1();
            }
        });
    }

    public void refreshList1(){
        lstActionLog.setListData(arrayLog.toArray());

    }
    public static void start(){
        JFrame panelLog = new JFrame("Action Log");
        panelLog.setContentPane(new LoggingPage().panelLog);

        panelLog.setPreferredSize(new Dimension(450, 474));

        panelLog.pack();

        panelLog.setVisible(true);

    }
    public static void adaugaLog(String message){
        arrayLog = new ArrayList<String>();
        arrayLog.add(message);
    }
}
