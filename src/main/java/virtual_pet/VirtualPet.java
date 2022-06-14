package virtual_pet;

public abstract class VirtualPet implements Animal{

    protected String name;

    public String getName() {
        return name;
    }


    public VirtualPet(String name) {
        this.name = name;
    }



//    public void feedPet() {
//        if (hungerLevel >= 2) {
//            hungerLevel-= 2;
//            boredomLevel++;
//        }
//        else if (hungerLevel == 1){
//            hungerLevel --;
//            boredomLevel++;
//        }
//        else{
//            boredomLevel++;
//        }
//        System.out.println("ヽ(^o^)ノ");
//    }

//    public void givePetWater() {
//        if (thirstLevel >= 2) {
//            thirstLevel-= 2;
//            boredomLevel++;
//        }
//        else if (thirstLevel == 1){
//            thirstLevel --;
//            boredomLevel++;
//        }
//        else{
//            boredomLevel++;
//        }
//        System.out.println("ヽ(^o^)ノ");
//    }

//    public void playWithPet() {
//        if(boredomLevel > 2) {
//            boredomLevel -= 2;
//            hungerLevel++;
//            thirstLevel++;
//        }
//        if (boredomLevel == 1) {
//            boredomLevel--;
//            hungerLevel++;
//            thirstLevel++;
//        }
//        else if (boredomLevel==0) {
//            hungerLevel++;
//            thirstLevel++;
//        }
//        System.out.println("ヽ(^o^)ノ");
//    }

//    public void tick() {
//        hungerLevel++;
//        thirstLevel++;
//        boredomLevel++;
//    }
//    public void greetUser(){
//        System.out.println("Your Virtual Pet's name is: " + name);
//        System.out.println("If your Virtual Pet's hunger, thirst, or boredom levels gets to 20, Your Pet is dead.");
//        System.out.println("(X_X)");
//        System.out.println("You can feed your pet to raise it's hunger level by typing: feed.");
//        System.out.println("You can give your pet water by typing: water.");
//        System.out.println("You can play with your get by typing: play.");
//        System.out.println("But be careful, playing with your pet will raise hunger and thirst levels!");
//        System.out.println("Have fun!");
//    }

//    public void virtualPetUpdate() {
//        System.out.println(name + "'s hunger level: " + hungerLevel);
//        System.out.println(name + "'s Thirst Level: " + thirstLevel);
//        System.out.println(name + "'s Boredom Level: " + boredomLevel);


//    public void VirtualPetEmotion() {
//        if (hungerLevel >= 13 && thirstLevel >= 13) {
//            System.out.println("(╬ ಠ益ಠ)");
//        } else if (hungerLevel >= 13 && thirstLevel <= 10) {
//            System.out.println("ಠ_ಠ");
//        } else if (thirstLevel >= 13 && hungerLevel <= 10) {
//            System.out.println("(・_・;)");
//        } else if (boredomLevel >= 10) {
//            System.out.println("(-_-) zzz");
//        } else {
//            System.out.println("ヽ(•‿•)ノ");
//        }
//    }


}




