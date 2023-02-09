package структурные_паттерны.facade.ex1;

public class Engine implements Car{
    @Override
    public void start() {
        System.out.println("Запустить двигатель");
    }

    @Override
    public void stop() {
        System.out.println("Остановить двигатель");
    }
}
