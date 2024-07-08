/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peternakan;

/**
 *
 * @author HP
 */
public class ternak {
    
    private int idTernak,idpenyakit;
    private String namahewan;
    
 public ternak (){} 
 
 public ternak(int idTernak,String namahewan,int idpenyakit ){
      this.idTernak = idTernak;
      this.namahewan = namahewan;
      this.idpenyakit = idpenyakit;
 }
 
    public int getidTernak() {
        return idTernak;
    }

    public void setidTernak(int idTernak) {
        this.idTernak = idTernak;
    }
    
    public String getnamahewan (){
        return namahewan;
    }
    
    public void setnamahewan(String namahewan){
        this.namahewan = namahewan;
    }
    
    public int getidpenyakit(){
        return idpenyakit;
    }
    
    public void setidpenyakit(int idpenyakit){
        this.idpenyakit = idpenyakit;
    }
    
}
