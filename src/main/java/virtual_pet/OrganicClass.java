package virtual_pet;

public abstract class OrganicClass extends VirtualPet {


    protected int cleanlinessLevel;

    protected int hungerLevel;

    protected int thirstLevel;

    protected int boredomLevel;

    public OrganicClass(String name, int cleanlinessLevel, int hungerLevel, int thirstLevel, int boredomLevel) {
        super(name);
        this.cleanlinessLevel = cleanlinessLevel;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public void feedPet (){
        if (hungerLevel <= 2) {
            hungerLevel = 0;
        }
        else {
            hungerLevel -=4;
        }
    }
    public void givePetWater(){
        if (thirstLevel <= 2){
            thirstLevel = 0;
        }
        else {
            thirstLevel -= 4;
        }
    }

    public void cleanKennel(){
        if (cleanlinessLevel <=2){
            cleanlinessLevel = 5;
        }
        else {
        cleanlinessLevel += 4;
    }
}
public void organicUpdate(){
    System.out.println(getName() + "'s cleanliness level is: "+ getCleanlinessLevel());
    System.out.println(getName() + "'s hunger level is: "+ getHungerLevel());
    System.out.println(getName() + "'s thirst level is: "+ getThirstLevel());
    System.out.println(getName() + "'s boredom level is: "+ getBoredomLevel());
}
    public boolean isOrganicPetDead(){
        if (hungerLevel >= 30 || thirstLevel >= 30 || boredomLevel >= 30 || cleanlinessLevel <= 0) {
            return true;
        }
        return false;
    }

}
