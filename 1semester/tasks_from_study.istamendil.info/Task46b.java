import java.io.File;
import java.net.HttpURLConnection;
import java.util.*;

class Monkey {
    protected int age, weight;
    protected String name;
    Monkey(int monkeyAge, int monkeyWeight, String monkeyName) {
        age = monkeyAge;
        name = monkeyName;
        weight = monkeyWeight;
    }
    public String getName() {
        return name;
    }
}

class Human extends Monkey {
    private String surname;
    Human(int humanAge, int humanWeight, String humanName, String humanSurname) {
        super(humanAge, humanWeight, humanName);
        surname = humanSurname;
    }
    public String getName() {
        return name + " " + surname;
    }
}

class Task46b {
    public static void main(String[] args) throws java.io.FileNotFoundException {
        Scanner scan;
        File file = new File("input.txt");
        scan = new Scanner(file);
        Human human = new Human(18, 75, "Boris", "Kozhuhovskiy");
        System.out.println(human.getName());
    }
}
