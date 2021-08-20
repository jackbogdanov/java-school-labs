package lab7.radios;

public class BasicRadio implements Radio {
    @Override
    public void radioPlay() {
        System.out.println("radio started playing");
    }

    @Override
    public void radioStop() {
        System.out.println("radio stopped");
    }
}
