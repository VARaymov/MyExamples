package шаблоны_структурные_structural.facade.ex1;

public class FacadeTest {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.startCar();
        System.out.println();
        facade.stopCar();
    }
}
