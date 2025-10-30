package clasesEmpleado;

import java.util.Scanner;

public class Medico extends EmpleadoPlanilla{
    private String especialidad;
    private Integer numeroDeConsultorio;

    public Medico(String numeroDNI, String nombre, String apellido, String fechaNacimiento, String direccion, String ciudadProcedencia,
                    String codigoDeEmpleado, Integer numeroDeHorasExtras, String fechaDeIngreso, String area, String cargo,
                    Double salarioMensual, Double porcentajeAdicionalPorHoraExtra,
                    String especialidad, Integer numeroDeConsultorio){
        
        super(numeroDNI, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia,
        codigoDeEmpleado, numeroDeHorasExtras, fechaDeIngreso, area, cargo, 
        salarioMensual, porcentajeAdicionalPorHoraExtra);
        this.especialidad = especialidad;
        this.numeroDeConsultorio = numeroDeConsultorio;
    }

    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Especialidad: "+especialidad+"\n");
        System.out.println("Numero de consultorio: "+numeroDeConsultorio+"\n");
    }


    //  registrar Usuarios
    @Override
    public void registrarDatos(){
        super.registrarDatos();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su especialidad: ");
        String especialidad = scanner.nextLine();

        System.out.println("Ingrese el número de consultorio: ");
        Integer numConsultorio = scanner.nextInt();
    }


    public String getEspecialidad(){
        return especialidad;
    }

    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }

    public Integer getNumeroDeConsultorio(){
        return numeroDeConsultorio;
    }

    public void setNumeroDeConsultorio(Integer numeroDeConsultorio){
        this.numeroDeConsultorio = numeroDeConsultorio;
    }
}
