package virtual_pet;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {
    @Test
    public void shouldReturnAllPetNames() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet underTestPet1 = new RoboticCat("Zena", 1, 1);
        VirtualPet underTestPet2 = new RoboticCat("Timmy", 1, 1);
        underTest.addNewPet(underTestPet1);
        underTest.addNewPet(underTestPet2);
        assertEquals("Zena Timmy ", underTest.getAllPetNames());
    }

    @Test
    public void shouldReturnTrueThatPetHasDied() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet underTestPet1 = new RoboticCat("Zena", 5, 0);
        VirtualPet underTestPet2 = new OrganicDog("Timmy", 2, 2, 1, 1);
        underTest.addNewPet(underTestPet1);
        underTest.addNewPet(underTestPet2);
        assertEquals(true, underTest.checkIfPetsDied());
    }

    @Test
    public void shouldAddPetToShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet underTestPet1 = new RoboticCat("Zena", 5, 1);
        VirtualPet underTestPet2 = new OrganicCat("Timmy", 2, 1, 1,1);
        underTest.addNewPet(underTestPet1);
        underTest.addNewPet(underTestPet2);
        VirtualPet addedPetTest = new OrganicCat("billy",1,1,1,1);
        underTest.addNewPet(addedPetTest);
        assertEquals("Zena Timmy billy ", underTest.getAllPetNames());
    }
}
//    @Test
//    public void shouldLowerAllPetsThirstLevelsByTwo() {
//        VirtualPetShelter underTest = new VirtualPetShelter();
//        VirtualPet underTestPet1 = new VirtualPet("Zena", 5, 5, 5);
//        VirtualPet underTestPet2 = new VirtualPet("Timmy", 2, 5, 5);
//        underTest.addNewPet(underTestPet1);
//        underTest.addNewPet(underTestPet2);
//        underTest.giveAllPetsWater();
//        assertEquals(3, underTestPet1.getThirstLevel());
//        assertEquals(3, underTestPet2.getThirstLevel());
//    }
//    @Test
//    public void shouldLowerThirstLevelOfOnePet(){
//        VirtualPetShelter underTest = new VirtualPetShelter();
//        VirtualPet underTestPet1 = new VirtualPet("Zena", 5, 5, 1);
//        VirtualPet underTestPet2 = new VirtualPet("Timmy", 2, 1, 1);
//        underTest.addNewPet(underTestPet1);
//        underTest.addNewPet(underTestPet2);
//        underTest.giveThisPetWater("Zena");
//        assertEquals(3, underTestPet1.getThirstLevel());
//    }
//    @Test
//    public void shouldLowerAllPetsBoredomLevelsByTwo() {
//        VirtualPetShelter underTest = new VirtualPetShelter();
//        VirtualPet underTestPet1 = new VirtualPet("Zena", 5, 5, 5);
//        VirtualPet underTestPet2 = new VirtualPet("Timmy", 2, 5, 5);
//        underTest.addNewPet(underTestPet1);
//        underTest.addNewPet(underTestPet2);
//        underTest.playWithAllPets();
//        assertEquals(3, underTestPet1.getBoredomLevel());
//        assertEquals(3, underTestPet2.getBoredomLevel());
//    }
//    @Test
//    public void shouldLowerBoredomLevelOfOnePet(){
//        VirtualPetShelter underTest = new VirtualPetShelter();
//        VirtualPet underTestPet1 = new VirtualPet("Zena", 5, 5, 5);
//        VirtualPet underTestPet2 = new VirtualPet("Timmy", 2, 1, 1);
//        underTest.addNewPet(underTestPet1);
//        underTest.addNewPet(underTestPet2);
//        underTest.playWithThisPet("Zena");
//        assertEquals(3, underTestPet1.getBoredomLevel());
//    }
//    @Test
//    public void shouldRemoveSpecifiedPet() {
//        VirtualPetShelter underTest = new VirtualPetShelter();
//        VirtualPet underTestPet1 = new VirtualPet("Zena", 5, 5, 5);
//        VirtualPet underTestPet2 = new VirtualPet("Timmy", 2, 1, 1);
//        underTest.addNewPet(underTestPet1);
//        underTest.addNewPet(underTestPet2);
//        underTest.adoptAPet("Zena");
//        assertEquals("Timmy ", underTest.getAllPetNames());
//    }
//    @Test
//    public void shouldLowerAllPetsLevelsByTwo() {
//        VirtualPetShelter underTest = new VirtualPetShelter();
//        VirtualPet underTestPet1 = new VirtualPet("Zena", 5, 5, 5);
//        VirtualPet underTestPet2 = new VirtualPet("Timmy", 2, 5, 5);
//        underTest.addNewPet(underTestPet1);
//        underTest.addNewPet(underTestPet2);
//        underTest.tickAll();
//        assertEquals(6, underTestPet1.getBoredomLevel());
//        assertEquals(6, underTestPet2.getBoredomLevel());
//        assertEquals(6, underTestPet1.getThirstLevel());
//        assertEquals(6, underTestPet1.getHungerLevel());
//    }
//}
