/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class Koneksi {
    
    
    private String databaseName = "muhammadzainalaqli_2210010145";
    private String username = "root";    
    private String password = "";
    private String lokasi = "jdbc:mysql://localhost/"+databaseName;
    public static Connection koneksiDB;
    
    public Koneksi (){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksiDB = DriverManager.getConnection(lokasi,username,password);
            System.out.println("Database Terkoneksi");
        } catch (Exception e) {
            System.err.print(e.toString());
        }
    }
    
     public void simpanpeternak (String paramidPeternak, String paramnamaPeternak, String paramhp, String paramemail,
            String paramidPeternakan){
        
        
        try{
            String SQL =" INSERT INTO peternak (id_Peternak, nama_Peternak, hp_Peternak, email_Peternak, id_Peternakan )"
                    + "VALUES (?,?,?,?,?)";
            PreparedStatement perintah = koneksiDB.prepareStatement (SQL);
            perintah.setString(1, paramidPeternak);
            perintah.setString(2, paramnamaPeternak);
            perintah.setString(3, paramhp);
            perintah.setString(4, paramemail);
            perintah.setString(5, paramidPeternakan);
            perintah.executeUpdate();
                  System.out.println("Data Berhasil disimpan");
        }catch (Exception e){
            System.out.println(e.getMessage());   
        }
        
    }
     public void ubahpeternak (String paramidPeternak, String paramnamaPeternak, String paramhp, String paramemail,
            String paramidPeternakan){
     
          try{
            String SQL =" UPDATE peternak SET nama_peternak=?, hp_peternak=?, email_peternak=?, id_peternakan=?"
                    + "WHERE id_peternak=?";
            
           PreparedStatement perintah = koneksiDB.prepareStatement (SQL);
            perintah.setString(1, paramnamaPeternak);
            perintah.setString(2, paramhp);
            perintah.setString(3, paramemail);
            perintah.setString(4, paramidPeternakan);
            perintah.setString(5, paramidPeternak);
            perintah.executeUpdate();
                  System.out.println("Data Berhasil diUbah");
        }catch (Exception e){
            System.out.println(e.getMessage());   
        }
        
    }
     
     public void hapuspeternak(String paramidpeternak){
        try{
            String SQL = "DELETE FROM peternak WHERE id_peternak=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setString(1, paramidpeternak);
            perintah.executeUpdate();
            System.out.println("Data bBerhasil diHapus");
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
     
     public void caripeternak(String idpeternak) {
        try{
            String SQL = "SELECT*FROM peternak WHERE id_peternak=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setString(1, idpeternak);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("nama_peternak:"+ data.getString("nama_peternak"));
                System.out.println("hp_peternak :"+ data.getString("hp_peternak"));
                System.out.println("email_peternak :"+ data.getString("email_peternak"));
                System.out.println("id_peternakan:"+ data.getString("id_peternakan"));
                
            }
        }catch (Exception e){
            System.err.println(e.getMessage());   
        }     
     }
     
    public void datapeternak(){
        try{
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT * FROM peternak ORDER BY id_peternak ASC ");
            while(baris.next()){
                System.out.println(baris.getString("id_peternak")+" | "+
                        baris.getString("nama_peternak")+" | "+
                        baris.getString("hp_peternak")+" | "+
                        baris.getString("email_peternak")+" | "+
                        baris.getString("id_peternakan"));
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
                
    }  
     
}
        

