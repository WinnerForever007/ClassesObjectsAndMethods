package business.package2;

public class ClassB {

    public void publicMethod() {
        System.out.println("This is the public method of ClassB");
        privateMethod();
    }

    protected void protectedMethod() {
        System.out.println("This is the protected method of ClassB");
    }

    void packagePrivateMethod() {
        System.out.println("This is the package-private method of ClassB");
    }

    private void privateMethod() {
        System.out.println("This is the private method of ClassB");
    }
}
