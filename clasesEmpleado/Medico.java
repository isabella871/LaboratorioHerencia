package clasesEmpleado;
import javax.swing.JOptionPane;


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
    public void imprimirDatosPersona(String datos){
        super.imprimirDatosPersona(datos);
        datos += "Especialidad: "+especialidad+"\n";
        datos += "Numero de consultorio: "+numeroDeConsultorio+"\n";
    
        System.out.println(datos);
    }


    //  registrar Usuarios
    @Override
    public void registrarDatos(){
        super.registrarDatos();

        especialidad = JOptionPane.showInputDialog("Ingrese su especialidad: ");
        numeroDeConsultorio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de consultorio: "));
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
