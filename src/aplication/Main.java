package aplication;

import entities.Patient;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Patient pacient;
        Input inputData = new Input();

        inputData.inputData();
    }
}
