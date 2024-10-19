package Questao2.main;

import Questao2.model.VerificarString;

public class Main {
    public static void main(String[] args) {
        VerificarString verificarString = new VerificarString();
        String palavra = "Casa";
        int total = verificarString.verificar(palavra);

        if (total > 0) {
            System.out.println("A palavra \"" + palavra + "\" contém " + total + " letra(s) 'A'.");
        } else {
            System.out.println("A palavra \"" + palavra + "\" não contém a letra 'A'.");
        }
    }
}
