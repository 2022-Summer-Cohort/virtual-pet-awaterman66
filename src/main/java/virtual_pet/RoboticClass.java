package virtual_pet;

public abstract class RoboticClass extends VirtualPet {
    protected int maintenanceLevel;

    protected int oilLevel;

    public RoboticClass(String name, int maintenanceLevel, int oilLevel) {
        super(name);
        this.maintenanceLevel = maintenanceLevel;
        this.oilLevel = oilLevel;
    }

    public int getMaintenanceLevel() {
        return maintenanceLevel;
    }

    public int getOilLevel() {
        return oilLevel;
    }



    public void givePetOil() {
        if (oilLevel <= 2) {
            oilLevel = 5;
        }
        else {
            oilLevel += 6;
        }
    }

    public void workOnPet() {
        if (maintenanceLevel>2) {
            maintenanceLevel -= 6;
        }
        else {
            maintenanceLevel = 0;
        }
    }
    public void roboticUpdate(){
        System.out.println(getName() + "'s oil level is: "+ getOilLevel());
        System.out.println(getName() + "'s maintenance level is: "+ getMaintenanceLevel());
    }

    public  boolean isRoboticPetDead(){
        if (maintenanceLevel >= 30 || oilLevel <= 0){
            return true;
        }
        return false;
    }

}
