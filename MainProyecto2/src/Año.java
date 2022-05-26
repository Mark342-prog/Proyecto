import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Año extends JFrame{
    final private Font mainFont = new Font("Segoe print", Font.BOLD,18);

    JLabel lbWelcome;

    public static MainFrame myFrame;

    public void year(){



        JButton btn2020 = new JButton("2020s");
        btn2020.setFont(mainFont);
        btn2020.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

  
                lbWelcome.setText("");
                
            }

            
        });

        JButton btn2010 = new JButton("2010s");
        btn2010.setFont(mainFont);
        btn2010.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("");
                
            }

            
        });

        JButton btn2000 = new JButton("2000s");
        btn2000.setFont(mainFont);
        btn2000.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("");
                
            }

            
        });

        JButton btn90 = new JButton("90s");
        btn90.setFont(mainFont);
        btn90.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("");
                
            }

            
        });

        JButton btn80 = new JButton("80s");
        btn80.setFont(mainFont);
        btn80.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("");
                
            }

            
        });

        JButton btn70 = new JButton("70s");
        btn70.setFont(mainFont);
        btn70.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("");
                
            }

            
        });

        JButton btnHistoria = new JButton("<70s");
        btnHistoria.setFont(mainFont);
        btnHistoria.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("");
                
            }

            
        });

        



        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout (6, 4, 5, 5));
        formPanel.setOpaque(false);
        formPanel.add(btn2020);
        formPanel.add(btn2010);
        formPanel.add(btn2000);
        formPanel.add(btn90);
        formPanel.add(btn80);
        formPanel.add(btn70);
        formPanel.add(btnHistoria);
        
        //formPanel.add(btnMex);
        //formPanel.add(btnMex);
        //formPanel.add(btnMex);



        /******************************Welcome Label**************************/ 

        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);

        /******************************Boton panel**************************/ 


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
        year();
        
    }

    public void ocultar(){
        this.dispose();
    }

    
}
