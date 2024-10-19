package Questao2.model;

public class VerificarString {
    public int verificar(String palavra){
        int controle = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (letra == 'A' || letra == 'a') {
                controle++;
            }
        }
        return controle;
    }
}
