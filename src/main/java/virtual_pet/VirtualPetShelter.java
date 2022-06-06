package virtual_pet;

import java.util.ArrayList;
import java.util.Iterator;

public class VirtualPetShelter {
    private ArrayList<VirtualPet>  virtualPetShelter;

    public VirtualPetShelter() {
        this.virtualPetShelter = new ArrayList<>();

    }

    public ArrayList<VirtualPet> getVirtualPetShelter() {
        return virtualPetShelter;
    }

    public ArrayList<VirtualPet> getAllNames() {
        return virtualPetShelter;
    }

    public String getAllPetNames() {
        String allPetNames = "";
        if (virtualPetShelter.isEmpty()){
            return "There are no pets in the shelter. Please add pets by pressing 9.";
        }
        else {
            for (VirtualPet pet : virtualPetShelter){
                allPetNames += pet.getName() + " ";
            }
            return allPetNames;
        }

    }

    public void feedAllPets() {
        for (VirtualPet pet : virtualPetShelter) {
            pet.feedPet();
        }
    }
    public void feedThisPet(String nameOfPet){
        for (VirtualPet pet : virtualPetShelter) {
            if (pet.getName().equals(nameOfPet)) {
                pet.feedPet();
            }

        }
    }
    public void giveAllPetsWater() {
        for (VirtualPet pet : virtualPetShelter) {
            pet.givePetWater();
        }
    }
    public void giveThisPetWater(String nameOfPet){
        for (VirtualPet pet: virtualPetShelter){
            if(pet.getName().equals(nameOfPet)){
                pet.givePetWater();
            }
        }
    }
    public void playWithAllPets() {
        for (VirtualPet pet: virtualPetShelter){
            pet.playWithPet();
        }
    }
    public void playWithThisPet(String nameOfPet){
        for(VirtualPet pet: virtualPetShelter){
            if (pet.getName().equals(nameOfPet)) {
                pet.playWithPet();
            }
        }
    }
    public void getAllPetsUpdate(){
        for (VirtualPet pet: virtualPetShelter){
            pet.virtualPetUpdate();
        }
    }

    public void adoptAPet (String nameOfPetToAdopt){
        virtualPetShelter.removeIf(pet -> pet.getName().toLowerCase().contains(nameOfPetToAdopt.toLowerCase()));
    }

    public void addNewPet(VirtualPet name){
        virtualPetShelter.add(name);
    }


    public void tickAll(){
        for (VirtualPet pet: virtualPetShelter){
            pet.tick();
        }
    }
    public void menuOptions(){
        System.out.println("Command list:");
        System.out.println("To see your pets names type : 1.");
        System.out.println("To feed all of your pets type : 2.");
        System.out.println("To feed a specific pet type: 3 then type the pet's name.");
        System.out.println("To give all your pets water type: 4.");
        System.out.println("To give Water to a specific pet type 5 then the pet's name.");
        System.out.println("To play with all the pets type 6.");
        System.out.println("To play with a specific pet type 7 then the pet's name.");
        System.out.println("To adopt a pet type 8.");
        System.out.println("To add a new pet type 9.");
        System.out.println("To get your pet's status type 0.");
    }
    public boolean checkIsEmpty(){
        if(virtualPetShelter.isEmpty()){
            return true;
        }
        return false;
    }
    public boolean checkIfAnyoneDied(){
        for (VirtualPet pet : virtualPetShelter){
            if (pet.getHungerLevel() >= 20 || pet.getThirstLevel() >= 20 || pet.getBoredomLevel() >= 20) {
                return true;
            }
        }
        return false;
    }

}



