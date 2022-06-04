import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

/*--------------------------------------------
Guatemala Viernes 3 de Junio del 2022
Algoritmos y estructura de datos
Proyecto final 
Grupo 1
Walter Cruz 20673
Andres Chivalan
Luis
Cindy 

Esta clase recomienda por artista
Se llama Duracion ya que la idea original era recomendar por tiempo
---------------------------*/

public class Duracion extends JFrame{
    final private Font mainFont = new Font("Segoe print", Font.BOLD,18);
    JTextField tfFirstName, tfLastName;
    JLabel lbWelcome;
    JLabel lbWelcome2;
    JLabel lbWelcome3;
    JLabel lbWelcome4;
    JLabel lbWelcome5;

    public static MainFrame myFrame;

    public void duration(){

        
        //Botones que recomiendan por genero
        //Explicación del funcionamiento en clase Generos (funcionan de la misma manera)
        JButton btnPop = new JButton("AC/DC");
        btnPop.setFont(mainFont);
        btnPop.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

  
                lbWelcome.setText("Thunderstruck");
                
            }

            
        });

        JButton btnRock = new JButton("Nirvana");
        btnRock.setFont(mainFont);
        btnRock.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("Something in the Way");
                
            }

            
        });

        JButton btnRB = new JButton("Night Lovell");
        btnRB.setFont(mainFont);
        btnRB.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("Dark Light");
                
            }

            
        });

        JButton btnFrench = new JButton("Adele");
        btnFrench.setFont(mainFont);
        btnFrench.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("Someone like You");
                
            }

            
        });

        JButton btnDance = new JButton("Soda Stereo");
        btnDance.setFont(mainFont);
        btnDance.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("De Música Ligera");
                
            }

            
        });

        JButton btnDisco = new JButton("Calle 13");
        btnDisco.setFont(mainFont);
        btnDisco.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("Muerte en Hawaii");
                
            }

            
        });

        JButton btnFolk = new JButton("Fuego");
        btnFolk.setFont(mainFont);
        btnFolk.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("Una Vaina Loca ");
                
            }

            
        });

        JButton btnHeavy = new JButton("Kevin Kaarl");
        btnHeavy.setFont(mainFont);
        btnHeavy.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("Colapso");
                
            }

            
        });

        JButton btnHard = new JButton("Beethoven");
        btnHard.setFont(mainFont);
        btnHard.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("Für Elise ");
                
            }

            
        });

        JButton btnMex = new JButton("Marc Anthony");
        btnMex.setFont(mainFont);
        btnMex.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("Flor pálida");
                
            }

            
        });

        JButton btnRockE = new JButton("Christian Nodal");
        btnRockE.setFont(mainFont);
        btnRockE.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("Botella tras botella ");
                
            }

            
        });

        JButton btnNewWave = new JButton("Ice Cube");
        btnNewWave.setFont(mainFont);
        btnNewWave.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("It was a good day");
                
            }

            
        });

        JButton btnElectronica = new JButton("Duki");
        btnElectronica.setFont(mainFont);
        btnElectronica.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("She dont give a fo");
                
            }

            
        });

        JButton btnHouse = new JButton("Daddy Yankee");
        btnHouse.setFont(mainFont);
        btnHouse.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("Gasolina");
                
            }

            
        });

        JButton btnClasica = new JButton("Vicente Fernández");
        btnClasica.setFont(mainFont);
        btnClasica.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("Por tu maldito amor");
                
            }

            
        });

        JButton btnSinfonia = new JButton("Meshuggah");
        btnSinfonia.setFont(mainFont);
        btnSinfonia.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("Bleed");
                
            }

            
        });

        JButton btnUrbanL = new JButton("Men at Work");
        btnUrbanL.setFont(mainFont);
        btnUrbanL.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("Down Under");
                
            }

            
        });

        JButton btnInfantil = new JButton("Rammstein");
        btnInfantil.setFont(mainFont);
        btnInfantil.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("Du hast");
                
            }

            
        });

        JButton btnRanchera = new JButton("Jimmy Hendrix");
        btnRanchera.setFont(mainFont);
        btnRanchera.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("All along the watchtower");
                
            }

            
        });

        JButton btnCafe = new JButton("Café Tacuba");
        btnCafe.setFont(mainFont);
        btnCafe.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("Eres");
                
            }

            
        });

        JButton btnMarvinGaye = new JButton("Marvin Gaye");
        btnMarvinGaye.setFont(mainFont);
        btnMarvinGaye.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("Aint no Mountain High Enough");
                
            }

            
        });

        JButton btnGorillaz = new JButton("Gorillaz");
        btnGorillaz.setFont(mainFont);
        btnGorillaz.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("Feel Good Inc.");
                
            }

            
        });

        JButton btnBlackSabbath = new JButton("Black Sabbath");
        btnBlackSabbath.setFont(mainFont);
        btnBlackSabbath.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("Paranoid");
                
            }

            
        });

        JButton btnFunkadelic = new JButton("Funkadelic");
        btnFunkadelic.setFont(mainFont);
        btnFunkadelic.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("Maggot Brain");
                
            }

            
        });

        JButton btnLinkinPark = new JButton("Linkin Park");
        btnLinkinPark.setFont(mainFont);
        btnLinkinPark.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("In the End");
                
            }

            
        });

        JButton btnSkrillex = new JButton("Skrillex");
        btnSkrillex.setFont(mainFont);
        btnSkrillex.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("Bangarang");
                
            }

            
        });

        JButton btnDavidGuetta = new JButton("David Guetta");
        btnDavidGuetta.setFont(mainFont);
        btnDavidGuetta.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("Memories");
                
            }

            
        });

        JButton btnxxxtentacion = new JButton("xxxtentacion");
        btnxxxtentacion.setFont(mainFont);
        btnxxxtentacion.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("Yung Bratz");
                
            }

            
        });

        JButton btnKendrickLamaar = new JButton("Kendrick Lamaar");
        btnKendrickLamaar.setFont(mainFont);
        btnKendrickLamaar.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("m.A.A.d city");
                
            }

            
        });

        JButton btnEdMaverick = new JButton("Ed Maverick");
        btnEdMaverick.setFont(mainFont);
        btnEdMaverick.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("Fuentes de Ortiz");
                
            }

            
        });



        //Panel que ordena los botones de los artistas
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout (6, 5, 5, 5));
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
        formPanel.add(btnCafe);
        formPanel.add(btnMarvinGaye);
        formPanel.add(btnGorillaz);
        formPanel.add(btnBlackSabbath);
        formPanel.add(btnFunkadelic);
        formPanel.add(btnLinkinPark);
        formPanel.add(btnSkrillex);
        formPanel.add(btnDavidGuetta);
        formPanel.add(btnxxxtentacion);
        formPanel.add(btnKendrickLamaar);
        formPanel.add(btnEdMaverick);



        /******************************Configuracion de Labels**************************/ 

        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);

        

        /******************************Panel de botones clear y Menu; y labels**************************/ 


        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                lbWelcome.setText("");
                
            }

            
        });
        //Regreso a Menu
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
        





        //Ordena los Botones Clear y Menu
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1,3,5,5));
        buttonsPanel.setOpaque(false);
        buttonsPanel.add(btnClear);
        buttonsPanel.add(btnMenu);

        //Ordena Panel de Artistas; a los labels y a los botones Clear y Menu
        //Misma estructura que Generos
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
    //Donde se comunican las demas clases
    public void ingresar(){
        myFrame = new MainFrame();
        duration();
        
    }
    //Ocultar ventana
    public void ocultar(){
        this.dispose();
    }
}
