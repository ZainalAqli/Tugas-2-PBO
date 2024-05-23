/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package peternakan;

/**
 *
 * @author HP
 */
public class Peternakan {
    private int idPeternakan,idTernak,jumlah;
    private String namaPeternakan,alamatPeternakan;
    private boolean verified,approval;

    // Constructor
    public Peternakan() {}

    public Peternakan(int idPeternakan, String namaPeternakan, String alamatPeternakan, int jumlah, int idTernak, boolean verified, boolean approval) {
        this.idPeternakan = idPeternakan;
        this.namaPeternakan = namaPeternakan;
        this.alamatPeternakan = alamatPeternakan;
        this.jumlah = jumlah;
        this.idTernak = idTernak;
        this.verified = verified;
        this.approval = approval;
    }

    public int getIdPeternakan() {
        return idPeternakan;
    }

    public void setIdPeternakan(int idPeternakan) {
        this.idPeternakan = idPeternakan;
    }

    public String getNamaPeternakan() {
        return namaPeternakan;
    }

    public void setNamaPeternakan(String namaPeternakan) {
        this.namaPeternakan = namaPeternakan;
    }

    public String getAlamatPeternakan() {
        return alamatPeternakan;
    }

    public void setAlamatPeternakan(String alamatPeternakan) {
        this.alamatPeternakan = alamatPeternakan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getIdTernak() {
        return idTernak;
    }

    public void setIdTernak(int idTernak) {
        this.idTernak = idTernak;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public boolean isApproval() {
        return approval;
    }

    public void setApproval(boolean approval) {
        this.approval = approval;
    }
}


    
    
    

    

            
            

    

