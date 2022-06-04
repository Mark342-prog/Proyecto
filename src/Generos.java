import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;


public class Generos extends JFrame{
    final private Font mainFont = new Font("Segoe print", Font.BOLD,18);

    JLabel lbWelcome;
    JLabel lbWelcome2;
    JLabel lbWelcome3;
    JLabel lbWelcome4;
    JLabel lbWelcome5;


    public static MainFrame myFrame;

    public void generos(){


        //
        JButton btnPop = new JButton("Pop");
        btnPop.setFont(mainFont);
        btnPop.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Someone like You-Adele
                //Muerte en Hawaii-Calle 13
                //Flor palida Enough-Marc Anthony
                //Gasolina-Daddy Yankee
                //Down Under-Men at Work

                lbWelcome.setText("Someone like You-Adele");
                lbWelcome2.setText("Muerte en Hawaii-Calle 13");
                lbWelcome3.setText("Flor palida Enough-Marc Anthony");
                lbWelcome4.setText("Gasolina-Daddy Yankee");
                lbWelcome5.setText("Down Under-Men at Work");
                
            }

            
        });

        //
        JButton btnRock = new JButton("Rock");
        btnRock.setFont(mainFont);
        btnRock.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Thunderstruck-AC/DC
                //Something in the way-Nirvana
                //All along the watchtower-Jimmy Hendrix
                //Eres-Cafe Tacuba
                //Paranoid-Black Sabbath
                //In the End-Linkin Park

                lbWelcome.setText("Thunderstruck-AC/DC");
                lbWelcome2.setText("Something in the way-Nirvana");
                lbWelcome3.setText("All along the watchtower-Jimmy Hendrix");
                lbWelcome4.setText("Eres-Cafe Tacuba");
                lbWelcome5.setText("In the End-Linkin Park");
                
            }

            
        });
       
        //
        JButton btnRB = new JButton("R&B");
        btnRB.setFont(mainFont);
        btnRB.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Someone like You-Adele
                //Aint no Mountain High Enough-Marvin Gaye
                //Feel Good Inc.-Gorillaz
                //Maggot Brain-Funkadelic
                //All along the watchtower-Jimmy Hendrix


                lbWelcome.setText("Someone like You-Adele");
                lbWelcome2.setText("Aint no Mountain High Enough-Marvin Gaye");
                lbWelcome3.setText("Feel Good Inc.-Gorillaz");
                lbWelcome4.setText("Maggot Brain-Funkadelic");
                lbWelcome5.setText("All along the watchtower-Jimmy Hendrix");
                
            }

            
        });

        //
        JButton btnFrench = new JButton("Independiente");
        btnFrench.setFont(mainFont);
        btnFrench.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Colapso-Kevin Kaarl
                
                lbWelcome.setText("Colapso-Kevin Kaarl");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });

        //
        JButton btnDance = new JButton("Dance");
        btnDance.setFont(mainFont);
        btnDance.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Bangarang-Skrillex
                                
                lbWelcome.setText("Bangarang-Skrillex");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });

        //
        JButton btnDisco = new JButton("Piano");
        btnDisco.setFont(mainFont);
        btnDisco.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Fur Elise-Beethoven
                                
                lbWelcome.setText("Fur Elise-Beethoven");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });

        //
        JButton btnFolk = new JButton("Folk");
        btnFolk.setFont(mainFont);
        btnFolk.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Colapso-Kevin Kaarl
                //Fuentes de Ortiz-Ed Maverick
                                
                lbWelcome.setText("Colapso-Kevin Kaarl");
                lbWelcome2.setText("Fuentes de Ortiz-Ed Maverick");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });

        //
        JButton btnHeavy = new JButton("Heavy Metal");
        btnHeavy.setFont(mainFont);
        btnHeavy.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Thunderstruck-AC/DC
                //Bleed-Meshuggah
                //Du hast-Rammstein
                //Paranoid-Black Sabbath

                lbWelcome.setText("Thunderstruck-AC/DC");
                lbWelcome2.setText("Paranoid-Black Sabbath");
                lbWelcome3.setText("Du hast-Rammstein");
                lbWelcome4.setText("Bleed-Meshuggah");
                lbWelcome5.setText("");
                
            }

            
        });

        //
        JButton btnHard = new JButton("Hard Rock");
        btnHard.setFont(mainFont);
        btnHard.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Thunderstruck-AC/DC
                //Paranoid-Black Sabbath

                lbWelcome.setText("Thunderstruck-AC/DC");
                lbWelcome2.setText("Paranoid-Black Sabbath");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });

        //
        JButton btnMex = new JButton("Regional Mexicana");
        btnMex.setFont(mainFont);
        btnMex.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Botella tras botella-Christian Nodal
                //Por tu maldito amor-Vicente Fernández

                lbWelcome.setText("Por tu maldito amor-Vicente Fernández");
                lbWelcome2.setText("Botella tras botella-Christian Nodal");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });

        //
        JButton btnRockE = new JButton("Rock Español");
        btnRockE.setFont(mainFont);
        btnRockE.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //De musica ligera-Soda Stereo
                //Eres-Cafe Tacuba

                lbWelcome.setText("De musica ligera-Soda Stereo");
                lbWelcome2.setText("Eres-Cafe Tacuba");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });

        //
        JButton btnNewWave = new JButton("New Wave");
        btnNewWave.setFont(mainFont);
        btnNewWave.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Down Under-Men at Work

                lbWelcome.setText("Down Under-Men at Work");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });

        //
        JButton btnElectronica = new JButton("Electrónica");
        btnElectronica.setFont(mainFont);
        btnElectronica.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Bangarang-Skrillex
                                
                lbWelcome.setText("Bangarang-Skrillex");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });

        //
        JButton btnHouse = new JButton("House");
        btnHouse.setFont(mainFont);
        btnHouse.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Memories-David Guetta

                lbWelcome.setText("Memories-David Guetta");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });

        //
        JButton btnClasica = new JButton("Clásica");
        btnClasica.setFont(mainFont);
        btnClasica.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Fur Elise-Beethoven
                                
                lbWelcome.setText("Fur Elise-Beethoven");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });

        //
        JButton btnSinfonia = new JButton("G-funk");
        btnSinfonia.setFont(mainFont);
        btnSinfonia.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //It was a good day-Ice Cube

                lbWelcome.setText("It was a good day-Ice Cube");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });

        //
        JButton btnUrbanL = new JButton("Urban Latino");
        btnUrbanL.setFont(mainFont);
        btnUrbanL.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Una Vaina loca-Fuego
                //Muerte en Hawaii-Calle 13
                //Botella tras botella-Christian Nodal
                //She dont give a fo-Duki
                //Gasolina-Daddy Yankee

                lbWelcome.setText("Una Vaina loca-Fuego");
                lbWelcome2.setText("Muerte en Hawaii-Calle 13");
                lbWelcome3.setText("Botella tras botella-Christian Nodal");
                lbWelcome4.setText("She dont give a fo-Duki");
                lbWelcome5.setText("Gasolina-Daddy Yankee");
                
            }

            
        });

        //
        JButton btnAlternativa = new JButton("Alternativa");
        btnAlternativa.setFont(mainFont);
        btnAlternativa.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Something in the way-Nirvana
                //Colapso-Kevin Kaarl
                //Eres-Cafe Tacuba
                //Fuentes de Ortiz-Ed Maverick
                
                lbWelcome.setText("Something in the way-Nirvana");
                lbWelcome2.setText("Colapso-Kevin Kaarl");
                lbWelcome3.setText("Eres-Cafe Tacuba");
                lbWelcome4.setText("Fuentes de Ortiz-Ed Maverick");
                lbWelcome5.setText("");
            }

            
        });

        //
        JButton btnRanchera = new JButton("Trap Latino");
        btnRanchera.setFont(mainFont);
        btnRanchera.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //She dont give a fo-Duki

                lbWelcome.setText("She dont give a fo-Duki");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });
      
        //
        JButton btnAcousticRock = new JButton("Acoustic Rock");
        btnAcousticRock.setFont(mainFont);
        btnAcousticRock.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Something in the way-Nirvana


                lbWelcome.setText("Something in the way-Nirvana");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });
        
        //
        JButton btnSoul = new JButton("Soul");
        btnSoul.setFont(mainFont);
        btnSoul.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Someone like You-Adele
                //All along the watchtower-Jimmy Hendrix
                //Aint no Mountain High Enough-Marvin Gaye

                lbWelcome.setText("Someone like You-Adele");
                lbWelcome2.setText("All along the watchtower-Jimmy Hendrix");
                lbWelcome3.setText("Aint no Mountain High Enough-Marvin Gaye");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });
        
        //
        JButton btnRockAlternativo = new JButton("Rock Alternativo");
        btnRockAlternativo.setFont(mainFont);
        btnRockAlternativo.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //De musica ligera-Soda Stereo
                //Feel Good Inc.-Gorillaz

                lbWelcome.setText("De musica ligera-Soda Stereo");
                lbWelcome2.setText("Feel Good Inc.-Gorillaz");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });
        
        //
        JButton btnPowerPop = new JButton("Power Pop");
        btnPowerPop.setFont(mainFont);
        btnPowerPop.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //De musica ligera-Soda Stereo

                lbWelcome.setText("De musica ligera-Soda Stereo");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });
        
        //
        JButton btnTropical = new JButton("Musica Tropical");
        btnTropical.setFont(mainFont);
        btnTropical.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Flor palida Enough-Marc Anthony
                //Muerte en Hawaii-Calle 13

                lbWelcome.setText("Flor palida Enough-Marc Anthony");
                lbWelcome2.setText("Muerte en Hawaii-Calle 13");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });
        
        //
        JButton btnReggaeton = new JButton("Reggaeton");
        btnReggaeton.setFont(mainFont);
        btnReggaeton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Una Vaina loca-Fuego
                //Gasolina-Daddy Yankee

                lbWelcome.setText("Una Vaina loca-Fuego");
                lbWelcome2.setText("Gasolina-Daddy Yankee");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });
        
        //
        JButton btnDembow = new JButton("Dembow");
        btnDembow.setFont(mainFont);
        btnDembow.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Una Vaina loca-Fuego

                lbWelcome.setText("Una Vaina loca-Fuego");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });
        
        //
        JButton btnRap = new JButton("Rap");
        btnRap.setFont(mainFont);
        btnRap.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Dark Light-Night Lovell
                //Botella tras botella-Christian Nodal
                //It was a good day-Ice Cube
                //Yung Bratz-xxxtentacion
                //m.A.A.d city-Kendrick Lamaar

                lbWelcome.setText("Dark Light-Night Lovell");
                lbWelcome2.setText("Botella tras botella-Christian Nodal");
                lbWelcome3.setText("It was a good day-Ice Cube");
                lbWelcome4.setText("Yung Bratz-xxxtentacion");
                lbWelcome5.setText("m.A.A.d city-Kendrick Lamaar");
                
            }

            
        });
        
        //
        JButton btnHipHop = new JButton("Hip Hop");
        btnHipHop.setFont(mainFont);
        btnHipHop.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Dark Light-Night Lovell
                //It was a good day-Ice Cube
                //Feel Good Inc.-Gorillaz
                //Memories-David Guetta

                lbWelcome.setText("Dark Light-Night Lovell");
                lbWelcome2.setText("Feel Good Inc.-Gorillaz");
                lbWelcome3.setText("It was a good day-Ice Cube");
                lbWelcome4.setText("Memories-David Guetta");
                lbWelcome5.setText("");
                
            }

            
        });

        //
        JButton btnTrap = new JButton("Trap");
        btnTrap.setFont(mainFont);
        btnTrap.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Dark Light-Night Lovell
                //She dont give a fo-Duki

                lbWelcome.setText("Dark Light-Night Lovell");
                lbWelcome2.setText("She dont give a fo-Duki");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });

        //
        JButton btnBachata = new JButton("Bachata");
        btnBachata.setFont(mainFont);
        btnBachata.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Flor palida Enough-Marc Anthony

                lbWelcome.setText("Flor palida Enough-Marc Anthony");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });

        //
        JButton btnMaraichi = new JButton("Mariachi");
        btnMaraichi.setFont(mainFont);
        btnMaraichi.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Por tu maldito amor-Vicente Fernández

                lbWelcome.setText("Por tu maldito amor-Vicente Fernández");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });

        
        //
        JButton btnMetalProgresivo = new JButton("Metal Progresivo");
        btnMetalProgresivo.setFont(mainFont);
        btnMetalProgresivo.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Bleed-Meshuggah

                lbWelcome.setText("Bleed-Meshuggah");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });
        
        //
        JButton btnDjent = new JButton("Djent");
        btnDjent.setFont(mainFont);
        btnDjent.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Bleed-Meshuggah

                lbWelcome.setText("Bleed-Meshuggah");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });
        
        //
        JButton btnPopRock = new JButton("Pop Rock");
        btnPopRock.setFont(mainFont);
        btnPopRock.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Down Under-Men at Work

                lbWelcome.setText("Down Under-Men at Work");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });
        
        //
        JButton btnMetalIn = new JButton("Metal Industrial");
        btnMetalIn.setFont(mainFont);
        btnMetalIn.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Du hast-Rammstein

                lbWelcome.setText("Du hast-Rammstein");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });
        
        //
        JButton btnNuMetal = new JButton("Nu Metal");
        btnNuMetal.setFont(mainFont);
        btnNuMetal.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Du hast-Rammstein
                //In the End-Linkin Park


                lbWelcome.setText("Du hast-Rammstein");
                lbWelcome2.setText("In the End-Linkin Park");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });
        
        //
        JButton btnFR = new JButton("Folk Rock");
        btnFR.setFont(mainFont);
        btnFR.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //All along the watchtower-Jimmy Hendrix


                lbWelcome.setText("All along the watchtower-Jimmy Hendrix");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });
        
        //
        JButton btnFuR = new JButton("Funk Rock");
        btnFuR.setFont(mainFont);
        btnFuR.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Maggot Brain-Funkadelic


                lbWelcome.setText("Maggot Brain-Funkadelic");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });
        
        //
        JButton btnPF = new JButton("Psychedelic Funk");
        btnPF.setFont(mainFont);
        btnPF.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Maggot Brain-Funkadelic


                lbWelcome.setText("Maggot Brain-Funkadelic");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });
        
        //
        JButton btnRR = new JButton("Rap Rock");
        btnRR.setFont(mainFont);
        btnRR.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //In the End-Linkin Park


                lbWelcome.setText("In the End-Linkin Park");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });

        //
        JButton btnEH = new JButton("Electro House");
        btnEH.setFont(mainFont);
        btnEH.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Bangarang-Skrillex
                                
                lbWelcome.setText("Bangarang-Skrillex");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });

        //
        JButton btnTP = new JButton("Techno Pop");
        btnTP.setFont(mainFont);
        btnTP.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Memories-David Guetta

                lbWelcome.setText("Memories-David Guetta");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });

        //
        JButton btnTM = new JButton("Trap Metal");
        btnTM.setFont(mainFont);
        btnTM.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Yung Bratz-xxxtentacion

                lbWelcome.setText("Yung Bratz-xxxtentacion");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });
  
        //
        JButton btnSHH = new JButton("Southen Hip Hop");
        btnSHH.setFont(mainFont);
        btnSHH.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Yung Bratz-xxxtentacion

                lbWelcome.setText("Yung Bratz-xxxtentacion");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });
       
        //
        JButton btnGR = new JButton("Gangsta Rap");
        btnGR.setFont(mainFont);
        btnGR.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //m.A.A.d city-Kendrick Lamaar

                lbWelcome.setText("m.A.A.d city-Kendrick Lamaar");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });
       
        //
        JButton btnWHH = new JButton("West Coast Hip Hop");
        btnWHH.setFont(mainFont);
        btnWHH.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //m.A.A.d city-Kendrick Lamaar

                lbWelcome.setText("m.A.A.d city-Kendrick Lamaar");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });
       
        //
        JButton btnMusica = new JButton("Musica Tradicional");
        btnMusica.setFont(mainFont);
        btnMusica.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Fuentes de Ortiz-Ed Maverick

                lbWelcome.setText("Fuentes de Ortiz-Ed Maverick");
                lbWelcome2.setText("");
                lbWelcome3.setText("");
                lbWelcome4.setText("");
                lbWelcome5.setText("");
                
            }

            
        });




        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout (7, 6, 5, 5));
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
        formPanel.add(btnAlternativa);
        formPanel.add(btnRanchera);
        formPanel.add(btnAcousticRock);
        formPanel.add(btnSoul);
        formPanel.add(btnRockAlternativo);
        formPanel.add(btnPowerPop);
        formPanel.add(btnTropical);
        formPanel.add(btnReggaeton);
        formPanel.add(btnDembow);
        formPanel.add(btnRap);
        formPanel.add(btnHipHop);
        formPanel.add(btnTrap);
        formPanel.add(btnBachata);
        formPanel.add(btnMaraichi);
        formPanel.add(btnMetalProgresivo);
        formPanel.add(btnDjent);
        formPanel.add(btnPopRock);
        formPanel.add(btnMetalIn);
        formPanel.add(btnNuMetal);
        formPanel.add(btnFR);
        formPanel.add(btnFuR);
        formPanel.add(btnPF);
        formPanel.add(btnRR);
        formPanel.add(btnTP);
        formPanel.add(btnTM);
        formPanel.add(btnSHH);
        formPanel.add(btnGR);
        formPanel.add(btnWHH);
        formPanel.add(btnMusica);



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
        generos();
        
    }

    public void ocultar(){
        this.dispose();
    }

}
