package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        VirtualPetShelter petShelter = new VirtualPetShelter();
        VirtualPet starterPet1 = new VirtualPet("Tom", 3, 3,3);
        VirtualPet starterPet2 = new VirtualPet("Jerry", 3,3,3);
        petShelter.addNewPet(starterPet1);
        petShelter.addNewPet(starterPet2);
        System.out.println("Welcome to your Virtual Pet Shelter!");
        System.out.println("There are already two Virtual Pets already living in your shelter.");
        System.out.println("Their names are "+ starterPet1.getName() + " and " + starterPet2.getName() +".");
        System.out.println("Here in your shelter Virtual Pets can be adopted, added, and die.");
        System.out.println("You can take care of your pets needs by feeding, watering, and playings with them.");
        petShelter.menuOptions();
        System.out.println("To see this menu again or if you get stuck type help.");
        while (!petShelter.checkIfAnyoneDied()){
            if(petShelter.checkIsEmpty()){
                System.out.println("You adopted all your pets Game Over.");
                break;
            }
            System.out.println("What would you like to do?");
            String userCommand = input.nextLine();
            if (userCommand.equals("help")){
                petShelter.menuOptions();
                System.out.println("What would you like to do?");
                userCommand = input.nextLine();
            }
            if (userCommand.equals("1")){
                System.out.println(petShelter.getAllPetNames());
            }
            if (userCommand.equals("2")){
                petShelter.feedAllPets();
            }
            if (userCommand.equals("3")){
                System.out.println("Which pet would you like to feed?");
                userCommand = input.nextLine();
                String nameOfPet = userCommand;
                petShelter.feedThisPet(nameOfPet);
            }

            if (userCommand.equals("4")){
                petShelter.giveAllPetsWater();
            }
            if (userCommand.equals("5")){
                System.out.println("Which pet would you like to give water?");
                userCommand = input.nextLine();
                String nameOfPet = userCommand;
                petShelter.giveThisPetWater(nameOfPet);
            }
            if (userCommand.equals("6")){
                petShelter.playWithAllPets();
            }
            if (userCommand.equals("7")){
                System.out.println("Which pet would you like to play with?");
                userCommand = input.nextLine();
                String nameOfPet = userCommand;
                petShelter.playWithThisPet(nameOfPet);
            }
            if (userCommand.equals("8")){
                System.out.println("Which pet would you adopt out?");
                userCommand = input.nextLine();
                String petName = userCommand;
                petName.toLowerCase();
                petShelter.adoptAPet(petName);
            }
            if (userCommand.equals("9")){
                System.out.println("What name do you want to give your new pet?");
                userCommand = input.nextLine();
                String addedPetName = userCommand;
                int randomHungerLevel = (int) (Math.random() * 10);
                int randomThirstLevel = (int) (Math.random()* 10);
                int randomBoredomLevel = (int) (Math.random()* 10);
                VirtualPet addedPet = new VirtualPet(addedPetName, randomHungerLevel, randomThirstLevel, randomBoredomLevel);
                petShelter.addNewPet(addedPet);
            }
            if (userCommand.equals("0")){
                petShelter.getAllPetsUpdate();
            }

            petShelter.tickAll();
            if (petShelter.checkIfAnyoneDied()){
                System.out.println("One of your pets has died. Game Over.");
            }
        }
    }
}
