package com;

public class ItemPesanan {
    private String menuPesanan;
    private Integer hargaPesanan;
    private Integer jumlahPesanan;
    
    public void setMenuPesanan(String value){
        this.menuPesanan = value;
    }

    public String getMenuPesanan(){
        return this.menuPesanan;
    }
    public void setHargaPesanan(Integer value){
        this.hargaPesanan = value;
    }

    public Integer getHargaPesanan(){
        return this.hargaPesanan;
    }
    public void setJumlahPesanan(Integer value){
        this.jumlahPesanan = value;
    }

    public Integer getJumlahPesanan(){
        return this.jumlahPesanan;
    }
}
