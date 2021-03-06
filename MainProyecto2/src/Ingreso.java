import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;


public class Ingreso extends JFrame{
    final private Font mainFont = new Font("Segoe print", Font.BOLD,18);
    JTextField tfFirstName;
    JPasswordField tfLastName;
    JLabel lbWelcome;

    public static MainFrame myFrame;

    public void contaseña(){

        JLabel lbFirstName = new JLabel("Usuario");
        lbFirstName.setFont(mainFont);

        tfFirstName = new JTextField();
        tfFirstName.setFont(mainFont);
        tfFirstName.setText("WICHO");

        JLabel lbLastName = new JLabel("Contraseña");
        lbLastName.setFont(mainFont);

        tfLastName = new JPasswordField();
        tfLastName.setFont(mainFont);
        tfLastName.setText("WICHO123");

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout (4, 1, 5, 5));
        formPanel.setOpaque(false);
        formPanel.add(lbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);

        /******************************Welcome Label**************************/ 

        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);

        /******************************Boton panel**************************/ 

        JButton btnOK = new JButton("OK");
        btnOK.setFont(mainFont);
        btnOK.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                String firstName =tfFirstName.getText();
                String lastName = tfLastName.getText();

                if (firstName.equals("WICHO")){
                    if(lastName.equals("WICHO123")){
                        //lbWelcome.setText("Bienvenido "+ firstName+" ");
                        

                        Menu menu = new Menu();
                        menu.menu();
                        ocultar();
                        
                    }else{
                        lbWelcome.setText("Contraseña o Usuario incorrecto presione Clear e intente de nuevo");
                    }
                }else{
                    lbWelcome.setText("Contraseña o Usuario incorrecta presione Clear e intente de nuevo");
                }

               
                
            }

            
        });

        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                tfFirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("");
                
            }

            
        });

        






        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1,2,5,5));
        buttonsPanel.setOpaque(false);
        buttonsPanel.add(btnOK);
        buttonsPanel.add(btnClear);


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(lbWelcome, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);

        add(mainPanel);


        setTitle("Musicon");
        setSize(500,600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


    }

    public void ingresar(){
        myFrame = new MainFrame();
        contaseña();
        
    }

    public void ocultar(){
        this.dispose();
    }

    
}
