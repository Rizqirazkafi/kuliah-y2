import java.util.ArrayList;
import java.util.List;

public class BukuAlamatDB {
    public List<BukuAlamat> alamat = new ArrayList<BukuAlamat>();
    public BukuAlamat[] getAlamat(){
        return this.alamat.toArray(new BukuAlamat[this.alamat.size()]);
    }
    public void addAlamat(BukuAlamat alamat){
        this.alamat.add(alamat);
    }
}
