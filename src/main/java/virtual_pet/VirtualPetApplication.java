package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Congratulations on your new Virtual Pet! Please enter a name for your pet:");
        String petName = input.nextLine();
        VirtualPet userPet = new VirtualPet(petName, 3, 3, 3);
        System.out.println("Your Virtual Pet's name is: " + userPet.getName());
        System.out.println("If your Virtual Pet's hunger, thirst, or boredom levels gets to 10, Your Pet is dead.");
        System.out.println("(X_X)");
        System.out.println("You can feed your pet to raise it's hunger level by typing: feedPet when prompted.");
        System.out.println("You can give your pet water by typing: givePetWater.");
        System.out.println("You can play with your get by typing: playWithPet.");
        System.out.println("But be careful, playing with your pet will raise hunger and thirst levels!");
        System.out.println("Have fun!");
        while (userPet.getHungerLevel() != 10 || userPet.getThirstLevel() != 10 || userPet.getBoredomLevel() != 10) {
            boolean petAlive = true;
            userPet.virtualPetUpdate();
//            userPet.VirtualPetEmotion();
            System.out.println("What would you like to do with your Virtual Pet?");
            String command = input.nextLine();
            if (command.equals("feedPet") && userPet.getHungerLevel() > 0) {
                userPet.feedPet();
            }
            if (command.equals("givePetWater") && userPet.getThirstLevel() > 0) {
                userPet.givePetWater();
            }
            if (command.equals("playWithPet") && userPet.getBoredomLevel() > 0) {
                userPet.playWithPet();
            } else {
                System.out.println("Please re-type your command or type help for a guide.");
            }
            userPet.tick();
            }
            if (userPet.getHungerLevel() == 10 || userPet.getThirstLevel() == 10 || userPet.getBoredomLevel() == 10) {
                System.out.println("Poor " + userPet.getName() + " has died....");
            }
        }

    }

