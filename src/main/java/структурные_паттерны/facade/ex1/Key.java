package структурные_паттерны.facade.ex1;

public class Key implements Car{
    @Override
    public void start() {
        System.out.println("Вставить ключи");
    }

    @Override
    public void stop() {
        System.out.println("Вытянуть ключи");
    }
}
