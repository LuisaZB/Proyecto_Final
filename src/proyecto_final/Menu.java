package proyecto_final;

import javax.swing.JOptionPane;


public class Menu 
{
    public static int opcion;
    
    public void Imprimir_Menu () 
    {
        // < > \
        
        boolean continuar = true;
    
        while(continuar)
        {
                            
        opcion = Integer.parseInt (JOptionPane.showInputDialog(null,"********** Bienvenido al Aeropuerto Vuelos Veloces **********" + "\n\n" +
                                           "Por favor selecciona la accion que desea realizar:" + "\n" +
                                           "            1. Registro de clientes" + "\n" +
                                           "            2. Reservación de boletos" + "\n" +
                                           "            3. Impresión de factura" + "\n" +
                                           "            4. Salir"));
        
        
        if (opcion == 1)
        {
            Clientes cli = new Clientes();
            cli.registro_Clientes();
            cli.datos_Clientes();
        }
        
        else if (opcion == 2)
        {
            Boletos bol = new Boletos();
            bol.registro_Boletos();
            bol.datos_Boletos();
        }
        
        else if (opcion == 3)
        {
            
            Facturacion  clase4 = new Facturacion () ;
        
            clase4.Impresion_Factura () ; 
            
        }
        
        else if (opcion == 4)
        {
            JOptionPane.showMessageDialog(null, "Muchas Gracias por su visita!");
            continuar = false; 
            
        }
        
        
        }
        
    }
                          
}

