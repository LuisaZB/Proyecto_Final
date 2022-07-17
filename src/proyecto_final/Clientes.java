package proyecto_final;

import javax.swing.JOptionPane;

public class Clientes {

    //Atributos
    private String nombre;
    private String telefono;
    private String correo;
    private String cedula;

    //Metodos Set y Get
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void registro_Clientes() {
        JOptionPane.showMessageDialog(null, "********** Bienvenido al modulo de registro de clientes **********" + "\n\n"
                + "Por favor complete los datos solicitados a continuación" + "\n"
                + "para completar el registro del cliente: ");

        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre completo: ");
        telefono = JOptionPane.showInputDialog(null, "Digite su número de teléfono: : ");
        correo = JOptionPane.showInputDialog(null, "Ingrese su correo electronico: ");
        cedula = JOptionPane.showInputDialog(null, "Digite su número de cédula: ");
    }
    
    public void datos_Clientes() {
        JOptionPane.showMessageDialog(null, "Los datos del Cliente son: \n" +
                                            "Nombre: " + getNombre() + "\n"  + 
                                            "Telefono: " + getTelefono() + "\n"  +
                                            "Correo: " + getCorreo() + "\n" +
                                            "Cedula: " + getCedula());
    }
}
