package шаблоны_поведенческие_behavioral.Observer_Listener_Наблюдатель_Слушатель.ex1;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Observer> observers = new ArrayList<>();
    private List<String> students = new ArrayList<>();

    public void addStudent(String name) {
        students.add(name);
        notifyObservers();
    }

    public void removeStudent(String name) {
        students.remove(name);
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observers);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.event(students);
        }
    }
}
