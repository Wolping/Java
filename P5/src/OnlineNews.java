import java.util.ArrayList;
import java.util.List;
class OnlineNews implements Subject {
    private List<Observer> observers;
    private String latestNews;

    public OnlineNews() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String news) {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }

    public void setLatestNews(String latestNews) {
        this.latestNews = latestNews;
        notifyObservers(latestNews);
    }
}
