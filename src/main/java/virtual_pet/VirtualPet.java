package virtual_pet;

public class VirtualPet {
    private String name;
    private int hungerLevel;
    private int thirstLevel;
    private int boredomLevel;

    public String getName() {
        return name;
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

    public VirtualPet(String name, int hungerLevel, int thirstLevel, int boredomLevel) {
        this.name = name;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
    }

    public void feedPet() {
        if (hungerLevel >= 2) {
            hungerLevel-= 2;
            boredomLevel++;
        }
        else if (hungerLevel == 1){
            hungerLevel --;
            boredomLevel++;
        }
        else{
            boredomLevel++;
        }
        System.out.println("ヽ(^o^)ノ");
    }

    public void givePetWater() {
        if (thirstLevel >= 2) {
            thirstLevel-= 2;
            boredomLevel++;
        }
        else if (thirstLevel == 1){
            thirstLevel --;
            boredomLevel++;
        }
        else{
            boredomLevel++;
        }
        System.out.println("ヽ(^o^)ノ");
    }

    public void playWithPet() {
        if(boredomLevel > 2) {
            boredomLevel -= 2;
            hungerLevel++;
            thirstLevel++;
        }
        if (boredomLevel == 1) {
            boredomLevel--;
            hungerLevel++;
            thirstLevel++;
        }
        else if (boredomLevel==0) {
            hungerLevel++;
            thirstLevel++;
        }
        System.out.println("ヽ(^o^)ノ");
    }

    public void tick() {
        hungerLevel++;
        thirstLevel++;
        boredomLevel++;
    }

    public void virtualPetUpdate() {
        System.out.println(name + "'s hunger level: " + hungerLevel);
        System.out.println(name + "'s Thirst Level: " + thirstLevel);
        System.out.println(name + "'s Boredom Level: " + boredomLevel);
    }

    public void VirtualPetEmotion() {
        if (hungerLevel >= 7 && thirstLevel >= 7) {
            System.out.printf("(╬ ಠ益ಠ)");
        } else if (hungerLevel >= 7 && thirstLevel <= 5) {
            System.out.println("ಠ_ಠ");
        } else if (thirstLevel >= 7 && hungerLevel <= 5) {
            System.out.println("(・_・;)");
        } else if (boredomLevel >= 7) {
            System.out.println("(-_-) zzz");
        } else {
            System.out.println("ヽ(•‿•)ノ");
        }
    }
}





