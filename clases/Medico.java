package clases;

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
