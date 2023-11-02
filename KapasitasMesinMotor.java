package org.example;

import java.util.Scanner;
import java.text.DecimalFormat;

public class KapasitasMesinMotor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan diameter piston (D dalam mm): ");
        double diameterInMillimeters = input.nextDouble();

        System.out.print("Masukkan stroke (L dalam mm): ");
        double strokeInMillimeters = input.nextDouble();

        // Konversi input dari milimeter ke sentimeter
        double diameterInCentimeters = diameterInMillimeters / 10.0;
        double strokeInCentimeters = strokeInMillimeters / 10.0;

        double cc = hitungKapasitasMesin(diameterInCentimeters, strokeInCentimeters);

        // Membuat objek DecimalFormat untuk pembulatan
        DecimalFormat df = new DecimalFormat("#.00");
        String formattedCc = df.format(cc);

        System.out.println("Kapasitas mesin motor (cc): " + formattedCc + " cc");

        input.close();
    }

    public static double hitungKapasitasMesin(double diameter, double stroke) {
        // Rumus kapasitas mesin motor (cc)
        double cc = 0.785 * (diameter * diameter) * stroke;
        return cc;
    }
}