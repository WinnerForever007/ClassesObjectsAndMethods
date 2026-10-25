public class ArrayDemo { // работа с массивами
    public static void main(String[] args) {
        System.out.println(args.length);
        //System.out.println(args[0]);
        //System.out.println(args[3]);

        int[] nums = {10, 20, 30, 40, 50};
        System.out.println(nums.length);
        System.out.println(nums[1]);

        String name = "Ihnat";
        int age = 30;
        double heightInMeters = 1.75;
        char firstInitial = 'I';
        boolean isLikeCoffee = true;
        System.out.println(name + " " + age + " " +
                heightInMeters + " " + firstInitial + " " +
                isLikeCoffee);

        String city;
        //System.out.println(city);
        city = "Vitebsk";
        final int DAYS_IN_A_WEEK = 7;
        Person person1 = new Person();
        Person person2 = new Person();
        System.out.println(person1);
        System.out.println(person2);

        var person3 = new Person();
        System.out.println(person3);

        String[] week = {"Monday", "Tuesday", "Wednesday",
        "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(week.length + " " + week[0] + " " +
                week[week.length - 1]);
    }
}
