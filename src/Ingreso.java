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

Esta clase abre una ventana que pide usuario y contraseña. De ser incorrectos no deja pasar a la siguiente ventana y si son correctos lo permite
---------------------------*/

public class Ingreso extends JFrame{
    //Se configura la letra de los botones y labels
    final private Font mainFont = new Font("Segoe print", Font.BOLD,18);
    //Se crean labels, TextField para que el usuario ingrese su usario y un PasswordField para que ingrese contraseña y no sea visible
    JTextField tfFirstName;
    JPasswordField tfLastName;
    JLabel lbWelcome;

    public static MainFrame myFrame;

    public void contaseña(){

        //Se crea un mensaje para que ingresen su usuario
        JLabel lbFirstName = new JLabel("Usuario");
        lbFirstName.setFont(mainFont);

        //Ingreso de texto del usuario
        tfFirstName = new JTextField();
        tfFirstName.setFont(mainFont);

        //Se crea un mensaje para que ingresen su contraseña
        JLabel lbLastName = new JLabel("Contraseña");
        lbLastName.setFont(mainFont);

        //Ingreso de contraseña
        tfLastName = new JPasswordField();
        tfLastName.setFont(mainFont);

        /******************************Se crea un panel con 4 filas y una columna para colocar los mensajes e ingresos de texto************************/ 
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout (4, 1, 5, 5));
        formPanel.setOpaque(false);
        formPanel.add(lbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);

        /******************************Mensaje de error**************************/ 

        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);

        /******************************Botones Ok y Clear**************************/ 

        JButton btnOK = new JButton("OK");
        btnOK.setFont(mainFont);
        btnOK.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //Obtiene el texto del field y password y compara para ver si lo puede dejar ingresar
                String firstName =tfFirstName.getText();
                String lastName = tfLastName.getText();

                if (firstName.equals("WICHO")){
                    if(lastName.equals("WICHO123")){
                        //lbWelcome.setText("Bienvenido "+ firstName+" ");
                        
                        //Se abre la ventana con el menu y se oculta la ventana con el usuario y la contraseña
                        Menu menu = new Menu();
                        menu.menu();
                        ocultar();
                        
                    }else{
                        //Mensajes de error
                        lbWelcome.setText("Contraseña o Usuario incorrecto presione Clear e intente de nuevo");
                    }
                }else{
                    lbWelcome.setText("Contraseña o Usuario incorrecta presione Clear e intente de nuevo");
                }

               
                
            }

            
        });

        //Clear es un boton que vacia los fields y el mensaje de error
        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                tfFirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("");
                
            }

            
        });

        





        //Se crea un panel de 1 fila y dos columnas para los dos botones
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1,2,5,5));
        buttonsPanel.setOpaque(false);
        buttonsPanel.add(btnOK);
        buttonsPanel.add(btnClear);

        //Se arregla todo en la ventana, mensajes e ingreso de usuario y contraseña en la parte de arriba; mensaje de error al centro y botones en la parte de abajo
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

    //Es la clase a la que tiene acceso la clase main para llamar
    public void ingresar(){
        myFrame = new MainFrame();
        contaseña();
        
    }

    //Se oculta la ventana
    public void ocultar(){
        this.dispose();
    }

    
}
