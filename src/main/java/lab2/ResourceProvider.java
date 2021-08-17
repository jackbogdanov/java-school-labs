package lab2;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ResourceProvider {

    private int debt;
    private int bonus;
    private String name;
    private int salary;

    public Client makeClient() {
        return new Client(this);
    }

}

