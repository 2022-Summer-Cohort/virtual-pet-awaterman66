package virtual_pet;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPetShelter petShelter = new VirtualPetShelter();
        VirtualPet Zena = new OrganicDog("Zena",15,5,6,5);
        VirtualPet Beavis = new RoboticCat("Beavis", 5, 15);
        VirtualPet Chonk = new OrganicCat("Chonk", 15, 5, 5, 5);
        VirtualPet Menzie = new RoboticDog("Menzie", 6, 15);
        petShelter.addPet(Zena);
        petShelter.addPet(Menzie);
        petShelter.addPet(Chonk);
        petShelter.addPet(Beavis);
        petShelter.introText();
        System.out.println("Press Enter to continue");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        petShelter.commandList();
        System.out.println("Press Enter to hear a greeting from your pets");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        petShelter.petGreet();
        while (!petShelter.checkIfPetsDied()){
            System.out.println("Please type a command 0-10 or help.");
            String userCommand = input.nextLine();
            if (userCommand.equals("help")){
                petShelter.commandList();
                System.out.println("What would you like to do?");
                userCommand = input.nextLine();
            }
            if (userCommand.equals("0")){
                System.out.println(petShelter.getAllPetNames());
            }
            if (userCommand.equals("1")){
                petShelter.getAllPetsUpdate();
            }
            if (userCommand.equals("2")){
                petShelter.waterAllOrganicPets();
                petShelter.organicPetUpdate();
            }
            if (userCommand.equals("3")){
                petShelter.feedAllOrganicPets();
                petShelter.organicPetUpdate();
            }
            if (userCommand.equals("4")){
                petShelter.cleanAllOrganicPetCages();
                petShelter.organicPetUpdate();
            }
            if (userCommand.equals("5")){
            petShelter.giveAllRoboticPetsOil();

            petShelter.roboticPetUpdate();
            }
            if (userCommand.equals("6")){
            petShelter.giveAllRoboticPetsMaintenance();
            petShelter.roboticPetUpdate();
            }
            if (userCommand.equals("7")){
                petShelter.walkOrganic();
                petShelter.organicPetUpdate();
            }
            if (userCommand.equals("8")){
                petShelter.walkRobotic();
                petShelter.roboticPetUpdate();
            }
            if (userCommand.equals("9")){
                System.out.println("Type the name of the pet you want to adopt");
                String nameOfPet = input.nextLine();
                petShelter.adoptAPet(nameOfPet);
            }
            if (userCommand.equals("10")){
                System.out.println("What kind of pet would you like to add?");
                System.out.println("Type RD for robotic dog");
                System.out.println("Type RC for robotic cat");
                System.out.println("Type OD for organic dog");
                System.out.println("Type OC for organic cat");
                String typeOfPet = input.nextLine();
                if (typeOfPet.equals("RD")){
                    System.out.println("What name would you like to give your new robotic dog?");
                    String nameOfPet = input.nextLine();
                    int addedOil = (int) (Math.random() * 15);
                    int addedMaintenance = (int) (Math.random() * 10);
                    RoboticDog addedPet = new RoboticDog(nameOfPet, addedOil, addedMaintenance);
                    System.out.println("Your new robotic dog's name is " + addedPet.getName());
                    petShelter.addNewPet(addedPet);
                    petShelter.petGreet();
                }
                if (typeOfPet.equals("RC")){
                    System.out.println("What name would you like to give your new robotic cat?");
                    String nameOfPet = input.nextLine();
                    int addedOil = (int) (Math.random() * 15);
                    int addedMaintenance = (int) (Math.random() * 10);
                    RoboticCat addedPet = new RoboticCat(nameOfPet, addedOil, addedMaintenance);
                    System.out.println("Your new robotic cat's name is " + addedPet.getName());
                    petShelter.addNewPet(addedPet);
                    petShelter.petGreet();
                }
                if (typeOfPet.equals("OD")){
                    System.out.println("What name would you like to give your new organic dog?");
                    String nameOfPet = input.nextLine();
                    int addedHunger = (int) (Math.random() * 10);
                    int addedThirst = (int) (Math.random() * 10);
                    int addedBoredom = (int) (Math.random() * 10);
                    int addedCleanliness = (int) (Math.random() * 10);
                    OrganicDog addedPet = new OrganicDog(nameOfPet, addedCleanliness, addedHunger, addedThirst, addedBoredom);
                    System.out.println("Your new organic dog's name is " + addedPet.getName());
                    petShelter.addNewPet(addedPet);
                    petShelter.petGreet();
                }
                if (typeOfPet.equals("OC")){
                    System.out.println("What name would you like to give your new organic cat?");
                    String nameOfPet = input.nextLine();
                    int addedHunger = (int) (Math.random() * 10);
                    int addedThirst = (int) (Math.random() * 10);
                    int addedBoredom = (int) (Math.random() * 10);
                    int addedCleanliness = (int) (Math.random() * 10);
                    OrganicCat addedPet = new OrganicCat(nameOfPet, addedCleanliness, addedHunger, addedThirst, addedBoredom);
                    System.out.println("Your new organic cat's name is " + addedPet.getName());
                    petShelter.addNewPet(addedPet);
                    petShelter.petGreet();
                }

            }
            petShelter.tick();


        }
    }
}
























//        VirtualPet starterPet1 = new VirtualPet("Tom", 3, 3,3);
//        VirtualPet starterPet2 = new VirtualPet("Jerry", 3,3,3);
//        petShelter.addNewPet(starterPet1);
//        petShelter.addNewPet(starterPet2);
//        System.out.println("Welcome to your Virtual Pet Shelter!");
//        System.out.println("There are already two Virtual Pets already living in your shelter.");
//        System.out.println("Their names are "+ starterPet1.getName() + " and " + starterPet2.getName() +".");
//        System.out.println("Here in your shelter Virtual Pets can be adopted, added, and die.");
//        System.out.println("You can take care of your pets needs by feeding, watering, and playings with them.");
//        petShelter.menuOptions();
//        System.out.println("To see this menu again or if you get stuck type help.");
//        while (!petShelter.checkIfAnyoneDied()){
//            if(petShelter.checkIsEmpty()){
//                System.out.println("You adopted all your pets Game Over.");
//                break;
//            }
//            System.out.println("What would you like to do?");
//            String userCommand = input.nextLine();
//            if (userCommand.equals("help")){
//                petShelter.menuOptions();
//                System.out.println("What would you like to do?");
//                userCommand = input.nextLine();
//            }
//            if (userCommand.equals("1")){
//                System.out.println(petShelter.getAllPetNames());
//            }
//            if (userCommand.equals("2")){
//                petShelter.feedAllPets();
//            }
//            if (userCommand.equals("3")){
//                System.out.println("Which pet would you like to feed?");
//                userCommand = input.nextLine();
//                String nameOfPet = userCommand;
//                petShelter.feedThisPet(nameOfPet);
//            }
//
//            if (userCommand.equals("4")){
//                petShelter.giveAllPetsWater();
//            }
//            if (userCommand.equals("5")){
//                System.out.println("Which pet would you like to give water?");
//                userCommand = input.nextLine();
//                String nameOfPet = userCommand;
//                petShelter.giveThisPetWater(nameOfPet);
//            }
//            if (userCommand.equals("6")){
//                petShelter.playWithAllPets();
//            }
//            if (userCommand.equals("7")){
//                System.out.println("Which pet would you like to play with?");
//                userCommand = input.nextLine();
//                String nameOfPet = userCommand;
//                petShelter.playWithThisPet(nameOfPet);
//            }
//            if (userCommand.equals("8")){
//                System.out.println("Which pet would you adopt out?");
//                userCommand = input.nextLine();
//                String petName = userCommand;
//                petName.toLowerCase();
//                petShelter.adoptAPet(petName);
//            }
//            if (userCommand.equals("9")){
//                System.out.println("What name do you want to give your new pet?");
//                userCommand = input.nextLine();
//                String addedPetName = userCommand;
//                int randomHungerLevel = (int) (Math.random() * 10);
//                int randomThirstLevel = (int) (Math.random()* 10);
//                int randomBoredomLevel = (int) (Math.random()* 10);
//                VirtualPet addedPet = new VirtualPet(addedPetName, randomHungerLevel, randomThirstLevel, randomBoredomLevel);
//                petShelter.addNewPet(addedPet);
//            }
//            if (userCommand.equals("0")){
//                petShelter.getAllPetsUpdate();
//            }
//
//            petShelter.tickAll();
//            if (petShelter.checkIfAnyoneDied()){
//                System.out.println("One of your pets has died. Game Over.");
//            }
//        }
