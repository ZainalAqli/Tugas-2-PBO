/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    
    //Peternak
    
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
                System.out.println("id_peternak:"+ data.getString("id_peternak"));
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
    
//Peternakan
    
   public void ubahpeternakan (int paramidPeternakan, String paramnamaPeternakan, String paramalamatPeternakan, int paramjumlah, int paramidTernak, boolean paramverified, boolean paramapproval){
       try{
            String SQL =" UPDATE peternakan SET nama_peternakan=?, alamat_peternakan=?, jumlah=?, id_ternak=?, verified=?, approval=?"
                    + "WHERE id_peternakan=?";
            
           PreparedStatement perintah = koneksiDB.prepareStatement (SQL);
            perintah.setString(1, paramnamaPeternakan);
            perintah.setString(2, paramalamatPeternakan);
            perintah.setInt(3, paramjumlah);
            perintah.setInt(4,paramidTernak);
            perintah.setBoolean(5, paramverified);
            perintah.setBoolean(6, paramapproval);
            perintah.setInt(7, paramidPeternakan);
            perintah.executeUpdate();
                  System.out.println("Data Berhasil diUbah");
        }catch (Exception e){
            System.out.println(e.getMessage());   
        }
   }  
   
   public void simpanpeternakan (int paramidPeternakan, String paramnamaPeternakan, String paramalamatPeternakan, int paramjumlah, int paramidTernak, boolean paramverified, boolean paramapproval){
          try{
            String SQL =" INSERT INTO peternakan (id_peternakan, nama_peternakan, alamat_peternakan, jumlah, id_ternak, verified, approval)"
                    + "VALUES (?,?,?,?,?)";
            PreparedStatement perintah = koneksiDB.prepareStatement (SQL);
            perintah.setInt(1, paramidPeternakan);
            perintah.setString(2, paramnamaPeternakan);
            perintah.setString(3, paramalamatPeternakan);
            perintah.setInt(4, paramjumlah);
            perintah.setInt(5,paramidTernak);
            perintah.setBoolean(6, paramverified);
            perintah.setBoolean(7, paramapproval);
                  System.out.println("Data Berhasil disimpan");
        }catch (Exception e){
            System.out.println(e.getMessage());   
        }
        
    } 
   
   public void hapuspeternakan(int paramidPeternakan){
        try{
            String SQL = "DELETE FROM peternak WHERE id_peternakan=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setInt(1, paramidPeternakan);
            perintah.executeUpdate();
            System.out.println("Data bBerhasil diHapus");
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
   
   public void caripeternakan(int idPeternakan) {
        try {
            String SQL = "SELECT*FROM peternakan WHERE id_peternakan=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setInt(1, idPeternakan);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("id_peternakan:"+ data.getInt("id_peternakan"));
                System.out.println("nama_peternakan:"+ data.getString("nama_peternak"));
                System.out.println("alamat_peternakan :"+ data.getString("alamat_peternakan"));
                System.out.println("jumlah:"+ data.getInt("jumlah"));
                System.out.println("id_ternak:"+ data.getInt("id_ternak"));
                System.out.println("verified :"+ data.getBoolean("verified"));
                System.out.println("approval:"+ data.getBoolean("approva"));

            }
             }catch (Exception e){
            System.err.println(e.getMessage()); 
        }
   }
    public void datapeternakan(){
        try{
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT * FROM peternakan ORDER BY id_peternakan ASC ");
            while(baris.next()){
                System.out.println(baris.getInt("id_peternakan")+" | "+
                        baris.getString("nama_peternak")+" | "+
                        baris.getString("alamat_peternakan")+" | "+
                        baris.getInt("jumlah")+" | "+
                        baris.getInt("id_ternak")+" | "+
                        baris.getBoolean("verified")+" | "+
                        baris.getBoolean("approva"));
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
}
//Ternak
public void simpanternak (int paramidternak, String paramnamahewan, int paramidpenyakit){
        try{
            String SQL =" INSERT INTO ternak (id_ternak, nama_ternak, id_penyakit )"
                    + "VALUES (?,?,?)";
            PreparedStatement perintah = koneksiDB.prepareStatement (SQL);
            perintah.setInt(1, paramidternak);
            perintah.setString(2, paramnamahewan);
            perintah.setInt(3, paramidpenyakit);
            perintah.executeUpdate();
                  System.out.println("Data Berhasil disimpan");
        }catch (Exception e){
            System.out.println(e.getMessage());   
        }
        
    }
 public void ubahternak (int paramidternak, String paramnamahewan, int paramidpenyakit){
        try{
            String SQL =" UPDATE ternaka SET nama_ternak=?, id_penyakit=?"
                    + "WHERE id_ternak=?";
            
           PreparedStatement perintah = koneksiDB.prepareStatement (SQL);
          perintah.setString(1, paramnamahewan);
            perintah.setInt(2, paramidpenyakit);
            perintah.setInt(3, paramidternak);
            perintah.executeUpdate();
                  System.out.println("Data Berhasil diUbah");
        }catch (SQLException e){
            System.out.println(e.getMessage()); }
 }
public void hapusternak(int paramidternak){
        try{
            String SQL = "DELETE FROM ternak WHERE id_ternak=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setInt(1, paramidternak);
            perintah.executeUpdate();
            System.out.println("Data bBerhasil diHapus");
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    } 
public void cariternak(int idternak) {
        try {
            String SQL = "SELECT*FROM ternak WHERE id_ternak=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setInt(1, idternak);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("nama_hewan:"+ data.getString("nama_hewan"));
                System.out.println("id_penyakit :"+ data.getInt("id_penyakit"));
                System.out.println("id_ternak:"+ data.getInt("id_ternak"));
            }
             }catch (Exception e){
            System.err.println(e.getMessage()); 
        }            
}
 public void dataternak(){
        try{
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT * FROM ternak ORDER BY id_ternak ASC ");
            while(baris.next()){
                System.out.println(baris.getInt("id_ternak")+" | "+
                        baris.getString("nama_hewan")+" | "+
                        baris.getInt("id_penyakit"));
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
}
//Penyakit
 
  public void simpanpenyakit (int paridpenyakit, String parnamapenyakit, String parciri,
          String parpenanggulanan, String parradius){
        
        
        try{
            String SQL =" INSERT INTO penakit (id_penyakit, nama_penyakit, ciri, penanggulanan, radius )"
                    + "VALUES (?,?,?,?,?)";
            PreparedStatement perintah = koneksiDB.prepareStatement (SQL);
            perintah.setInt(1, paridpenyakit);
            perintah.setString(2, parnamapenyakit);
            perintah.setString(3, parciri);
            perintah.setString(4, parpenanggulanan);
            perintah.setString(5, parradius);
            perintah.executeUpdate();
                  System.out.println("Data Berhasil disimpan");
        }catch (Exception e){
            System.out.println(e.getMessage());   
        }
        
    }
public void ubahpenyakit (int paridpenyakit, String parnamapenyakit, String parciri,
          String parpenanggulanan, String parradius){
     
          try{
            String SQL =" UPDATE penyakit SET nama_penyakit=?, ciri=?, penanggulanan=?, radius=?"
                    + "WHERE id_penyakit=?";
            
           PreparedStatement perintah = koneksiDB.prepareStatement (SQL);
            perintah.setString(1, parnamapenyakit);
            perintah.setString(2, parciri);
            perintah.setString(3, parpenanggulanan);
            perintah.setString(4, parradius);
            perintah.setInt(5, paridpenyakit);
            perintah.executeUpdate();
                  System.out.println("Data Berhasil diUbah");
        }catch (Exception e){
            System.out.println(e.getMessage());   
        }
        
    }
public void hapuspenyakit(int paridpenyakit){
        try{
            String SQL = "DELETE FROM penyakit WHERE id_penyakit=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setInt(1, paridpenyakit);
            perintah.executeUpdate();
            System.out.println("Data bBerhasil diHapus");
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }   
public void caripenyakit(int idpenyakit) {
        try{
            String SQL = "SELECT*FROM penyakit WHERE id_penyakit=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setInt(1, idpenyakit);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("id_penyakit:"+ data.getString("id_penyakit"));
                System.out.println("nama_penyakit:"+ data.getString("nama_penyakit"));
                System.out.println("ciri :"+ data.getString("ciri"));
                System.out.println("penanggulanan :"+ data.getString("penanggulanan"));
                System.out.println("radius:"+ data.getString("radius"));      
            }
        }catch (Exception e){
            System.err.println(e.getMessage());   
        }     
     }
public void datapenyakit(){
        try{
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT * FROM penyakit ORDER BY id_penyakit ASC ");
            while(baris.next()){
                System.out.println(baris.getInt("id_penyakit")+" | "+
                        baris.getString("nama_penyakit")+" | "+
                        baris.getString("ciri")+" | "+
                        baris.getString("penanggulanan")+" | "+
                        baris.getString("radius"));
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
                
    } 


  




}