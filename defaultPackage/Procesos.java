import javax.swing.JOptionPane;

import clases.CitaMedica;
import clases.ModeloDatos;
import clases.Paciente;
import clasesEmpleado.EmpleadoEventual;
import clasesEmpleado.EmpleadoPlanilla;
import clasesEmpleado.Medico;

public class Procesos {
    ModeloDatos miModeloDatos;
    int opcion = 0;

    public Procesos(){
        miModeloDatos = new ModeloDatos();
        presentarMenuOpciones();
    }

    public void presentarMenuOpciones(){
        String menu = "---- MENÚ HOSPITAL ---- \n";
        menu+="1. Registrar Paciente\n";
        menu+="2. Registrar Empleado\n";
        menu+="3. Registrar Cita Médica\n";
        menu+="4. Imprimir Información\n";
        menu+="5. Salir\n\n";
        menu+="Ingrese una opción\n";
        int opcion = 0;

        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcion) {
                case 1: registrarPaciente();    break;
                case 2: registrarEmpleado();    break;
                case 3: registrarCitaMedica();  break;
                case 4: imprimirInformacion();  break;
                case 5: System.out.println("El sistema ha terminado");  break;
            
                default:    System.out.println("No existe el código, verifique nuevamente");    break;
            }
        }while (opcion != 5);
    }


    private void registrarPaciente(){
        Paciente miPaciente = new Paciente(null, null, null, null, null, null, null, null, null, null);
        miPaciente.registrarDatos();
        miModeloDatos.registrarPersona(miPaciente);
    }


    //hay tres tipos de empleado: eventual, por planilla y médicp
    private void registrarEmpleado(){
        String menuTipEmpleado = "Registro de empleado\n";
        menuTipEmpleado += "1. Empleado eventual\n";
        menuTipEmpleado += "2. Empleado por planilla\n";
        menuTipEmpleado += "Seleccione el tipo de empleado a registrar\n";
        
        int tipoEmpleado = Integer.parseInt(JOptionPane.showInputDialog(menuTipEmpleado));
        
        switch (tipoEmpleado) {
            case 1:
                EmpleadoEventual miEmpleadoEventual = new EmpleadoEventual(menuTipEmpleado, menuTipEmpleado, menuTipEmpleado, menuTipEmpleado, menuTipEmpleado, menuTipEmpleado, menuTipEmpleado, null, menuTipEmpleado, menuTipEmpleado, menuTipEmpleado, null, menuTipEmpleado);
                miEmpleadoEventual.registrarDatos();
                miModeloDatos.registrarPersona(miEmpleadoEventual);
                break;

            case 2:
                String resp = JOptionPane.showInputDialog("Ingrese 1, si es un médico, de lo contrario, es otro tipo de empleado");

                if (resp.equalsIgnoreCase("si")){
                    Medico miMedico = new Medico(resp, resp, resp, resp, resp, resp, resp, null, resp, resp, menuTipEmpleado, null, null, resp, null);
                    miMedico.registrarDatos();
                    miModeloDatos.registrarPersona(miMedico);
                }else{
                    EmpleadoPlanilla miEmpleadoPlanilla = new EmpleadoPlanilla(resp, resp, resp, resp, resp, resp, resp, null, resp, menuTipEmpleado, resp, null, null);
                    miEmpleadoPlanilla.registrarDatos();
                    miModeloDatos.registrarPersona(miEmpleadoPlanilla);
                }
                break;

            default: System.out.println("El tipo de empleado no es válido, intente nuevamente");
                break;
        }
    }

    private void imprimirInformacion(){
        String menuImprimirInfo = "Menú Impresión de Información\n";
        menuImprimirInfo += "1. Listar pacientes\n";
        menuImprimirInfo += "2. Listar empleados Eventuales\n";
        menuImprimirInfo += "3. Listar empleados por planilla\n";
        menuImprimirInfo += "4. Listar médicos\n";
        menuImprimirInfo += "5. Listar citas programadas\n";
        menuImprimirInfo += "Ingrese una opción\n";
        System.out.println("........................................................................\n");
        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(menuImprimirInfo));

        switch (opcion) {
            case 1: miModeloDatos.imprimirMiPacientes();    break;
            case 2: miModeloDatos.imprimirMiEmEventual();   break;
            case 3: miModeloDatos.imprimirMiEmPlanilla();   break;
            case 4: miModeloDatos.imprimirMiMedicos();  break;
            case 5: miModeloDatos.imprimirCitasProgramadas();   break;
        
            default:
                System.out.println("No existe la opción ingresada");
                break;
        }
    }

    public void registrarCitaMedica(){
        String idPaciente = JOptionPane.showInputDialog("Ingrese el documento del paciente");
        Paciente pacienteEncontrado = miModeloDatos.consultarPacientePorID(idPaciente);
        
        if (pacienteEncontrado != null) {
            String nombreMedico = JOptionPane.showInputDialog("Ingrese el nombre del médico");
            Medico medicoEncontrado = miModeloDatos.consultarMedicoNombre(nombreMedico);

            if (medicoEncontrado != null) {
                String servicio = JOptionPane.showInputDialog("Ingrese el servicio o motivo de la consulta");
                String fechaConsulta = JOptionPane.showInputDialog("Ingrese la fecha de la consulta");
                String horaConsulta = JOptionPane.showInputDialog("Ingrese la hora de la consulta");
                String lugar = "La cita será en el consultorio " + medicoEncontrado.getNumeroDeConsultorio();
                CitaMedica miCita = new CitaMedica(pacienteEncontrado, medicoEncontrado, servicio, fechaConsulta, horaConsulta, lugar);
                miModeloDatos.registrarCita(miCita);

            }else{
                System.out.println("El médico no está registrado en el sistema");
            }
        }else{
            System.out.println("El paciente no se encuentra en el sistema");
        }
    }
}
