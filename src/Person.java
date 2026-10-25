import business.Company;

public class Person {
    int age = 21;
    Company company = new Company();
    NewsAgency newsAgency;

    static void main(String[] args) {
        Company company = new Company();
        Company company1 = new Company();
        System.out.println(company);
        System.out.println(company1);
    }

    public void myTestMethod(){
        var age = 21;
        var name = "Jake";
        var company = new Company();
        String jake1 = "Jake1";
    }
}
