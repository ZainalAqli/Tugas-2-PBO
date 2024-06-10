/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peternakan;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class peternak {
    private String idPeternak, namaPeternak, hpPeternak, emailPeternak, idPeternakan;
    
    private ArrayList<String> idPeternaks;
    private ArrayList<String> namaPeternaks;
    private ArrayList<String> hpPeternaks;
    private ArrayList<String> emailPeternaks;
    private ArrayList<String> idPeternakans;

    public peternak(){
        idPeternaks = new ArrayList<>();
        namaPeternaks = new ArrayList<>();
        hpPeternaks = new ArrayList<>();
        emailPeternaks = new ArrayList<>();
        idPeternakans = new ArrayList<>();
    }
    
    public peternak(String idPeternak, String namaPeternak, String hpPeternak, String emailPeternak, String idPeternakan) {
         this.idPeternak = idPeternak;
         this.namaPeternak = namaPeternak;
         this.hpPeternak = hpPeternak;
         this.emailPeternak = emailPeternak;
         this.idPeternakan = idPeternakan;
    } 
    
    public void setIdPeternak(String idPeternak) {
        this.idPeternak = idPeternak;
    }
    
    public String getIdPeternak() {
        return idPeternak;
    }

    public void setNamaPeternak(String namaPeternak) {
        this.namaPeternak = namaPeternak;
    }
  
    public String getNamaPeternak() {
        return namaPeternak;
    }
    
    public void setAlamatPeternak(String alamatPeternak) {
        this.hpPeternak = alamatPeternak;
    }
    
    public String getAlamatPeternak() {
        return hpPeternak;
    }
    
    public void setEmailPeternak(String emailPeternak) {
        this.emailPeternak = emailPeternak;
    }
    
    public String getEmailPeternak() {
        return emailPeternak;
    }
    
    public void setIdPeternakan(String idPeternakan) {
        this.idPeternakan = idPeternakan;
    }
    
    public String getIdPeternakan() {
        return idPeternakan;
    }
    
    public void setIsiIdPeternak(String idPeternak) {
        idPeternaks.add(idPeternak);
    }
    
    public ArrayList<String> getIdPeternaks() {
        return idPeternaks;
    }

    public void setInputIdPeternak(String idPeternak) {
        this.idPeternak = idPeternak;
    }
  
}



