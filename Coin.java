import java.util.*;
public class Coin{
    double value;
    String metal;
    public Coin(double v, String m){
        this.value = v;
        this.metal = m;
    }
    public String getMetal() {
        return this.metal;
    }
    public void setValue(double hulk){
        this.value = hulk;
    }
    public double getValue(){
        return this.value;
    }
    public void setMetal(String ironman){
        this.metal = ironman;
    }
}