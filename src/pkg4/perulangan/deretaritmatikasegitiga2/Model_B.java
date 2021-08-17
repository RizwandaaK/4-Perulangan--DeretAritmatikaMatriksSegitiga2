/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.perulangan.deretaritmatikasegitiga2;

/**
 *
 * @author rizwa
 */
public class Model_B {
    public static void main(String[] args) {
        int nilaipertama_a = 9;
        int selisih_b = 4;
        int kolom = 3;
        int sukusaatini = nilaipertama_a;
        int jmlderet = nilaipertama_a;
        System.out.println("Deret Aritmatikanya adalah");
        System.out.println("");
        for(int i = 0; i < kolom; i++){
            for(int j = 0; j < kolom-i; j++){
                System.out.print(sukusaatini+"\t");
                sukusaatini = sukusaatini + selisih_b;
                jmlderet = jmlderet + sukusaatini;
            }
            System.out.println();
        }
        for(int i = 1; i < kolom; i++){
            for(int j = 0; j < 1 + i; j++){
                System.out.print(sukusaatini + "\t");
                sukusaatini = sukusaatini + selisih_b;
                jmlderet = jmlderet + sukusaatini;
            }
            System.out.println();
        }
        jmlderet = jmlderet - sukusaatini;
        System.out.println("");
        System.out.println("Jumlah Deret Aritmatikanya adalah "+jmlderet);
    }
}
    
    

