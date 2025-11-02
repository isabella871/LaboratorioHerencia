package clasesEmpleado;
import javax.swing.JOptionPane;

import clases.Persona;


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
    public void imprimirDatosPersona(String datos){
        super.imprimirDatosPersona(datos);
        datos += "Código de empleado: "+codigoDeEmpleado+"\n";
        datos += "Número de horas extra: "+numeroDeHorasExtras+"\n";
        datos += "Fecha de ingreso: "+fechaDeIngreso+"\n";
        datos +="Área: "+area+"\n";
        datos +="Cargo: "+cargo+"\n";

        System.out.println(datos);
    }

    @Override
    public void registrarDatos(){

        codigoDeEmpleado = JOptionPane.showInputDialog("Ingrese el código de empleado: ");
        numeroDeHorasExtras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de horas extra: "));
        fechaDeIngreso = JOptionPane.showInputDialog("Ingrese la fecha de ingreso (dd/mm/aaaa): ");
        area = JOptionPane.showInputDialog("Ingrese el área: ");
        cargo = JOptionPane.showInputDialog("Ingrese el cargo: ");
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
