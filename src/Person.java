import business.Company;

public class Person {
    int age = 21;
    Company company = new Company();
    NewsAgency newsAgency;
    static int[] nums;
    static String[] daysOfTheWeek = createDaysOfTheWeek();
    public static final int DAYS_IN_WEEK = 7;
    String firstName;
    String lastName;
    static int count = 0;


    static {
        nums = new int[5];
        nums[0] = 3;
        nums[1] = 7;
        nums[2] = 11;
        nums[3] = 19;
        nums[4] = 42;
    }

    public static String[] createDaysOfTheWeek() {
        String[] daysOfTheWeek = new String[7];
        daysOfTheWeek[0] = "Monday";
        daysOfTheWeek[1] = "Tuesday";
        daysOfTheWeek[2] = "Wednesday";
        daysOfTheWeek[3] = "Thursday";
        daysOfTheWeek[4] = "Friday";
        daysOfTheWeek[5] = "Saturday";
        daysOfTheWeek[6] = "Sunday";
        return daysOfTheWeek;
    }

    static void main(String[] args) {
        Company company = new Company();
        Company company1 = new Company();
        System.out.println(company);
        System.out.println(company1);

        Person p1 = new Person();
        p1.sayHello();
        p1.saySomething("My groovy message");
        p1.saySomething("Here's something else to say");
        int sum1 = p1.add(3, 5);
        System.out.println(sum1);

        Person.sayGoodbye();
        new Person().sayHello();
        System.out.println(Calculator.add(5, 3));
        System.out.println(Calculator.divide(5, 3));
        Greeter greeter = new Greeter();
        greeter.greet("Alex");
        greeter.greet("Helen");
        greeter.greet("Ann");
        System.out.println(greeter.makeGreeting("John"));
        p1.printAll();
        System.out.println(Person.count);
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();
        System.out.println(Person.count);
        System.out.println(daysOfTheWeek[3]);
    }

    public Person(){
        count++;
    }

    public void introduce(String greeting, String... names) {

    }

    public String getInitials() {
        return "" + firstName.charAt(0) + lastName.charAt(0);
    }

    public void printAll(String... items) {
        System.out.println(items.length);
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public static void sayGoodbye() {
        System.out.println("Goodbye");
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public void saySomething(String message){
        System.out.println(message);
    }

    public void myTestMethod(){
        var age = 21;
        var name = "Jake";
        var company = new Company();
        String jake1 = "Jake1";
    }
}
