package virtual_pet;

public class OrganicCat extends OrganicClass implements Animal {


    public OrganicCat(String name, int cleanlinessLevel, int hungerLevel, int thirstLevel, int boredomLevel) {
        super(name, cleanlinessLevel, hungerLevel, thirstLevel, boredomLevel);
    }

    public void cleanLetterBox(){

    }

    @Override
    public String makeSound() {
        return "Meeeeooow";
    }

    @Override
    public void walk() {
        if (boredomLevel > 2){
            cleanlinessLevel += 5;
            boredomLevel -= 5;
            thirstLevel += 1;
            hungerLevel += 1;
        }
        else if (boredomLevel <= 2){
            boredomLevel =0;
            thirstLevel += 1;
            hungerLevel +=1;
            cleanlinessLevel +=5;
        }
    }
}
