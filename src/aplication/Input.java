package aplication;

import entities.Patient;

import java.util.Locale;
import java.util.Scanner;

public class Input {

    Patient pacient;


    public void inputData() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome Completo: ");
        String fullName = sc.nextLine();

        System.out.println("Idade: ");
        int age = sc.nextInt();

        System.out.println("Data Nascimento: ");
        int birthDate = sc.nextInt();

        System.out.println("Peso: ");
        double weigth = sc.nextDouble();

        System.out.println("Altura: ");
        double height = sc.nextDouble();

        System.out.println("Cpf: ");
        int id = sc.nextInt();

        System.out.println("Pressao arterial: ");
        double bloodPressure = sc.nextDouble();

        System.out.println("Tipo Sanguíneo: ");
        String bloodType = sc.nextLine();

        System.out.println("Frequencia Cardiaca: ");
        int heartRate = sc.nextInt();

        System.out.println("Ja teve Hepatite B: ");
        int hepatitisB = sc.nextInt();

        System.out.println("Ja teve AVC (s/n)? ");
        int avc = sc.nextInt();

        System.out.println("Tem pressão alta (s/n)?");
        int highpressure = sc.nextInt();

        System.out.println("Gestante (s/n)?");
        int pregnant = sc.nextInt();

        System.out.println("Tem diabete (s/n)?");
        int diabetes = sc.nextInt();

        System.out.println("Já teve enfarte (s/n)?");
        int infarction = sc.nextInt();

        System.out.println("Já teve Trombose (s/n)?");
        int thrombosis = sc.nextInt();

        System.out.println("Esta tomando algum remedio (s/n)?");
        int medical = sc.nextInt();

        System.out.println("Possui algum tipo de alergia em relação a algum medicamento ou alimentação (s/n) ? ");
        int alergy = sc.nextInt();

        System.out.println("Tem algum tipo de doença que esta fazendo tratamento (s/n) ? ");
        int diseaseTreatment = sc.nextInt();

        System.out.println("Necessidades especificas de alimentação (s/n) ? ");
        int alimentationEspecial = sc.nextInt();


        System.out.println("Em caso de alguma emergência avisar a: ");
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



        System.out.println("Declaro para todos os devidos fins expressar a verdade nas informações acimas preenchidas (s/n)?");
        int afirmationData = sc.nextInt();



    }
}
