import java.util.Scanner;

import clases.ModeloDatos;
import clases.Paciente;
import clasesEmpleado.EmpleadoEventual;
import clasesEmpleado.EmpleadoPlanilla;
import clasesEmpleado.Medico;

public class Procesos {
    ModeloDatos miModeloDatos;

    Scanner scanner = new Scanner(System.in);
    int opcion = 0;

    public Procesos(){
        miModeloDatos = new ModeloDatos();
        presentarMenuOpciones();
    }

    private void presentarMenuOpciones(){
        String menu = "---- MENÚ HOSPITAL ---- \n\n";
        menu+="1. Registrar Paciente\n";
        menu+="2. Registrar Empleado\n";
        menu+="3. Registrar Cita Médica\n";
        menu+="4. Imprimir Información\n";
        menu+="5. Salir\n\n";
        menu+="Ingrese una opción\n";
        opcion = scanner.nextInt();

        do{
            System.out.println((menu));

            switch (opcion) {
                case 1:
                    registrarPaciente();
                    break;

                case 2:
                    registrarEmpleado();
                    break;

                case 3:
                    registrarCitaMedica();
                    break;

                case 4:
                    imprimirInformacion();
                    break;

                case 5:
                    System.out.println("El sistema ha terminado");
                    break;
            
                default:
                    System.out.println("No existe el código, verifique nuevamente");
                    break;
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
        
        int tipoEmpleado = scanner.nextInt();
        
        switch (tipoEmpleado) {
            case 1:
                EmpleadoEventual miEmpleadoEventual = new EmpleadoEventual(menuTipEmpleado, menuTipEmpleado, menuTipEmpleado, menuTipEmpleado, menuTipEmpleado, menuTipEmpleado, menuTipEmpleado, null, menuTipEmpleado, menuTipEmpleado, menuTipEmpleado, null, menuTipEmpleado);
                miEmpleadoEventual.registrarDatos();
                miModeloDatos.registrarPersona(miEmpleadoEventual);
                break;

            case 2:
                System.out.println("Ingrese 1, si es un médico, de lo contrario, es otro tipo de empleado");
                String resp = scanner.nextLine();

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
        menuImprimirInfo += "5. Ingrese una opción\n";
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                
                break;
        
            default:
                break;
        }
    }

    private void registrarCitaMedica(){}
}
