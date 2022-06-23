package virtual_pet;

import java.util.ArrayList;

public class VirtualPetShelter {
    private ArrayList<VirtualPet> virtualPetShelter;

    public VirtualPetShelter() {
        this.virtualPetShelter = new ArrayList<>();

    }


    public String getAllPetNames() {
        String allPetNames = "";
        for (VirtualPet pet : virtualPetShelter) {
            allPetNames += pet.getName() + " ";
        }
        return allPetNames;
    }
    public void organicPetUpdate(){
        for (VirtualPet pet : virtualPetShelter){
            if(pet instanceof OrganicClass){
            ((OrganicClass) pet).organicUpdate();
            }
        }
    }
    public void roboticPetUpdate(){
        for (VirtualPet pet : virtualPetShelter){
            if(pet instanceof RoboticClass){
            ((RoboticClass) pet).roboticUpdate();
            }
        }
    }


    public void feedAllOrganicPets() {
        for (VirtualPet pet : virtualPetShelter) {
            if (pet instanceof OrganicClass) {
                ((OrganicClass) pet).feedPet();
            }
        }
    }


    public void waterAllOrganicPets() {
        for (VirtualPet pet : virtualPetShelter) {
            if (pet instanceof OrganicClass) {
                ((OrganicClass) pet).givePetWater();
            }
        }
    }


    public void giveAllRoboticPetsOil() {
        for (VirtualPet pet : virtualPetShelter) {
            if (pet instanceof RoboticClass) {
                ((RoboticClass) pet).givePetOil();
            }
        }
    }

    public void giveAllRoboticPetsMaintenance() {
        for (VirtualPet pet : virtualPetShelter) {
            if (pet instanceof RoboticClass) {
                ((RoboticClass) pet).workOnPet();
            }
        }
    }

    public void cleanAllOrganicPetCages() {
        for (VirtualPet pet : virtualPetShelter) {
            if (pet instanceof OrganicClass) {
                ((OrganicClass) pet).cleanKennel();
            }
        }
    }

    public void getAllPetsUpdate() {
        for (VirtualPet pet : virtualPetShelter) {
            if (pet instanceof OrganicClass) {
                ((OrganicClass) pet).organicUpdate();
            } else if (pet instanceof RoboticClass) {
                ((RoboticClass) pet).roboticUpdate();
            }
        }
    }
    public  void addPet(VirtualPet pet){
        virtualPetShelter.add(pet);
    }

    public void adoptAPet(String nameOfPetToAdopt) {
        virtualPetShelter.removeIf(pet -> pet.getName().toLowerCase().contains(nameOfPetToAdopt.toLowerCase()));
    }



    public boolean checkIsEmpty() {
        if (virtualPetShelter.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean checkIfPetsDied() {
        for (VirtualPet pet : virtualPetShelter) {
            if (pet instanceof OrganicClass) {
                if (((OrganicClass) pet).isOrganicPetDead()) {
                    return true;
                }
            } else if (pet instanceof RoboticClass) {
                if (((RoboticClass) pet).isRoboticPetDead()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void walkOrganic() {
        for (VirtualPet pet : virtualPetShelter) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).walk();
            }
            if (pet instanceof OrganicCat) {
                ((OrganicCat) pet).walk();
            }
        }
    }
        public void walkRobotic () {
            for (VirtualPet pet : virtualPetShelter) {
                if (pet instanceof RoboticDog) {
                    ((RoboticDog) pet).walk();
                }
                if (pet instanceof RoboticCat) {
                    ((RoboticCat) pet).walk();
                }
            }
        }
        public void addNewPet(VirtualPet name){
        virtualPetShelter.add(name);
    }

        public void commandList() {
            System.out.println("Type 0 for your pets names");
            System.out.println("Type 1 for your pet's statuses");
            System.out.println("Type 2 to give water to your organic pets");
            System.out.println("Type 3 to feed your organic pets");
            System.out.println("Type 4 to clean your organic pet's cages");
            System.out.println("Type 5 to give oil to your robotic pets");
            System.out.println("Type 6 to work on your robotic pet's maintenance");
            System.out.println("Type 7 to give walk your organic pets");
            System.out.println("Type 8 to give walk your robotic pets");
            System.out.println("Type 9 to adopt a pet");
            System.out.println("Type 10 to add a new pet");
            System.out.println("Type help for options");
        }
        public void tick(){
            for (VirtualPet pet : virtualPetShelter) {
                if (pet instanceof OrganicClass) {
                    ((OrganicClass) pet).thirstLevel += 2;
                    ((OrganicClass) pet).hungerLevel += 2;
                    ((OrganicClass) pet).boredomLevel += 2;
                    ((OrganicClass) pet).cleanlinessLevel -= 2;
                } else {
                        ((RoboticClass) pet).oilLevel -= 1;
                        ((RoboticClass) pet).maintenanceLevel += 2;
                    }
                }
            }
            public void petGreet(){
            for (VirtualPet pet : virtualPetShelter){
                System.out.println(pet.name + ": " + pet.makeSound());
            }
            }
            public void  introText(){
                System.out.println("Welcome to the Virtual Pet Amok Shelter!");
                System.out.println("Here at the shelter we have 4 kinds of pets.");
                System.out.println("We have organic and robotic cats and dogs.");
                System.out.println("The shelter has 4 pets in it already.");
                System.out.println("One of each type.");
                System.out.println("please take good care of our animals.");
            }

        }







//    public void feedAllPets() {
//        for (VirtualPet pet : virtualPetShelter) {
//            pet.feedPet();
//        }
//    }
//    public void feedThisPet(String nameOfPet){
//        for (VirtualPet pet : virtualPetShelter) {
//            if (pet.getName().equals(nameOfPet)) {
//                pet.feedPet();
//            }
//
//        }
//    }
//    public void giveAllPetsWater() {
//        for (VirtualPet pet : virtualPetShelter) {
//            pet.givePetWater();
//        }
//    }
//    public void giveThisPetWater(String nameOfPet){
//        for (VirtualPet pet: virtualPetShelter){
//            if(pet.getName().equals(nameOfPet)){
//                pet.givePetWater();
//            }
//        }
//    }
//    public void playWithAllPets() {
//        for (VirtualPet pet: virtualPetShelter){
//            pet.playWithPet();
//        }
//    }
//    public void playWithThisPet(String nameOfPet){
//        for(VirtualPet pet: virtualPetShelter){
//            if (pet.getName().equals(nameOfPet)) {
//                pet.playWithPet();
//            }
//        }
//    }
//    public void getAllPetsUpdate(){
//        for (VirtualPet pet: virtualPetShelter){
//            pet.virtualPetUpdate();
//        }
//    }
//
//    public void adoptAPet (String nameOfPetToAdopt){
//        virtualPetShelter.removeIf(pet -> pet.getName().toLowerCase().contains(nameOfPetToAdopt.toLowerCase()));
//    }
//
//    public void addNewPet(VirtualPet name){
//        virtualPetShelter.add(name);
//    }
//
//
//    public void tickAll(){
//        for (VirtualPet pet: virtualPetShelter){
//            pet.tick();
//        }
//    }
//    public void menuOptions(){
//        System.out.println("Command list:");
//        System.out.println("To see your pets names type : 1.");
//        System.out.println("To feed all of your pets type : 2.");
//        System.out.println("To feed a specific pet type: 3 then type the pet's name.");
//        System.out.println("To give all your pets water type: 4.");
//        System.out.println("To give Water to a specific pet type 5 then the pet's name.");
//        System.out.println("To play with all the pets type 6.");
//        System.out.println("To play with a specific pet type 7 then the pet's name.");
//        System.out.println("To adopt a pet type 8.");
//        System.out.println("To add a new pet type 9.");
//        System.out.println("To get your pet's status type 0.");
//    }
//    public boolean checkIsEmpty(){
//        if(virtualPetShelter.isEmpty()){
//            return true;
//        }
//        return false;
//    }
//    public boolean checkIfAnyoneDied(){
//        for (VirtualPet pet : virtualPetShelter){
//            if (pet.getHungerLevel() >= 20 || pet.getThirstLevel() >= 20 || pet.getBoredomLevel() >= 20) {
//                return true;
//            }
//        }
//        return false;
//    }





