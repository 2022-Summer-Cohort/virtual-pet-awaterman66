package virtual_pet;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {
    @Test
    public void shouldReturnAllPetNames(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet underTestPet1 = new VirtualPet("Zena", 1,1,1);
        VirtualPet underTestPet2 = new VirtualPet("Timmy", 1,1,1);
        underTest.addNewPet(underTestPet1);
        underTest.addNewPet(underTestPet2);
        assertEquals("Zena Timmy ", underTest.getAllPetNames());
    }
    @Test
    public void shouldLowerAllPetsHungerLevelsByTwo() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet underTestPet1 = new VirtualPet("Zena", 5, 1, 1);
        VirtualPet underTestPet2 = new VirtualPet("Timmy", 2, 1, 1);
        underTest.addNewPet(underTestPet1);
        underTest.addNewPet(underTestPet2);
        underTest.feedAllPets();
        assertEquals(3, underTestPet1.getHungerLevel());
        assertEquals(0, underTestPet2.getHungerLevel());
    }
    @Test
    public void shouldLowerHungerLevelOfOnePet(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet underTestPet1 = new VirtualPet("Zena", 5, 1, 1);
        VirtualPet underTestPet2 = new VirtualPet("Timmy", 2, 1, 1);
        underTest.addNewPet(underTestPet1);
        underTest.addNewPet(underTestPet2);
        underTest.feedThisPet("Zena");
        assertEquals(3, underTestPet1.getHungerLevel());
    }
    @Test
    public void shouldLowerAllPetsThirstLevelsByTwo() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet underTestPet1 = new VirtualPet("Zena", 5, 5, 5);
        VirtualPet underTestPet2 = new VirtualPet("Timmy", 2, 5, 5);
        underTest.addNewPet(underTestPet1);
        underTest.addNewPet(underTestPet2);
        underTest.giveAllPetsWater();
        assertEquals(3, underTestPet1.getThirstLevel());
        assertEquals(3, underTestPet2.getThirstLevel());
    }
    @Test
    public void shouldLowerThirstLevelOfOnePet(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet underTestPet1 = new VirtualPet("Zena", 5, 5, 1);
        VirtualPet underTestPet2 = new VirtualPet("Timmy", 2, 1, 1);
        underTest.addNewPet(underTestPet1);
        underTest.addNewPet(underTestPet2);
        underTest.giveThisPetWater("Zena");
        assertEquals(3, underTestPet1.getThirstLevel());
    }
    @Test
    public void shouldLowerAllPetsBoredomLevelsByTwo() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet underTestPet1 = new VirtualPet("Zena", 5, 5, 5);
        VirtualPet underTestPet2 = new VirtualPet("Timmy", 2, 5, 5);
        underTest.addNewPet(underTestPet1);
        underTest.addNewPet(underTestPet2);
        underTest.playWithAllPets();
        assertEquals(3, underTestPet1.getBoredomLevel());
        assertEquals(3, underTestPet2.getBoredomLevel());
    }
    @Test
    public void shouldLowerBoredomLevelOfOnePet(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet underTestPet1 = new VirtualPet("Zena", 5, 5, 5);
        VirtualPet underTestPet2 = new VirtualPet("Timmy", 2, 1, 1);
        underTest.addNewPet(underTestPet1);
        underTest.addNewPet(underTestPet2);
        underTest.playWithThisPet("Zena");
        assertEquals(3, underTestPet1.getBoredomLevel());
    }
    @Test
    public void shouldRemoveSpecifiedPet() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet underTestPet1 = new VirtualPet("Zena", 5, 5, 5);
        VirtualPet underTestPet2 = new VirtualPet("Timmy", 2, 1, 1);
        underTest.addNewPet(underTestPet1);
        underTest.addNewPet(underTestPet2);
        underTest.adoptAPet("Zena");
        assertEquals("Timmy ", underTest.getAllPetNames());
    }
    @Test
    public void shouldLowerAllPetsLevelsByTwo() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet underTestPet1 = new VirtualPet("Zena", 5, 5, 5);
        VirtualPet underTestPet2 = new VirtualPet("Timmy", 2, 5, 5);
        underTest.addNewPet(underTestPet1);
        underTest.addNewPet(underTestPet2);
        underTest.tickAll();
        assertEquals(6, underTestPet1.getBoredomLevel());
        assertEquals(6, underTestPet2.getBoredomLevel());
        assertEquals(6, underTestPet1.getThirstLevel());
        assertEquals(6, underTestPet1.getHungerLevel());
    }
}
