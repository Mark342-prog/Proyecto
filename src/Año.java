import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Año extends JFrame{
    final private Font mainFont = new Font("Segoe print", Font.BOLD,18);

    JLabel lbWelcome;
    JLabel lbWelcome2;
    JLabel lbWelcome3;
    JLabel lbWelcome4;
    JLabel lbWelcome5;

    public static MainFrame myFrame;

    public void year(){



        JButton btn2020 = new JButton("2020s");
        btn2020.setFont(mainFont);
        btn2020.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Botella tras botella-Christian Nodal

  
                lbWelcome.setText("Botella tras botella-Christian Nodal");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
            }

            
        });

        JButton btn2010 = new JButton("2010s");
        btn2010.setFont(mainFont);
        btn2010.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Dark Light-Night Lovell
                //Someone like You-Adele
                //Una Vaina loca-Fuego
                //Colapso-Kevin Kaarl
                //Flor palida Enough-Marc Anthony
                //She dont give a fo-Duki
                //Gasolina-Daddy Yankee
                //Muerte en Hawaii-Calle 13
                //Bangarang-Skrillex
                //Yung Bratz-xxxtentacion
                //m.A.A.d city-Kendrick Lamaar
                //Fuentes de Ortiz-Ed Maverick

                lbWelcome.setText("Dark Light-Night Lovell");
                lbWelcome2.setText("Someone like You-Adele");
                lbWelcome3.setText("Una Vaina loca-Fuego");
                lbWelcome4.setText("Colapso-Kevin Kaarl");
                lbWelcome5.setText("Muerte en Hawaii-Calle 13");
            }

            
        });

        JButton btn2000 = new JButton("2000s");
        btn2000.setFont(mainFont);
        btn2000.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Bleed-Meshuggah
                //Eres-Cafe Tacuba
                //Feel Good Inc.-Gorillaz
                //In the End-Linkin Park
                //Memories-David Guetta

                lbWelcome.setText("Bleed-Meshuggah");
                lbWelcome2.setText("Eres-Cafe Tacuba");
                lbWelcome3.setText("Feel Good Inc.-Gorillaz");
                lbWelcome4.setText("In the End-Linkin Park");
                lbWelcome5.setText("Memories-David Guetta");
                
            }

            
        });

        JButton btn90 = new JButton("90s");
        btn90.setFont(mainFont);
        btn90.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Thunderstruck-AC/DC
                //Something in the way-Nirvana
                //De musica ligera-Soda Stereo
                //It was a good day-Ice Cube
                //Du hast-Rammstein


                lbWelcome.setText("Thunderstruck-AC/DC");
                lbWelcome2.setText("Something in the way-Nirvana");
                lbWelcome3.setText("De musica ligera-Soda Stereo");
                lbWelcome4.setText("It was a good day-Ice Cube");
                lbWelcome5.setText("Du hast-Rammstein");
            }

            
        });

        JButton btn80 = new JButton("80s");
        btn80.setFont(mainFont);
        btn80.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Por tu maldito amor-Vicente Fernández
                //Down Under-Men at Work

                lbWelcome.setText("Por tu maldito amor-Vicente Fernández");
                lbWelcome2.setText("Down Under-Men at Work");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
            }

            
        });

        JButton btn70 = new JButton("70s");
        btn70.setFont(mainFont);
        btn70.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Maggot Brain-Funkadelic
                //Paranoid-Black Sabbath
                                                
                lbWelcome.setText("Maggot Brain-Funkadelic");
                lbWelcome2.setText("Paranoid-Black Sabbath");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
            }

            
        });

        JButton btnHistoria = new JButton("<70s");
        btnHistoria.setFont(mainFont);
        btnHistoria.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Fur Elise-Beethoven
                //All along the watchtower-Jimmy Hendrix
                //Aint no Mountain High Enough-Marvin Gaye
                                                
                lbWelcome.setText("Fur Elise-Beethoven");
                lbWelcome2.setText("All along the watchtower-Jimmy Hendrix");
                lbWelcome3.setText("Aint no Mountain High Enough-Marvin Gaye");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
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

        lbWelcome2 = new JLabel();
        lbWelcome2.setFont(mainFont);

        lbWelcome3 = new JLabel();
        lbWelcome3.setFont(mainFont);

        lbWelcome4 = new JLabel();
        lbWelcome4.setFont(mainFont);

        lbWelcome5 = new JLabel();
        lbWelcome5.setFont(mainFont);

        /******************************Boton panel**************************/ 


        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });

        
        JPanel lbPanel = new JPanel();
        lbPanel.setLayout(new GridLayout(5,1,5,5));
        lbPanel.setOpaque(false);
        lbPanel.add(lbWelcome);
        lbPanel.add(lbWelcome2);
        lbPanel.add(lbWelcome3);
        lbPanel.add(lbWelcome4);
        lbPanel.add(lbWelcome5);


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
        mainPanel.add(lbPanel, BorderLayout.CENTER);
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
