/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance_polymorphism;

/**
 *
 * @author Rama
 */
public class Elang1 extends Hewan1 {
    private String suara, berjalan;
    
    public Elang1(String jenis, String ciri, String suara, String berjalan) {
        super(jenis, ciri);
        this.suara = suara;
        this.berjalan = berjalan;
    }
    
    public Elang1(String suara, String berjalan) {
        this.suara = suara;
        this.berjalan = berjalan;
    }
    
    @Override
    public void tampilHewan() {
        super.tampilHewan();
        System.out.println("Suara Hewan : " + suara);
        System.out.println("Cara Berjalan : " + berjalan);
    }
}
