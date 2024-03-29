package шаблоны_поведенческие_behavioral.Observer_Listener_Наблюдатель_Слушатель.ex2;


import java.util.ArrayList;
import java.util.List;

public class CatholicChurch implements Observable {
    private List<Observer> parishioners;
    private String newsChurch;

    public CatholicChurch() {
        parishioners = new ArrayList<>();
    }

    public void setNewsChurch(String news) {
        this.newsChurch = news;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        parishioners.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        parishioners.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : parishioners)
            o.update(newsChurch);
    }
}



