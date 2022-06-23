package virtual_pet;

public class RoboticCat extends RoboticClass implements Animal{


    public RoboticCat(String name, int maintenanceLevel, int oilLevel) {
        super(name, maintenanceLevel, oilLevel);
    }

    @Override
    public String makeSound() {
        return "MEOZZZZ";
    }

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

