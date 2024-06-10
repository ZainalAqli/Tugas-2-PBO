/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;
import CRUD.Koneksi;
import peternakan.peternak;
import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author HP
 */


public class main {
    public static void main(String[] args) {
        Koneksi db = new Koneksi ();
        //peternak peternak1 = new peternak("1", "Zainal", "Handil Bakti", "Zainal@gmail.com", "ABC123");
        
        //System.out.println("ID Peternak: " + peternak1.getIdPeternak());
        //System.out.println("Nama Peternak: " + peternak1.getNamaPeternak());
        //System.out.println("Alamat Peternak: " + peternak1.getAlamatPeternak());
        //System.out.println("Email Peternak: " + peternak1.getEmailPeternak());
        //System.out.println("ID Peternakan: " + peternak1.getIdPeternakan());
        
      //db.simpanpeternak("1", "Zainal", "0895503654", "Zainal@gmail.com", "999");
      //db.simpanpeternak("3", "Aqli", "08954153135", "Aqli@gmail.com", "4789");
      //db.ubahpeternak("2", "Muhammad", "087815957984", "muhammad@gmail.com", "4569");
      //db.hapuspeternak("3");
      //db.caripeternak("1");
      db.datapeternak();
      
      
      
    }
}
