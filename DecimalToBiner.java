/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimaltobiner;

import java.util.Scanner;

/**
 *
 * @author Fadil
 */
public class DecimalToBiner {
    
    void decimalToBiner (int a){
        if (a > 1) {
            decimalToBiner (a/2);
        }
        System.out.print(a & 2);
    }

    public static void main(String[] args) {
        BinerDecimal bd = new BinerDecimal();
        System.out.println("=== Konversi Bilangan ===");
        System.out.println("1. Desimal ke Biner\n2. Biner ke Desimal\n");
        
        System.out.print("Masukkan Pilihan: ");
        Scanner input = new Scanner(System.in);
        
        switch (input.nextInt()){
            case 1:
                System.out.println("\n= Desimal ke Biner =");
                System.out.print("Masukkan bil.Desimal: ");
                Scanner desimal = new Scanner(System.in);
                String biner = Integer.toBinaryString(desimal.nextInt());
                System.out.println("Hasil: "+biner);
                
//                int input = desimal.nextInt();
//                System.out.print("Hasil: ");
//                bd.decimalToBiner(inputInt);
                System.out.print("\n");
                break;
                
// jika di buat disambungkan dengan switch case
            default:
                System.out.println("\n= Biner ke Decimal");
                System.out.print("Masukan bil.Biner: ");
                Scanner inputBiner = new Scanner(System.in);
                int result = Integer.parseInt(inputBiner.nextLine(),
                        2); //radix 2(biner)
                System.out.println("Hasil: "+result);
                System.out.println("Desimal: " + bd.binerToDecimal(inputBiner.nextLine()));
                break;
        }
        }
    }
