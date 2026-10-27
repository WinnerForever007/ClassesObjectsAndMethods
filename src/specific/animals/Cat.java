package specific.animals;

import model.Pet;

import java.time.LocalDate;

public class Cat extends Pet {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        System.out.println(cat1);
    }

    public Cat() {
    }

    public Cat(String name, LocalDate dob) {
        super(name, dob);
    }

    public void meow(){
        System.out.println("Meow");
        super.protectedMethod();
    }

    @Override
    public String toString() {
        return getName() + " - name: Tony";
    }


}
