import java.io.File;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.util.*;

class Animal implements Cloneable {
    protected int age;
    protected String name;

    protected void changeName(String newName) {
        name = newName;
    }

    Animal(int animalAge, String animalName) {
        age = animalAge;
        name = animalName;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
//        BigInteger hc = BigInteger.ZERO, step = BigInteger.ONE,
//                pw = new BigInteger((new Integer(name.length())).toString());
//        for (int i = 0; i < name.length(); i++) {
//            hc = hc.add((new BigInteger((new Integer((int)(name.charAt(i)))).toString())).multiply(step));
//            step = step.multiply(pw);
//        }
//        hc = hc.add((new BigInteger((new Integer((int)age).toString())).multiply(step)));
        return (int)((long)name.hashCode() + age) % Integer.MAX_VALUE;
    }

    public Animal clone() {
        return new Animal(age, name);
    }
}

class Monkey extends  Animal {
    protected int weight;

    Monkey(int monkeyAge, String monkeyName, int monkeyWeight) {
        super(monkeyAge, monkeyName);
        weight = monkeyWeight;
    }

    @Override
    public int hashCode() {
        return (int)((long)super.hashCode() + weight) % Integer.MAX_VALUE;
    }

    public Monkey clone() {
        return new Monkey(age, name, weight);
    }
}

class Human extends Monkey {
    protected String surname;

    Human(int humanAge, String humanName, int humanWeight, String humanSurname) {
        super(humanAge, humanName, humanWeight);
        surname = humanSurname;
    }

    public String getName() {
        return name + " " + surname;
    }

    @Override
    public int hashCode() {
        return (int)((long)super.hashCode() + surname.hashCode()) % Integer.MAX_VALUE;
    }

    public Human clone() {
        return new Human(age, name, weight, surname);
    }
}

class Task48b {
    public static void main(String[] args) throws java.io.FileNotFoundException {
        Scanner scan;
        File file = new File("input.txt");
        scan = new Scanner(file);
        Human human = new Human(18, "Boris", 75, "Kozhuhovskiy");
        System.out.println(human.toString());
        System.out.println(human.getName());
        System.out.println(human.hashCode());
        Human h2 = human.clone();
        h2.changeName("Igor");
        System.out.println(h2.toString());
    }
}
