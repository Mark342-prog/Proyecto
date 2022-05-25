import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;



public class Menu extends JFrame{
    final private Font mainFont = new Font("Segoe print", Font.BOLD,18);
    JTextField tfFirstName;

    public Generos generos= new Generos();

    JLabel lbWelcome;

    public static MainFrame myFrame;

    public void menu(){



        JLabel lbFirstName = new JLabel("¿Cómo desea obtener recomendaciones?");
        lbFirstName.setFont(mainFont);

        

        JButton lbOP1 = new JButton("1. Género");
        lbOP1.setFont(mainFont);
        lbOP1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                generos.generos();
                ocultar();
                
            }

            
        });
        

        JButton lbOP2 = new JButton("2. Tiempo de duración");
        lbOP2.setFont(mainFont);
        lbOP2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                
            }

            
        });

        JButton lbOP3 = new JButton("3. Años");
        lbOP3.setFont(mainFont);
        lbOP3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                
            }

            
        });
       

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout (1, 1, 5, 5));
        formPanel.setOpaque(false);
        formPanel.add(lbFirstName);
        
        

        JPanel centerPanel= new JPanel();
        centerPanel.setLayout(new GridLayout(3,1,5,5));
        centerPanel.setOpaque(false);
        centerPanel.add(lbOP1);
        centerPanel.add(lbOP2);
        centerPanel.add(lbOP3);
  



        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        add(mainPanel);


        setTitle("Musicon");
        setSize(500,600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


    }

    public void ingresar(){
        myFrame = new MainFrame();
        menu();
        
    }

    public void ocultar(){
        this.dispose();
    }
    
    
}
