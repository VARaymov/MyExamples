package шаблоны_структурные_structural.proxy.ex1;

public class ProxyTest {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        image.display();;
        image.display();
    }
}
