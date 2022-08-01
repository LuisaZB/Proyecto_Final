package proyecto_final;

import javax.swing.JOptionPane;

public class Boletos {

    // Atributos
    private int Selec_vuelo;
    private String Vuelo;
    private String Fecha;
    private String Hora;
    private int Selec_clase;
    private String Clase;
    private int Clase_precio;
    private int Selec_aerolinea;
    private String Aerolinea;
    private int Boletos;
    private String Total;

    // Metodos Set y Get
    public int getSelec_vuelo() {
        return Selec_vuelo;
    }

    public void setSelec_vuelo(int selec_vuelo) {
        this.Selec_vuelo = Selec_vuelo;
    }

    public String getVuelo() {
        return Vuelo;
    }

    public void setVuelo(String Vuelo) {
        this.Vuelo = Vuelo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public int getSelec_clase() {
        return Selec_clase;
    }

    public void setSelec_clase(int Selec_clase) {
        this.Selec_clase = Selec_clase;
    }

    public String getClase() {
        return Clase;
    }

    public void setClase(String Clase) {
        this.Clase = Clase;
    }

    public int getClase_precio() {
        return Clase_precio;
    }

    public void setClase_precio(int Clase_precio) {
        this.Clase_precio = Clase_precio;
    }

    public int getSelec_aerolinea() {
        return Selec_aerolinea;
    }

    public void setSelec_aerolinea(int Selec_aerolinea) {
        this.Selec_aerolinea = Selec_aerolinea;
    }

    public String getAerolinea() {
        return Aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.Aerolinea = Aerolinea;
    }

    public int getBoletos() {
        return Boletos;
    }

    public void setBoletos(int Boletos) {
        this.Boletos = Boletos;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }

    public void registro_Boletos() {
        
        
JOptionPane.showMessageDialog(null, "Por favor complete los datos solicitados a continuación"+ "\n" + "para completar la reserva de los boletos", "Bienvenido al modulo de compra de boletos", -1);        
        
        //Selección de ruta para el vuelo
       Selec_vuelo = Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione el vuelo que desea:" + "\n" +
                                                                     "1. Costa Rica - Tokyo" + "\n" +
                                                                     "2. Costa Rica - New York" + "\n" +
                                                                     "3. Costa Rica - Barcelona"));
        switch (Selec_vuelo) {
            case 1:
                Vuelo = "Costa Rica - Tokyo" ;
                break;
            case 2:
                Vuelo = "Costa Rica - New York" ;
                break;
            case 3:
                Vuelo = "Costa Rica - Barcelona" ;
                break;
            default:
                break;
        }
        //Selección de fecha y hora
        
        Fecha = JOptionPane.showInputDialog(null, "Ingrese la fecha en la que desea hacer su reserva: " + "\n" +
                                                     " * formato Dia/Mes/Año * ");
        Hora = JOptionPane.showInputDialog(null, "Digite la hora en la que desea reservar: " + "\n" +
                                                     " * Formato Hora:Minutos * ");
        
        //Selección de clase
        
        Selec_clase = Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione cual clase desea:" + "\n" +
                                                                     "1. Primera clase" + "\n" +
                                                                     "2. Clase ejecutiva" + "\n" +
                                                                     "3. Clase económica"));
        
        switch (Selec_clase) {
            case 1:           
                Clase = "Primera clase" ;
                Clase_precio = 0 ;
                break;
            case 2:
                Clase = "Clase ejecutiva" ; 
                Clase_precio = 0 ;
                break;
            case 3:            
                Clase = "Clase económica" ;
                Clase_precio = 0 ;
                break;
            default:
                break;
        }
        
        //Selección de ruta de la aerolinea
        
        Selec_aerolinea = Integer.parseInt(JOptionPane.showInputDialog(null,"Aerolíneas disponibles:" + "\n" +
                                                                     "1. Skyway" + "\n" +
                                                                     "2. Sansa" + "\n" +
                                                                     "3. Aerobell "));
        
        switch (Selec_aerolinea) {
            case 1:
                Aerolinea = "Skyway" ;
                break;
            case 2:
                Aerolinea = "Sansa" ;
                break;
            case 3:            
                Aerolinea = "Aerobell " ;
                break;
            default:
                break;
        }
            
        
        //Selección de boletos
        
        Boletos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de boletos que desea: "));
    }

    public void datos_Boletos() {
        JOptionPane.showMessageDialog(null, "Los datos del Boleto son: \n"
                + "Vuelo: " + getVuelo() + "\n"
                + "Fecha: " + getFecha() + "\n"
                + "Hora: " + getHora() + "\n"
                + "Clase: " + getClase() + "\n"
                + "Aerolinea: " + getAerolinea() + "\n"
                + "Boletos: " + getBoletos());
    }
}

    
    
    /*
     public void Datos_Boleto () 
    {
        // < > \
        
        boolean continuar = true;
    
        while(continuar)
        {                    
        
            //Mensaje de bienvenida al modulo
            
            JOptionPane.showMessageDialog(null,"********** Bienvenido al modulo de compra de boletos **********" + "\n\n" +
                                               "Por favor complete los datos solicitados a continuación" + "\n" +
                                               "para completar la reserva de los boletos: ");
            
            //Selección de ruta para el vuelo
        
            selec_vuelo = Integer.parseInt(JOptionPane.showInputDialog(null,"***** Selección de vuelos *****" + "\n\n" + 
                                                                     "A continuación se listan los vuelos disponibles:" + "\n" +
                                                                     "1. Costa Rica - Tokyo" + "\n" +
                                                                     "2. Costa Rica - New York" + "\n" +
                                                                     "3. Costa Rica - Barcelona"));
        
            if (selec_vuelo == 1)
            {            
                vuelo = "Costa Rica - Tokyo" ;            
            }
        
            else if (selec_vuelo == 2)
            {            
                vuelo = "Costa Rica - New York" ;            
            }
        
            else if (selec_vuelo == 3)
            {           
                vuelo = "Costa Rica - Barcelona" ;           
            }
            
            
            //Selección de fecha y hora del vuelo
        
            fecha = JOptionPane.showInputDialog(null,"Ingrese la fecha en la que desea hacer su reserva," + "\n" +
                                                     "formato Dia/Mes/Año: ");
            
            hora = JOptionPane.showInputDialog(null,"Digite la hora en la que desea reservar, formato Hora:Minutos: ");
            
            
            //Selección de la clase del vuelo
            
            selec_clase = Integer.parseInt(JOptionPane.showInputDialog(null,"***** Selección de clases *****" + "\n\n" + 
                                                                     "A continuación se listan las clases disponibles:" + "\n" +
                                                                     "1. Primera clase - $800" + "\n" +
                                                                     "2. Clase ejecutiva - $600" + "\n" +
                                                                     "3. Clase económica - $400"));
        
            if (selec_clase == 1)
            {           
                clase = "Primera clase" ;
                clase_precio = 800 ;
            }
        
            else if (selec_clase == 2)
            {            
                clase = "Clase ejecutiva" ; 
                clase_precio = 600 ;
            }
        
            else if (selec_clase == 3)
            {            
                clase = "Clase económica" ;
                clase_precio = 400 ;
            }
            
            //Selección de aerolínea 
            
            selec_aerolinea = Integer.parseInt(JOptionPane.showInputDialog(null,"***** Selección de aerolínea *****" + "\n\n" + 
                                                                     "A continuación se listan las aerolíneas disponibles:" + "\n" +
                                                                     "1. Skyway" + "\n" +
                                                                     "2. Sansa" + "\n" +
                                                                     "3. Aerobell "));
        
            if (selec_aerolinea == 1)
            {           
                aerolinea = "Skyway" ;          
            }
        
            else if (selec_aerolinea == 2)
            {            
                aerolinea = "Sansa" ;           
            }
        
            else if (selec_aerolinea == 3)
            {            
                aerolinea = "Aerobell " ;
            }
            
            //Selección de boletos y asientos
            
            
            boletos = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de boletos que desea: "));
            
            //Sistema de selección de asientos pendiente
            
            int input = JOptionPane.showConfirmDialog(null, "Desea realizar otra reservación ? ");
            
            if (input == 1)
            {
               JOptionPane.showMessageDialog(null, "Muchas Gracias por su reserva!");
               continuar = false;
               
            }
        
        }*/
    
