

import java.util.Scanner;

public class EmpleadoPlanilla extends Empleado{
    private Double salarioMensual;
    private Double porcentajeAdicionalPorHoraExtra;

    public EmpleadoPlanilla (String numeroDNI, String nombre, String apellido, String fechaNacimiento, String direccion, String ciudadProcedencia,
                            String codigoDeEmpleado, Integer numeroDeHorasExtras, String fechaDeIngreso, String area, String cargo,
                            Double salarioMensual, Double porcentajeAdicionalPorHoraExtra){
        
        super(numeroDNI, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia, 
        codigoDeEmpleado, numeroDeHorasExtras, fechaDeIngreso, area, cargo);
        this.salarioMensual = salarioMensual;
        this.porcentajeAdicionalPorHoraExtra = porcentajeAdicionalPorHoraExtra;
    }

    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Salario mensual: "+salarioMensual+"\n");
        System.out.println("Porcentaje adicional por hora extra: "+porcentajeAdicionalPorHoraExtra+"\n");
    }

    //  registrar Usuarios
    @Override
    public void registrarDatos(){
        super.registrarDatos();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Salario mensual: ");
        Double salarioM = scanner.nextDouble();

        System.out.println("Porcentaje adicional por hora extra: ");
        Double porcentajeAHE = scanner.nextDouble();
    }

    public Double getSalarioMensual(){
        return salarioMensual;
    }

    public void setSalarioMensual(Double salarioMensual){
        this.salarioMensual = salarioMensual;
    }

    public Double getPorcentajeAdicionalPorHoraExtra(){
        return porcentajeAdicionalPorHoraExtra;
    }

    public void setPorcentajeAdicionalPorHoraExtra(Double porcentajeAdicionalPorHoraExtra){
        this.porcentajeAdicionalPorHoraExtra = porcentajeAdicionalPorHoraExtra;
    }
}
