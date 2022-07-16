package aplication;

import entities.Patient;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Input {

    Patient pacient;
    List<Patient> patientList = new ArrayList<>();

    public void inputData() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome Completo: ");
        String fullName = sc.nextLine();

        System.out.println("Idade: ");
        int age = sc.nextInt();

        sc.nextLine();
        System.out.println("Data Nascimento: ");
        String birthDate = sc.nextLine();

        System.out.println("Peso: ");
        double weigth = sc.nextDouble();

        System.out.println("Altura: ");
        double height = sc.nextDouble();

        System.out.println("Cpf: ");
        int id = sc.nextInt();

        System.out.println("Pressao arterial: ");
        double bloodPressure = sc.nextDouble();

        sc.nextLine();
        System.out.println("Tipo Sanguíneo: ");
        String bloodType = sc.nextLine();

        System.out.println("Frequencia Cardiaca: ");
        double heartRate = sc.nextDouble();

        sc.nextLine();
        System.out.println("Ja teve Hepatite B: ");
        String hepatitisB = sc.next();

        System.out.println("Ja teve AVC (sim)/(não)? ");
        String avc = sc.next();

        System.out.println("Tem pressão alta (sim)/(não)?");
        String highpressure = sc.next();

        System.out.println("Gestante (sim)/(não)?");
        String pregnant = sc.next();

        System.out.println("Tem diabete (sim)/(não)?");
        String diabetes = sc.next();

        System.out.println("Já teve enfarte (sim)/(não)?");
        String infarction = sc.next();

        System.out.println("Já teve Trombose (sim)/(não)?");
        String thrombosis = sc.next();

        System.out.println("Esta tomando algum remedio (sim)/(não)?");
        String medical = sc.next();

        System.out.println("Possui algum tipo de alergia em relação a algum medicamento ou alimentação  (sim)/(não)? ");
        String alergy = sc.next();

        System.out.println("Tem algum tipo de doença que esta fazendo tratamento  (sim)/(não)? ");
        String diseaseTreatment = sc.next();

        System.out.println("Necessidades especificas de alimentação  (sim)/(não)? ");
        String alimentationEspecial = sc.next();


        System.out.println("Em caso de alguma emergência avisar a: ");
        sc.nextLine();
        System.out.println("Nome completo: ");
        String nameParent = sc.nextLine();
        System.out.println("Endereço: ");
        String adressParent = sc.nextLine();
        System.out.println("Grau de Parentesco: ");
        String grauParent = sc.nextLine();
        System.out.println("Tel. Residencial: ");
        String phoneResidencialParent = sc.nextLine();
        System.out.println("Tel. Celular: ");
        String phoneParent = sc.nextLine();
        System.out.println("e-mail: ");
        String emailParent = sc.nextLine();

        pacient = new Patient(fullName, age, birthDate, id, bloodPressure, bloodType, heartRate, weigth, height, hepatitisB, avc, highpressure, diabetes, infarction, thrombosis, pregnant, nameParent, adressParent, grauParent, phoneResidencialParent, phoneParent, emailParent);
        patientList.add(pacient);
        System.out.println();

        for (Patient results : patientList
        ) {
            System.out.println(results);
        }
    }
}
