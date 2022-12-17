package reflection;

public class Cat extends Animal {
    private String name;
    private int age;

    private static final String ANIMAL_FAMILY = "Семейство кошачьих";

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void sayMeow() {
        System.out.println("Meow");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
