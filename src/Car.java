public class Car {
    private String make;
    private String model;
    private int year;

    private Car() {
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        System.out.printf("Model is %s", model);
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        System.out.printf("Year is %d", year);
        return year;
    }

    public void setYear(int year) {
        if(year < 1886 || year > 2026){
            System.out.println("Wrong Year");
        }
        else
            this.year = year;
    }
}
