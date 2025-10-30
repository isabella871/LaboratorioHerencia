package clasesEmpleado;

import java.util.Scanner;

public class EmpleadoEventual extends Empleado{
    private Double honorariosPorHora;
    private String fechaTerminoDeContrato;

    public EmpleadoEventual(String numeroDNI, String nombre, String apellido, String fechaNacimiento, String direccion, String ciudadProcedencia,
                            String codigoDeEmpleado, Integer numeroDeHorasExtras, String fechaDeIngreso, String area, String cargo,
                            Double honorariosPorHora, String fechaTerminoDeContrato){

        super(numeroDNI, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia,
        codigoDeEmpleado, numeroDeHorasExtras, fechaDeIngreso, area, cargo);
        this.honorariosPorHora = honorariosPorHora;
        this.fechaTerminoDeContrato = fechaTerminoDeContrato;
    }


    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Honorarios por hora: "+honorariosPorHora+"\n");
        System.out.println("Fecha termino de contrato: "+fechaTerminoDeContrato+"\n");
    }

    //  registrar Usuarios
    @Override
    public void registrarDatos(){
        super.registrarDatos();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Honorarios por hora ");
        Double honorariosPH = scanner.nextDouble();

        System.out.println("Fecha termino de contrato (dd/mm/aaaa): ");
        String fechaTC = scanner.nextLine();
    }


    public Double getHonorariosPorHora(){
        return honorariosPorHora;
    }

    public void setHonorariosPorHora(Double honorariosPorHora){
        this.honorariosPorHora = honorariosPorHora;
    }

    public String getFechaTerminoDeContrato(){
        return fechaTerminoDeContrato;
    }

    public void setFechaTerminoDeContrato(String fechaTerminoDeContrato){
        this.fechaTerminoDeContrato = fechaTerminoDeContrato;
    }
}
