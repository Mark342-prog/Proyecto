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

        JButton btnFolk = new JButton("Folk");
        btnFolk.setFont(mainFont);
        btnFolk.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("");
                
            }

            
        });

        JButton btnHeavy = new JButton("Heavy Metal");
        btnHeavy.setFont(mainFont);
        btnHeavy.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("");
                
            }

            
        });

        JButton btnHard = new JButton("Hard Rock");
        btnHard.setFont(mainFont);
        btnHard.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("");
                
            }

            
        });

        JButton btnMex = new JButton("Regional Mexicana");
        btnMex.setFont(mainFont);
        btnMex.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("");
                
            }

            
        });

        JButton btnRockE = new JButton("Rock Español");
        btnRockE.setFont(mainFont);
        btnRockE.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("");
                
            }

            
        });

        JButton btnNewWave = new JButton("New Wave");
        btnNewWave.setFont(mainFont);
        btnNewWave.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("");
                
            }

            
        });

        JButton btnElectronica = new JButton("Electrónica");
        btnElectronica.setFont(mainFont);
        btnElectronica.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("");
                
            }

            
        });

        JButton btnHouse = new JButton("House");
        btnHouse.setFont(mainFont);
        btnHouse.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("");
                
            }

            
        });

        JButton btnClasica = new JButton("Clásica");
        btnClasica.setFont(mainFont);
        btnClasica.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("");
                
            }

            
        });

        JButton btnSinfonia = new JButton("Sinfonia");
        btnSinfonia.setFont(mainFont);
        btnSinfonia.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("");
                
            }

            
        });

        JButton btnUrbanL = new JButton("Urban Latino");
        btnUrbanL.setFont(mainFont);
        btnUrbanL.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("");
                
            }

            
        });

        JButton btnInfantil = new JButton("Infantil");
        btnInfantil.setFont(mainFont);
        btnInfantil.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("");
                
            }

            
        });

        JButton btnRanchera = new JButton("Ranchera");
        btnRanchera.setFont(mainFont);
        btnRanchera.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("");
                
            }

            
        });



        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout (6, 4, 5, 5));
        formPanel.setOpaque(false);
        formPanel.add(btnPop);
        formPanel.add(btnRock);
        formPanel.add(btnRB);
        formPanel.add(btnFrench);
        formPanel.add(btnDance);
        formPanel.add(btnDisco);
        formPanel.add(btnFolk);
        formPanel.add(btnHeavy);
        formPanel.add(btnHard);
        formPanel.add(btnMex);
        formPanel.add(btnElectronica);
        formPanel.add(btnNewWave);
        formPanel.add(btnRockE);
        formPanel.add(btnHouse);
        formPanel.add(btnClasica);
        formPanel.add(btnSinfonia);
        formPanel.add(btnUrbanL);
        formPanel.add(btnInfantil);
        formPanel.add(btnRanchera);
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
        generos();
        
    }

    public void ocultar(){
        this.dispose();
    }

}
