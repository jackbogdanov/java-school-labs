package lab2;


import lombok.ToString;

@ToString
public class Client {
    private final int debt;
    private final int bonus;
    private final String name;
    private final int salary;

    public Client(ResourceProvider resourceProvider) {
        this.debt = resourceProvider.getDebt();
        this.bonus = resourceProvider.getBonus();
        this.name = resourceProvider.getName();
        this.salary = resourceProvider.getSalary();
    }
}