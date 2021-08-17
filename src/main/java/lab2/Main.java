package lab2;

public class Main {

    public static void main(String[] args) {
        ResourceProvider resourceProvider = new ResourceProvider();

        resourceProvider.setBonus(10);
        resourceProvider.setDebt(10);
        resourceProvider.setName("Evgenii");
        resourceProvider.setSalary(1000);

        Client client = resourceProvider.makeClient();

        System.out.println(client.toString());
    }
}
