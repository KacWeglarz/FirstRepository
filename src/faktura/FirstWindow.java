package faktura;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstWindow extends JFrame{
    private JButton Submit;
    private JPanel panel1;
    private JLabel Label1;
    private JTextArea Name;
    private JTextArea Surname;
    private JTextArea NIP;
    private JTextArea Price;
    private JLabel labelForName;
    private JLabel labelForSurname;
    private JLabel labelForNIP;
    private JLabel labelForPrice;

    public FirstWindow(){
        setContentPane(panel1);
        setVisible(true);
        setSize(800, 600);


        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            WrongValidation obj = new WrongValidation();
            setVisible(true);

            CorectValidation obj1 = new CorectValidation();
            setVisible(true);


            }
        });
    }

    public static void main(String[] args) {
        new FirstWindow();

    }
}
