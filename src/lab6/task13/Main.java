package lab6.task13;

import java.util.ArrayList;
import java.util.List;

// Интерфейс для наблюдателей
interface StringBuilderObserver {
    void update(StringBuilder subject);
}

// Класс StringBuilder с оповещением наблюдателей
class ObservableStringBuilder {
    private StringBuilder stringBuilder = new StringBuilder();
    private List<StringBuilderObserver> observers = new ArrayList<>();

    // Метод для добавления наблюдателя
    public void addObserver(StringBuilderObserver observer) {
        observers.add(observer);
    }

    // Метод для удаления наблюдателя
    public void removeObserver(StringBuilderObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (StringBuilderObserver observer : observers) {
            observer.update(this.stringBuilder);
        }
    }

    public ObservableStringBuilder append(String str) {
        stringBuilder.append(str);
        notifyObservers();
        return this;
    }

    public ObservableStringBuilder delete(int start, int end) {
        stringBuilder.delete(start, end);
        notifyObservers();
        return this;
    }

    public int length() {
        return stringBuilder.length();
    }

    public String toString() {
        return stringBuilder.toString();
    }
}

class Observer implements StringBuilderObserver {
    @Override
    public void update(StringBuilder subject) {
        System.out.println("Изменено состояние StringBuilder: " + subject.toString());
    }
}

public class Main {
    public static void main(String[] args) {
        ObservableStringBuilder observableStringBuilder = new ObservableStringBuilder();

        Observer observer = new Observer();
        observableStringBuilder.addObserver(observer);

        observableStringBuilder.append("Привет, ");
        observableStringBuilder.append("Иванов Иван Иванович");
        observableStringBuilder.delete(6,28);

        //оповещения не будет!
        observableStringBuilder.removeObserver(observer);

        observableStringBuilder.append(" пока");
        
        System.out.println("Текущее состояние StringBuilder: " + observableStringBuilder.toString());
    }
}
