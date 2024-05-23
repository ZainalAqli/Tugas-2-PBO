/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peternakan;

/**
 *
 * @author HP
 */
public class Peternak {
    private int idPeternak;
    private String namaPeternak,hpPeternak,emailPeternak;
   
    public Peternak() {}

    public Peternak(int idPeternak, String namaPeternak, String hpPeternak, String emailPeternak) {
        this.idPeternak = idPeternak;
        this.namaPeternak = namaPeternak;
        this.hpPeternak = hpPeternak;
        this.emailPeternak = emailPeternak;
    }

    public int getIdPeternak() {
        return idPeternak;
    }

    public void setIdPeternak(int idPeternak) {
        this.idPeternak = idPeternak;
    }

    public String getNamaPeternak() {
        return namaPeternak;
    }

    public void setNamaPeternak(String namaPeternak) {
        this.namaPeternak = namaPeternak;
    }

    public String getHpPeternak() {
        return hpPeternak;
    }

    public void setHpPeternak(String hpPeternak) {
        this.hpPeternak = hpPeternak;
    }

    public String getEmailPeternak() {
        return emailPeternak;
    }

    public void setEmailPeternak(String emailPeternak) {
        this.emailPeternak = emailPeternak;
    }
}    

