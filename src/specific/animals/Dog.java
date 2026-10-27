package specific.animals;

import model.Pet;

import java.time.LocalDate;

public class Dog extends Pet {
    private String breed;

    public Dog() {
    }

    public Dog(String name, LocalDate dob) {
        super(name, dob);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark(){
        System.out.println("Ruff, ruff!");
    }
}
