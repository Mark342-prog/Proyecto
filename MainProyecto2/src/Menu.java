import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;



public class Menu extends JFrame{
    final private Font mainFont = new Font("Segoe print", Font.BOLD,18);
    JTextField tfFirstName;

    JLabel lbWelcome;

    public void menu(MainFrame mu){

        mu.setVisible(false);

        JLabel lbFirstName = new JLabel("¿Cómo desea obtener recomendaciones?");
        lbFirstName.setFont(mainFont);

        JLabel lbOp1 = new JLabel("1. Género");
        lbOp1.setFont(mainFont);

        JLabel lbOp2 = new JLabel("2. Tiempo de duración");
        lbOp2.setFont(mainFont);

        JLabel lbOp3 = new JLabel("3. Años");
        lbOp3.setFont(mainFont);

        tfFirstName = new JTextField();
        tfFirstName.setFont(mainFont);
       

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout (1, 1, 5, 5));
        formPanel.setOpaque(false);
        formPanel.add(lbFirstName);
        

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

                if (firstName.equals("1")){

                    
                    
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
                lbWelcome.setText("");
                
            }

            
        });

        JButton btnMenu = new JButton("Menu");
        btnMenu.setFont(mainFont);
        btnMenu.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                
                
            }

            
        });


        JPanel centerPanel= new JPanel();
        centerPanel.setLayout(new GridLayout(4,1,5,5));
        centerPanel.setOpaque(false);
        centerPanel.add(lbOp1);
        centerPanel.add(lbOp2);
        centerPanel.add(lbOp3);
        centerPanel.add(lbWelcome);
        centerPanel.add(tfFirstName);



        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(2,2,5,5));
        buttonsPanel.setOpaque(false);
        buttonsPanel.add(btnOK);
        buttonsPanel.add(btnClear);


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);

        add(mainPanel);


        setTitle("Musicon");
        setSize(500,600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


    }
    
    
}
