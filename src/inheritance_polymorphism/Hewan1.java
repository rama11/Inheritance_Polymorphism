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
public class Hewan1 {
    
    protected String jenis,ciri;
    
    public Hewan1 (String jenis, String ciri){
        this.jenis = jenis;
        this.ciri = ciri;
    }
    
    public Hewan1 () {
    }
    
    public void tampilHewan() {
        System.out.println("Jenis Hewan : " + jenis);
        System.out.println("Ciri Hewan : " + ciri);
    }
    
}
