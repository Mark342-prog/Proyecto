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

Esta clase presenta la ventana del menu con tres botones para tres opciones de recomendaciones
---------------------------*/

public class Menu extends JFrame{
    final private Font mainFont = new Font("Segoe print", Font.BOLD,18);
    JTextField tfFirstName;
    //Se llaman a las demas clases con las demas ventanas que tienen cada una de las opciones del menu
    public Generos generos= new Generos();
    public Duracion duracion = new Duracion();
    public Año año = new Año();

    JLabel lbWelcome;

    public static MainFrame myFrame;

    public void menu(){


        //Mensaje de inicio
        JLabel lbFirstName = new JLabel("¿Cómo desea obtener recomendaciones de musica?");
        lbFirstName.setFont(mainFont);

        
        //Primer boton que envia a la clase que recomienda por generos musicales
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
        
        //Segundo boton que envia a la clase que recomienda por artistas
        JButton lbOP2 = new JButton("2. Artista");
        lbOP2.setFont(mainFont);
        lbOP2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                
                duracion.duration();
                ocultar();
                
            }

            
        });

        //Tercer boton que envia a la clase que recomienda por años
        JButton lbOP3 = new JButton("3. Años");
        lbOP3.setFont(mainFont);
        lbOP3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                año.year();
                ocultar();

                
            }

            
        });
       
        //Este panel solo tiene el mensaje con la pregunta
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout (1, 1, 5, 5));
        formPanel.setOpaque(false);
        formPanel.add(lbFirstName);
        
        
        //Este Panel contiene a los tres botones y los ordena en tres filas
        JPanel centerPanel= new JPanel();
        centerPanel.setLayout(new GridLayout(3,1,5,5));
        centerPanel.setOpaque(false);
        centerPanel.add(lbOP1);
        centerPanel.add(lbOP2);
        centerPanel.add(lbOP3);
  


        //El panel principal ordena al primer panel en la parte de arriba y a los botones al centro
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
    //El modulo al que otras clases llaman
    public void ingresar(){
        myFrame = new MainFrame();
        menu();
        
    }
    //Se oculta la ventana
    public void ocultar(){
        this.dispose();
    }
    
    
}
