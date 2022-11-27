package Observable;

import Observer.Observer;
import java.util.ArrayList;

public class Processor implements Observable{
    private ArrayList<Observer> observers = new ArrayList<>();
    private double temperature;
    private int frequency;
    private int usage;
    private int cores;


    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (int i=0; i<observers.size(); i++)
            observers.get(i).update(temperature, frequency, usage, cores);
    }

    public void parametrsChanged(){
        notifyObservers();
    }

    public void setParametrs(double temperature, int frequency, int usage, int cores){
        this.temperature = temperature;
        this.frequency = frequency;
        this.usage = usage;
        this.cores = cores;
        parametrsChanged();
    }
}
