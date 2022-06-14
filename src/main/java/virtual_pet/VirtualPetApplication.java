//package virtual_pet;
//
//import java.util.Scanner;
//
//public class VirtualPetApplication {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Congratulations on your new Virtual Pet! Please enter a name for your pet:");
//        String petName = input.nextLine();
//        VirtualPet userPet = new VirtualPet(petName, 3, 3, 3);
//        userPet.greetUser();
//        while (userPet.getHungerLevel() < 20 && userPet.getThirstLevel() < 20 && userPet.getBoredomLevel() < 20) {
//            userPet.virtualPetUpdate();
//            userPet.VirtualPetEmotion();
//            System.out.println("What would you like to do with your Virtual Pet?");
//            String command = input.nextLine();
//            if (command.equals("feed") && userPet.getHungerLevel() > 0) {
//                userPet.feedPet();
//            }
//            else if (command.equals("water") && userPet.getThirstLevel() > 0) {
//                userPet.givePetWater();
//            }
//            else if (command.equals("play") && userPet.getBoredomLevel() > 0) {
//                userPet.playWithPet();
//            }
//            else if (command.equals("help")){
//                System.out.println("You can feed your pet to raise it's hunger level by typing: feed when prompted.");
//                System.out.println("You can give your pet water by typing: water.");
//                System.out.println("You can play with your get by typing: play.");
//            }
//            else {
//                System.out.println("Please re-type your command or type help for a guide.");
//            }
//            userPet.tick();
//            }
//            if (userPet.getHungerLevel() >= 20) {
//                System.out.println("(X_X)");
//                System.out.println("Poor " + userPet.getName() + " has died of hunger");
//            }
//            else if (userPet.getThirstLevel()>=20) {
//                System.out.println("(X_X)");
//                System.out.println("Poor " + userPet.getName() + " has died of thirst");
//            }
//            else if (userPet.getBoredomLevel()>=20) {
//                System.out.println("(X_X)");
//                System.out.println("Poor " + userPet.getName() + " has died of boredom");
//            }
//        }
//
//    }

