package aula11atividade02;

public class Aula11atividade02 {

    public static void main(String[] args) {
        int matrizA[][] = {{1, 2}, {4, 5}};
        int matrizB[][] = {{7, 8}, {10, 11}};
        int matrizSoma[][] = new int[2][2];
        int matrizMultiplicacao[][] = new int[2][2];

        //soma
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        //multiplicação
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                for (int k = 0; k < 2; k++) {
                    matrizMultiplicacao[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        //imprimir soma
        for (int i = 0; i < matrizSoma.length; i++) {
            System.out.println("\n");
            for (int j = 0; j < matrizSoma.length; j++) {
                System.out.print(matrizSoma[i][j] + "\t");
            }
        }

        //imprimir multiplicação
        for (int i = 0; i < matrizMultiplicacao.length; i++) {
            System.out.println("\n");
            for (int j = 0; j < matrizMultiplicacao.length; j++) {
                System.out.print(matrizMultiplicacao[i][j] + "\t");
            }
        }
    }

}
