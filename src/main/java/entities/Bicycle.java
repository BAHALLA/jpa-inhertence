package entities;

import javax.persistence.Entity;

@Entity
public class Bicycle extends Vehicle{
    private String bicycleType;

    public String getBicycleType() {
        return bicycleType;
    }

    public void setBicycleType(String bicycleType) {
        this.bicycleType = bicycleType;
    }
}
