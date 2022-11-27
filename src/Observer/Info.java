package Observer;

import Cooler.Cooler;
import Observable.Observable;

public class Info implements Observer, Cooler {
    private double temperature;
    private int frequency;
    private int usage;
    private int cores;
    private Observable processor;

    public Info(Observable processor){
        this.processor = processor;
        this.processor.registerObserver(this);
    }

    public void display(){
        System.out.println("Dane processora:\n" + "Temperatura " + temperature + " C" + "\nCzestotliwosc " + frequency + " MHz" + "\nWykorzystanie: " + usage + "%" + "\nAktywnych rdzeni " + cores);
        coolingSystem(temperature);
    }

    public void coolingSystem(double temperature) {
        if (temperature >= 67)
            System.out.println("Ze wzgledu na wysoka temperature wlaczony zostal system chlodzenia\n");
        else
            System.out.println("System chlodzenia nie jest wlaczony ze wzgledu na optymalna temperature\n");
    }

    public void update(double temperature, int frequency, int usage, int cores){
        this.temperature = temperature;
        this.frequency = frequency;
        this.usage = usage;
        this.cores = cores;
        display();
    }

}
