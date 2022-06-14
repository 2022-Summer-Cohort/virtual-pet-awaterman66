package virtual_pet;

public class OrganicDog extends OrganicClass implements Animal {


    public OrganicDog(String name, int cleanlinessLevel, int hungerLevel, int thirstLevel, int boredomLevel) {
        super(name, cleanlinessLevel, hungerLevel, thirstLevel, boredomLevel);
    }




    public void cleanKennel(){

    }

    @Override
    public String makeSound() {
        return "Bark Bark";
    }

    @Override
    public void walk() {
            if (boredomLevel > 2){
                cleanlinessLevel += 5;
                boredomLevel -= 6;
                thirstLevel += 2;
                hungerLevel += 2;
            }
            else if (boredomLevel <= 2){
                boredomLevel = 0;
                thirstLevel += 2;
                hungerLevel +=2;
                cleanlinessLevel +=6;
            }
    }

}
