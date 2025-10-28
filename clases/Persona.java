package clases;

import java.util.Scanner;

public class Persona {
    private String numeroDNI;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String direccion;
    private String ciudadProcedencia;

    public Persona(String numeroDNI, String nombre, String apellido, String fechaNacimiento, String direccion, String ciudadProcedencia){
        this.numeroDNI = numeroDNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.ciudadProcedencia = ciudadProcedencia;
    }

    public void imprimirDatos(){
        System.out.println("Nombre: "+nombre+"\n");
        System.out.println("Apellido: "+apellido+"\n");
        System.out.println("Fecha de nacimiento: "+fechaNacimiento+"\n");
        System.out.println("Dirección: "+direccion+"\n");
        System.out.println("Ciudad de Procedencia: "+ciudadProcedencia+"\n");
    }


    //  registrar Usuarios
    public void registrarDatos(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de documento: ");
        String ndocumento = scanner.nextLine();

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese la fecha de nacimiento (dd/mm/aaaa): ");
        String fechaN = scanner.nextLine();

        System.out.print("Ingrese la dirección: ");
        String direccion = scanner.nextLine();

        System.out.print("Ingrese la ciudad de procedencia: ");
        String ciudadP = scanner.nextLine();
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