package lab1;

public class Main {

    public static void main(String[] args) {
        SuperIntegerList superIntegerList = new SuperIntegerListImpl();

        superIntegerList.add(2);
        superIntegerList.add(3);
        superIntegerList.add(3);
        superIntegerList.add(2);
        superIntegerList.add(3);

        superIntegerList.printAll();
        superIntegerList.removeByValue(3);
        superIntegerList.removeByValue(3);
        superIntegerList.add(2);
        superIntegerList.add(3);
        superIntegerList.add(3);
        superIntegerList.add(2);
        superIntegerList.add(3);
        superIntegerList.removeByIndex(6);
        superIntegerList.printAll();

        System.out.println(superIntegerList.get(3));

        try {
            superIntegerList.removeByIndex(10);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERR");
        }
    }
}
