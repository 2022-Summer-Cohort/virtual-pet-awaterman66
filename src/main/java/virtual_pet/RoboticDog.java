package virtual_pet;

public class RoboticDog extends RoboticClass implements Animal{


    public RoboticDog(String name, int maintenanceLevel, int oilLevel) {
        super(name, maintenanceLevel, oilLevel);
    }

    @Override
    public String makeSound() {
        return "BOOORK BOORK";
    }

    @Override
    public void walk() {
        if (oilLevel <= 2){
            oilLevel = 0;
            maintenanceLevel += 2;
        }
        else {
            oilLevel -= 2;
            maintenanceLevel += 2;
        }
    }
}
