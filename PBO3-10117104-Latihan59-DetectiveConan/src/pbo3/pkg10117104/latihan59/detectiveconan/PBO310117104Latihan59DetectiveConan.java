/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan59.detectiveconan;

/**
 *
 * @author
 * Nama : Aditya Suheryana
 * Kelas IF-3/PBO3
 * Nim : 10117104
 * Deskripsi Program : menampilkan nama tokoh yang ada di film detektif conan
 */
public class PBO310117104Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TokohUtama obj = new TokohUtama("","");
        obj.tampilTokohUtama();
        System.out.println("");
        TokohPendukung obj1 = new TokohPendukung("","");
        obj1.tampilTokohPendukung();
        System.out.println("");
        Detektif obj2 = new Detektif("","");
        obj2.tampilDeetective();
    }
    
}
