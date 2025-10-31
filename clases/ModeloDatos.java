package clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import clasesEmpleado.EmpleadoEventual;
import clasesEmpleado.EmpleadoPlanilla;
import clasesEmpleado.Medico;

public class ModeloDatos {
    HashMap<String, Paciente> pacientesMap;
    HashMap<String, EmpleadoPlanilla> empleadosPlanillaMap;
    HashMap<String, EmpleadoEventual> empleadosEventualMap;
    HashMap<String, Medico> medicosMap;
    ArrayList<CitaMedica> citaList;

    public ModeloDatos(){
        pacientesMap = new HashMap<String, Paciente>();
        empleadosPlanillaMap = new HashMap<String, EmpleadoPlanilla>();
        empleadosEventualMap = new HashMap<String, EmpleadoEventual>();
        medicosMap = new HashMap<String, Medico>();
        citaList = new ArrayList<CitaMedica>();
    }


    // Paciente
    public void registrarPersona(Paciente miPaciente){
        pacientesMap.put(miPaciente.getNumeroDNI(), miPaciente);
        System.out.println("Se ha registrado el paciente" + miPaciente.getNombre() + " satisfactoriamente\n");
    }

    public void imprimirMiPacientes(){
        String msj = "Pacientes Registrados \n";
        Iterator<String> iterator = pacientesMap.keySet().iterator();
        
        while (iterator.hasNext()){
            String clave = iterator.next();
            pacientesMap.get(clave).imprimirDatosPersona(msj);
        }
    }


    // Empleado Planilla
    public void registrarPersona(EmpleadoPlanilla miEmPlanilla){
        empleadosPlanillaMap.put(miEmPlanilla.getNumeroDNI(), miEmPlanilla);
        System.out.println("Se ha registrado el empleado por planilla " + miEmPlanilla.getNombre() + " satisfactoriamente\n");
    }

    public void imprimirMiEmPlanilla(){
        String msj = "Empleados por planilla registrados\n";
        for(EmpleadoPlanilla emP : empleadosPlanillaMap.values()){
            emP.imprimirDatosPersona(msj);
        }
    }


    // Empleado Eventual
    public void registrarPersona(EmpleadoEventual miEmEventual){
        empleadosEventualMap.put(miEmEventual.getNumeroDNI(), miEmEventual);
        System.out.println("Se ha registrado el empleado eventual " + miEmEventual.getNombre() + " satisfactoriamente\n");
    }

    public void imprimirMiEmEventual(){
        String msj = "Empleados eventuales registrados\n";
        for(String clave : empleadosEventualMap.keySet()){
            empleadosEventualMap.get(clave).imprimirDatosPersona(msj);
        }
    }


    // Médico
    public void registrarPersona(Medico miMedico){
        medicosMap.put(miMedico.getNumeroDNI(), miMedico);
        System.out.println("Se ha registrado el médico " + miMedico.getNombre() + " satisfactoriamente\n");
    }

    public void imprimirMiMedicos(){
    String msj = "Medicos registrados\n";

        for(Map.Entry<String, Medico> elemento : medicosMap.entrySet()){
            //System.out.println("Key = " + elemento.getKey() + ", value = " + elemento.getValue());
            //medicosMap.get(elemento.getKey()).imprimirDatosPersona(msj);
            elemento.getValue().imprimirDatosPersona(msj);
        }
    }

    // Creación de citas - registro
    public void registrarCita(CitaMedica miCita){
        citaList.add(miCita);
        System.out.println("Se ha registrado con éxito la cita");
        System.out.println(miCita.infoCitaMedica());
    }

    public Paciente consultarPacientePorID(String idPaciente){
        Paciente miPaciente = null;

        if (pacientesMap.containsKey(idPaciente)) {
            miPaciente = pacientesMap.get(idPaciente);
        }
        return miPaciente;
    }

    // Medico que atiende la cita
    public Medico consultarMedicoNombre(String nombreMedico){
        for (Medico medico : medicosMap.values()){
            if (medico.getNombre().equalsIgnoreCase(nombreMedico)) {
                return medico;
            }
        }
        return null;
    }
}
