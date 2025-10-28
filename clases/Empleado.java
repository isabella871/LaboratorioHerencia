package clases;

import java.util.Scanner;

public class Empleado extends Persona{
    private String codigoDeEmpleado;
    private Integer numeroDeHorasExtras;
    private String fechaDeIngreso;
    private String area;
    private String cargo;

    public Empleado(String numeroDNI, String nombre, String apellido, String fechaNacimiento, String direccion, String ciudadProcedencia,
                    String codigoDeEmpleado, Integer numeroDeHorasExtras, String fechaDeIngreso, String area, String cargo){

        super(numeroDNI, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia);
        this.codigoDeEmpleado = codigoDeEmpleado;
        this.numeroDeHorasExtras = numeroDeHorasExtras;
        this.fechaDeIngreso = fechaDeIngreso;
        this.area = area;
        this.cargo = cargo;
    }

    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Código de empleado: "+codigoDeEmpleado+"\n");
        System.out.println("Número de horas extra: "+numeroDeHorasExtras+"\n");
        System.out.println("Fecha de ingreso: "+fechaDeIngreso+"\n");
        System.out.println("Área: "+area+"\n");
        System.out.println("Cargo: "+cargo+"\n");
    }

    @Override
    public void registrarDatos(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el código de empleado: ");
        String codigoE = scanner.nextLine();

        System.out.print("Ingrese el número de horas extra: ");
        Integer hExtras = scanner.nextInt();

        System.out.print("Ingrese la fecha de ingreso (dd/mm/aaaa): ");
        String fIngreso = scanner.nextLine();

        System.out.print("Ingrese el área: ");
        String area = scanner.nextLine();

        System.out.print("Ingrese el cargo: ");
        String cargo = scanner.nextLine();
    }


    public String getCodigoDeEmpleado(){
        return codigoDeEmpleado;
    }

    public void setCodigoDeEmpleado(String codigoDeEmpleado){
        this.codigoDeEmpleado = codigoDeEmpleado;
    }

    public Integer getNumeroDeHorasExtras(){
        return numeroDeHorasExtras;
    }

    public void setNumeroDeHorasExtras(Integer numeroDeHorasExtras){
        this.numeroDeHorasExtras = numeroDeHorasExtras;
    }

    public String getFechaDeIngreso(){
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(String fechaDeIngreso){
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public String getArea(){
        return area;
    }

    public void setArea(String area){
        this.area = area;
    }

    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }
}
