import java.util.Scanner;

public class TugasTeori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = scanner.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        double nilaiUTS = scanner.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double nilaiUAS = scanner.nextDouble();

        // Hitung nilai akhir
        double nilaiAkhir = (0.20 * nilaiTugas) + (0.35 * nilaiUTS) + (0.45 * nilaiUAS);

        // Tentukan grade berdasarkan nilai akhir
        String grade;
        if (nilaiAkhir > 85) {
            grade = "A";
        } else if (nilaiAkhir >= 75 && nilaiAkhir <= 84) {
            grade = "B";
        } else if (nilaiAkhir >= 65 && nilaiAkhir <= 74) {
            grade = "C";
        } else if (nilaiAkhir >= 49 && nilaiAkhir <= 64) {
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
