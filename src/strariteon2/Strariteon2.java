/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strariteon2;

/**
 *
 * @author Lenovo
 */
public class Strariteon2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pemberian variabel//
      for(int baris=1; baris<=3; baris++){
         for(int kolom=1; kolom<=3; kolom++){
         
             //posisi bintang//
             if(baris == 1 && kolom ==1 && kolom <=2 ||kolom == 2 && baris >=1 && baris <=2){
             //menampilkan bintang//
            System.out.print("");
             }else{
                 System.out.print("*");
         }
      }
          System.out.println();
      }
    }
}