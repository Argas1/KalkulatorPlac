public class Employee {
    private String name;
    private String surname;
    private double reward;

    public Employee(String name, String surname, double reward) {
        this.name = name;
        this.surname = surname;
        this.reward = reward;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }
}
