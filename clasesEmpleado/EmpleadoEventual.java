package clasesEmpleado;
import javax.swing.JOptionPane;

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
    public void imprimirDatosPersona(String datos){
        super.imprimirDatosPersona(datos);
        datos += "Honorarios por hora: "+honorariosPorHora+"\n";
        datos += "Fecha termino de contrato: "+fechaTerminoDeContrato+"\n";

        System.out.println(datos);
    }


    //  registrar Usuarios
    @Override
    public void registrarDatos(){
        super.registrarDatos();

        honorariosPorHora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de su salario mensual"));
        fechaTerminoDeContrato = JOptionPane.showInputDialog("Fecha termino de contrato (dd/mm/aaaa): ");
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
