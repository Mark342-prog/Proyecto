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

Esta es la clase con la primera ventana de bienvenida
---------------------------*/

public class MainFrame extends JFrame{
    //Se llama a la clase con la siguiente ventana
    public Ingreso genero= new Ingreso();
    //Se configura la letra
    final private Font mainFont = new Font("Segoe print", Font.BOLD,18);
    JTextField tfFirstName, tfLastName;
    //Se configura el label por donde salen los mensajes y el boton para enviar a la otra ventana
    JLabel lbWelcome;
    JLabel lbOk;

    public static MainFrame myFrame;

    public void initialize(){



        /*****************************Se configura el label con la letra del inicio y con un mensaje de bienvenida**************************/ 

        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);
        lbWelcome.setText("Bienvenido a Musicon recomendaciones");
        lbWelcome.setOpaque(true);


         /******************************Se configura un mensaje para indicar al usuario que presione el botón**************************/ 

         lbOk = new JLabel();
         lbOk.setFont(mainFont);
         lbOk.setText("Presione ok para continuar");


        /******************************Se le da una acción al botón*************************/ 

        JButton btnOK = new JButton("OK");
        btnOK.setFont(mainFont);
        btnOK.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                /******************************Se manda a ingresar en la otra clase que pide contraseña y usuario y se oculta está ventana*************************/ 
                genero.ingresar();
                myFrame.setVisible(false);

                
            }

            
        });

        /******************************Se crea un panel donde van los botones*************************/ 
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1,2,5,5));
        buttonsPanel.setOpaque(false);
        buttonsPanel.add(btnOK);

        /******************************Este panel es de toda la ventana donde los mensajes de bienvenida van arriba, el mensaje de presionar ok va en medio y los botones abajo*************************/ 
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        mainPanel.add(lbWelcome, BorderLayout.NORTH);
        mainPanel.add(lbOk, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);

        add(mainPanel);

        /******************************Se le da un título a la ventana*************************/ 
        setTitle("Musicon");
        setSize(500,600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


    }

    public static void main(String[] args){
        myFrame = new MainFrame();
        myFrame.initialize();

    }

    public void ocultar(){

    }

}