import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;


public class Generos extends JFrame{
    final private Font mainFont = new Font("Segoe print", Font.BOLD,18);

    JLabel lbWelcome;

    public static MainFrame myFrame;

    public void generos(){



        JButton btnPop = new JButton("Pop");
        btnPop.setFont(mainFont);
        btnPop.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

  
                lbWelcome.setText("");
                
            }

            
        });

        JButton btnRock = new JButton("Rock");
        btnRock.setFont(mainFont);
        btnRock.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("");
                
            }

            
        });

        JButton btnRB = new JButton("R&B");
        btnRB.setFont(mainFont);
        btnRB.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("");
                
            }

            
        });

        JButton btnFrench = new JButton("French Urban");
        btnFrench.setFont(mainFont);
        btnFrench.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("");
                
            }

            
        });

        JButton btnDance = new JButton("Dance");
        btnDance.setFont(mainFont);
        btnDance.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("");
                
            }

            
        });

        JButton btnDisco = new JButton("Disco");
        btnDisco.setFont(mainFont);
        btnDisco.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("");
                
            }

            
        });

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout (4, 4, 5, 5));
        formPanel.setOpaque(false);
        formPanel.add(btnPop);
        formPanel.add(btnRock);
        formPanel.add(btnRB);
        formPanel.add(btnFrench);
        formPanel.add(btnDance);
        formPanel.add(btnDisco);

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

                String firstName="";
                String lastName="";

                if (firstName.equals("pop")){
                    if(lastName.equals("rock")){
                        //lbWelcome.setText("Bienvenido "+ firstName+" ");
                        
                        lbWelcome.setText("1. Bones-Imagine_Dragons\n2. Camisa_Negra-Juanes\n3. Counting_Stars-One_Republic");
                        
                        
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


                lbWelcome.setText("");
                
            }

            
        });

        JButton btnMenu = new JButton("Menu");
        btnMenu.setFont(mainFont);
        btnMenu.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                Menu menu = new Menu();
                menu.menu();
                ocultar();
                
            }

            
        });
        






        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1,3,5,5));
        buttonsPanel.setOpaque(false);
        buttonsPanel.add(btnOK);
        buttonsPanel.add(btnClear);
        buttonsPanel.add(btnMenu);


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
        generos();
        
    }

    public void ocultar(){
        this.dispose();
    }

}
