/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance_polymorphism;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Rama
 */
public class Inheritance_Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int pilih;
        Scanner masuk = new Scanner(System.in);
        System.out.println("===============Test Hewan==============");
        System.out.println("1. Singa >> L I O N << ");
        System.out.println("2. Elang >> E A G L E << ");
        System.out.println("3. Lebah >> B E E << ");
        System.out.println("4. Paus >> W H A L E <<");
        System.out.println("5. Keluar dari aplikasi");
        System.out.println("=======================================");
        System.out.print("Pilih Hewan : ");
        pilih = masuk.nextInt();
        System.out.println("\n");
        
        Singa1 S = new Singa1("Mamalia", "Besar, hewan buas, bulu tebal disekitar tengkuknya", "Mengaum", "Dengan 4 kaki, seperti kucing");
        Elang1 E = new Elang1("Burung / Aves", "hewan berdarah panas , paruh bengkok dan kuat, mempunyai sayap & tubuh yang diselubungi pelepah", "Ya suara elang", "Terbang dengan sayap");
        Lebah1 L = new Lebah1("Serangga", "bisa menghasilkan madu, memiliki 3 pasang kaki, 2 pasang sayap", "mendengung", "terbang");
        Paus1 P = new Paus1("Mamalia", "Besar, hewan berdarah panas,","Menggeram", "Berenang");
     
        switch (pilih) {
            case 1:
                System.out.println("S I N G A >> L I O N << ");
                S.tampilHewan();
                System.out.println("Singa bernafas dengan paru - paru");
            break;
            
            case 2:
                System.out.println("E L A N G >> E A G L E << ");
                E.tampilHewan();
                System.out.println("Elang bernafas dengan paru - paru.");
            break;
            
            case 3:
                System.out.println("L E B A H >> B E E << ");
                L.tampilHewan();
                System.out.println("Lebah adalah jenis serangga ");
                System.out.println("Sistem organ pernafasan serangga disebut Insecta");
                System.out.println("sedangkan alat pernafasannya adalah Trakea");
            break;
            
            case 4:
                System.out.println("P A U S >> W H A L E << ");
                P.tampilHewan();
                System.out.println("Paus Bernafas dengan menggunakan paru - paru");
            break;
            
            case 5:
                JOptionPane.showMessageDialog(null, "Anda telah keluar dari Program ! ");
                System.exit(0);
            break;
            
            //Ini adalah sebuah comment untuk comit
            
            
            default:
                System .out.println("Maaf pilihan anda tidak tercantum ! ");
        }   
    }
}
