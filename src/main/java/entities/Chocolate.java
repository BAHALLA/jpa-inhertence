package entities;

import javax.persistence.Entity;

@Entity
public class Chocolate extends Product{

    private int numberKal;

    public int getNumberKal() {
        return numberKal;
    }

    public void setNumberKal(int numberKal) {
        this.numberKal = numberKal;
    }
}
