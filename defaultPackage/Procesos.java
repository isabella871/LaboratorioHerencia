import java.util.Scanner;

public class Procesos {
    public Procesos(){
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

        int opcion = 0;

        do{
            Scanner scanner = new Scanner(System.in);
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

    private void registrarPaciente(){}

    private void registrarEmpleado(){}

    private void registrarCitaMedica(){}

    private void imprimirInformacion(){}
}
