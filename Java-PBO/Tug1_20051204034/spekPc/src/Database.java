
import java.util.ArrayList;
import java.util.List;

public class Database{
    public List<Laptop> laptop = new ArrayList<Laptop>();
    public Laptop[] getLaptop() 
    {
        return this.laptop.toArray(new Laptop[this.laptop.size()]); 
    }
    
    public void addLaptop(Laptop laptop){
        this.laptop.add(laptop); 
    }
}
