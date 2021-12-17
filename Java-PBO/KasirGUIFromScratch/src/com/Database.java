package com;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public List<ItemPesanan> pesanan = new ArrayList<>(ItemPesanan);
    public ItemPesanan[] getPesanan(){
        return this.pesanan.toArray(new ItemPesanan[this.pesanan.size()]);

    }
    public void addPesanan(ItemPesanan pesanan){
        this.pesanan.add(pesanan);
    }
}
