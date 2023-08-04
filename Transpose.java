import java.util.Scanner;

public class Transpose {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Matris boyutunu giriniz (satır sütun):");
        int rows = input.nextInt();
        int cols = input.nextInt();

        int[][] matris = new int[rows][cols];

        System.out.println("Matrisin elemanlarını giriniz:");

        // Matrisin elemanlarını kullanıcıdan al
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matris[i][j] = input.nextInt();
            }
        }

        // Matrisin transpozunu hesapla
        int[][] transpozeMatris = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpozeMatris[j][i] = matris[i][j];
            }
        }

        // Matrisin transpozunu ekrana yazdır
        System.out.println("Matrisin transpozu:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpozeMatris[i][j] + " ");
            }
            System.out.println();
        }
    }
}
