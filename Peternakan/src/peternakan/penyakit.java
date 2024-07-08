/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peternakan;

/**
 *
 * @author HP
 */
public class penyakit {
    
    private int idpenyakit;
    private String namapenyakit, ciri, penanggulanan, radius;
    
    
public penyakit(){}

public penyakit(int idpenyakit, String namapenyakit, String ciri,String penanggulanan, String radius ){
    this.idpenyakit = idpenyakit;
    this.namapenyakit = namapenyakit;
    this.ciri = ciri;
    this.penanggulanan = penanggulanan;
    this.radius = radius;
}

    public int getidpenyakit() {
        return idpenyakit;
    }

    public void setidpenyakit(int idpenyakit) {
        this.idpenyakit = idpenyakit;
    }
    
    
    public String getnamapenyakit(){
        return namapenyakit;
    }
    
    public void setnamapenyakit(String namapenyakit){
        this.namapenyakit = namapenyakit;
    }
    
    public String getciri(){
        return ciri;
    }
    
    public void setciri(String ciri){
        this.ciri = ciri;
    }
    
    public String getpenanggulanan(){
        return penanggulanan;
    }
    
    public void setpenanggulanan(String penanggulanan){
        this.penanggulanan = penanggulanan;    
    }
    
    public String getradius(){
        return radius;
    }
    
    public void setradius(String radius){
        this.radius = radius;    
    }
    
}
