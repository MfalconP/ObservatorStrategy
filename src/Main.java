import Observable.*;
import Observer.*;

public class Main {
    public static void main(String[] args) {
        Processor proc = new Processor();

        Info info = new Info(proc);
        Analize analiza = new Analize(proc);

        System.out.println("__________________________________________________");
        System.out.println("Symulacja 1:\n");
        proc.setParametrs(56, 2600,15,2);
        System.out.println("__________________________________________________");

        System.out.println("Symulacja 2:\n");
        proc.setParametrs(99, 4600,100,1);
        System.out.println("__________________________________________________");
    }
}
