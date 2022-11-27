package Observer;

import Observable.Observable;

public class Analize  implements Observer{
    private double temperature;
    private int frequency;
    private int usage;
    private int cores;
    private Observable processor;

    public Analize(Observable processor){
        this.processor = processor;
        this.processor.registerObserver(this);
    }

    public void update(double temperature, int frequency, int usage, int cores) {
        if (temperature <= 98 && frequency <= 4000 && usage <= 93 && cores <= 5)
            System.out.println("Wszystkie parametry sa normalnie");
        else{
            if (temperature > 98)
                System.out.println("Zbyt wysoka temperatura procesora (>98 C), moze to doprowadzić do jego awarii");
            if (frequency > 4000)
                System.out.println("Zbyt wysoka czestotliwosc procesora (>4000 MHz), jezeli nie wykonujesz skomplikowanych programow, masz awarie procesora");
            if (usage > 93)
                System.out.println("Zbyt wysoki procent wykorzystania (>93%), albo wykonujesz za duzo programow, albo masz awarie procesora");
            if (cores > 5)
                System.out.println("Aktywnych rdzeni masz wiecej niz 5, sprawdz, czy procesor jest w porzadku ");
        }
    }
}
