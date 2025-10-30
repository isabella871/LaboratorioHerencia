package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Paciente extends Persona {
    private Integer numeroHistoriaClinica;
    private String sexo;
    private String grupoSanguineo;
    private ArrayList<String> listaMedicamentosAlergico;

    public Paciente(String numeroDNI, String nombre, String apellido, String fechaNacimiento, String direccion, String ciudadProcedencia, 
                    Integer numeroHistoriaClinica, String sexo, String grupoSanguineo, ArrayList<String> listaMedicamentoAlergico){
        
        super(numeroDNI, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia);
        this.numeroHistoriaClinica = numeroHistoriaClinica;
        this.sexo = sexo;
        this.grupoSanguineo = grupoSanguineo;
        this.listaMedicamentosAlergico = listaMedicamentoAlergico;
    }


    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Número de historia clínica: "+numeroHistoriaClinica+"\n");
        System.out.println("Sexo: "+sexo+"\n");
        System.out.println("Grupo sanguineo: "+grupoSanguineo+"\n");
        System.out.println("Lista de medicamentos a los que es alergico: "+listaMedicamentosAlergico+"\n");
    }


    //  registrar Usuarios
    @Override
    public void registrarDatos(){
        super.registrarDatos();

        Scanner scanner = new Scanner(System.in);
        listaMedicamentosAlergico = new ArrayList<String>();

        System.out.print("Ingrese el número de la historia clínica: ");
        String nhistoriaC = scanner.nextLine();

        System.out.print("Ingrese su sexo: ");
        String sexo = scanner.nextLine();

        System.out.print("Ingrese el grupo sanguíneo: ");
        String grupoS = scanner.nextLine();

        String pregunta = ("Es alergico a algún medicamento? ingrese si o no");

        if (pregunta.equalsIgnoreCase("si")){
            String medicamento = "";
            String continuar = "";
            
            do{
                medicamento = ("Ingrese el nombre del medicamento al que es alergico");
                listaMedicamentosAlergico.add(medicamento);

                continuar = ("Ingrese si, si desea continuar");
            }while (continuar.equalsIgnoreCase("si"));
        }

    }


    public Integer getNumeroHistoriaClinica(){
        return numeroHistoriaClinica;
    }

    public void setNumeroHistoriaClinica(Integer numeroHistoriaClinica){
        this.numeroHistoriaClinica = numeroHistoriaClinica;
    }

    public String getSexo(){
        return sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public String getGrupoSanguineo(){
        return grupoSanguineo;
    }

    public void setGrupoSnaguineo(String grupoSanguineo){
        this.grupoSanguineo = grupoSanguineo;
    }

    public ArrayList<String> getListaMedicamentosAlergico(){
        return listaMedicamentosAlergico;
    }

    public void setListaMedicamentosAlergico(ArrayList<String> listaMedicamentosAlergico){
        this.listaMedicamentosAlergico = listaMedicamentosAlergico;
    }
}
