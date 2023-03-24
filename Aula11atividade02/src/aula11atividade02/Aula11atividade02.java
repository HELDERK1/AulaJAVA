package aula11atividade02;

public class Aula11atividade02 {

    public static void main(String[] args) {
        int matrizA[][] = {{1, 2}, {4, 5}};
        int matrizB[][] = {{7, 8}, {10, 11}};
        int matrizSoma[][] = new int[2][2];
        int matrizMultiplicacao[][] = new int[2][2];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
                System.out.printf("Posicao [%d, %d]  matrizSoma = %d\n", i, j, matrizSoma[i][j]);
                matrizMultiplicacao[i][j] = matrizA[i][j] * matrizB[i][j];
                System.out.printf("Posicao [%d, %d]  matrizMultiplicacao = %d\n", i, j, matrizMultiplicacao[i][j]);
            }
        }
    }

}

