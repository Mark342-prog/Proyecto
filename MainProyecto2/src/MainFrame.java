import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class MainFrame extends JFrame{
    public Ingreso genero= new Ingreso();
    final private Font mainFont = new Font("Segoe print", Font.BOLD,18);
    JTextField tfFirstName, tfLastName;

    JLabel lbWelcome;
    JLabel lbOk;

    public static MainFrame myFrame;

    public void initialize(){



        /******************************Welcome Label**************************/ 

        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);
        lbWelcome.setText("Bienvenido a Yosi recomendaciones");
        lbWelcome.setOpaque(true);


         /******************************OK LABEL**************************/ 

         lbOk = new JLabel();
         lbOk.setFont(mainFont);
         lbOk.setText("Presione ok para continuar");


        /******************************Boton panel**************************/ 

        JButton btnOK = new JButton("OK");
        btnOK.setFont(mainFont);
        btnOK.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                
                genero.ingresar();
                myFrame.setVisible(false);

                
            }

            
        });


        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1,2,5,5));
        buttonsPanel.setOpaque(false);
        buttonsPanel.add(btnOK);


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        mainPanel.add(lbWelcome, BorderLayout.NORTH);
        mainPanel.add(lbOk, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);

        add(mainPanel);


        setTitle("Musicon");
        setSize(500,600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


    }

    public static void main(String[] args){
        myFrame = new MainFrame();
        myFrame.initialize();

    }

    public void ocultar(){

    }

}