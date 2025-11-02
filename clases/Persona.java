package clases;

import javax.swing.JOptionPane;

public class Persona {
    private String numeroDNI;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String direccion;
    private String ciudadProcedencia;

    public Persona () {}

    public Persona(String numeroDNI, String nombre, String apellido, String fechaNacimiento, String direccion, String ciudadProcedencia){
        this.numeroDNI = numeroDNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.ciudadProcedencia = ciudadProcedencia;
    }

    public void imprimirDatosPersona(String datos){
        datos += "Nombre: "+nombre+"\n";
        datos += "Apellido: "+apellido+"\n";
        datos += "Fecha de nacimiento: "+fechaNacimiento+"\n";
        datos += "Dirección: "+direccion+"\n";
        datos += "Ciudad de Procedencia: "+ciudadProcedencia+"\n";

        System.out.println(datos);
    }


    //  registrar Usuarios
    public void registrarDatos(){
        numeroDNI = JOptionPane.showInputDialog("Ingrese el número de documento:");
        nombre= JOptionPane.showInputDialog("Ingrese el nombre:");
        apellido = JOptionPane.showInputDialog("Ingrese el apellido:");
        fechaNacimiento = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento (dd/mm/aaaa):");
        direccion = JOptionPane.showInputDialog("Ingrese la dirección:");
        ciudadProcedencia = JOptionPane.showInputDialog("Ingrese la ciudad de procedencia:");
    }



    public String getNumeroDNI(){
        return numeroDNI;
    }

    public void setNumeroDNI(String numeroDNI){
        this.numeroDNI = numeroDNI;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getFechaNacimiento(){
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String getCiudadProcedencia(){
        return ciudadProcedencia;
    }

    public void setCiudadProcedencia(String ciudadProcedencia){
        this.ciudadProcedencia = ciudadProcedencia;
    }
}