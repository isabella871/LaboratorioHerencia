package clases;

import java.util.HashMap;

import clasesEmpleado.EmpleadoEventual;
import clasesEmpleado.EmpleadoPlanilla;
import clasesEmpleado.Empleado;
import clasesEmpleado.Medico;

public class ModeloDatos {
    HashMap<String, Paciente> pacientesMap;
    HashMap<String, Empleado> empleadosMap;
    HashMap<String, EmpleadoPlanilla> empleadosPlanillaMap;
    HashMap<String, EmpleadoEventual> empleadosEventualMap;
    HashMap<String, Medico> medicosMap;


    public ModeloDatos(){
        pacientesMap = new HashMap<String, Paciente>();
        empleadosPlanillaMap = new HashMap<String, EmpleadoPlanilla>();
        empleadosEventualMap = new HashMap<String, EmpleadoEventual>();
        medicosMap = new HashMap<String, Medico>();
    }

    public void registrarPersona(Paciente miPaciente){
        pacientesMap.put(miPaciente.getNumeroDNI(), miPaciente);
        System.out.println("Se ha registrado el paciente" + miPaciente.getNombre() + " satisfactoriamente");
    }

    public void registrarPersona(Empleado miEmpleado){
        empleadosMap.put(miEmpleado.getNumeroDNI(), miEmpleado);
        System.out.println("Se ha registrado el empleado " + miEmpleado.getNombre() + " satisfactoriamente");
    }

    public void registrarPersona(EmpleadoPlanilla miEmPlanilla){
        empleadosPlanillaMap.put(miEmPlanilla.getNumeroDNI(), miEmPlanilla);
        System.out.println("Se ha registrado el empleado por planilla " + miEmPlanilla.getNombre() + " satisfactoriamente");
    }

    public void registrarPersona(EmpleadoEventual miEmEventual){
        empleadosEventualMap.put(miEmEventual.getNumeroDNI(), miEmEventual);
        System.out.println("Se ha registrado el empleado eventual " + miEmEventual.getNombre() + " satisfactoriamente");
    }

    public void registrarPersona(Medico miMedico){
        medicosMap.put(miMedico.getNumeroDNI(), miMedico);
        System.out.println("Se ha registrado el médico " + miMedico.getNombre() + " satisfactoriamente");
    }

    
}
