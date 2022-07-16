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
    }
}
