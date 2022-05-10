
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Motivation {

    public static void main(String[] args) {

        final Group groupA = new Group("Group_A");
        final Group groupB = new Group("Group_B");
        final Group groupC = new Group("Group_C");

        List<People> peoples = new ArrayList<>();

        peoples.add(new People("Goro", 80, groupB));
        peoples.add(new People("Nina", 66, groupC));
        peoples.add(new People("Flake", 35, groupA));
        peoples.add(new People("Aaron", 8, groupB));
        peoples.add(new People("Boomer", 5, groupC));
        peoples.add(new People("Goro", 50, groupB));

        printGroups1(peoples);
        System.out.println();
        printGroups2(peoples);
    }

    public static void printGroups1(List<People> people) {

        Set<Group> groups = new HashSet<>();

        for (People p : people) {
            if (p.getAge() > 65) {
                groups.add(p.getGroup());
            }
        }

        List<Group> sorted = new ArrayList<>(groups);

        Collections.sort(sorted, new Comparator<Group>() {
            
            public int compare(Group a, Group b) {
                return Integer.compare(a.getSize(), b.getSize());
            }
        });

        for (Group g : sorted) {
            System.out.println(g.getName());
        }
    }

    public static void printGroups2(List<People> people) {

        people.stream()
            .filter(p -> p.getAge() > 65)
            .map(p -> p.getGroup())
            .distinct()
            .sorted((a, b) -> Integer.compare(a.getSize(), b.getSize()))
            .map(g -> g.getName())
            .forEach(n -> System.out.println(n));
    }
}

class Group {

    private String name;
    private int size;

    public Group(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void add() {
        size++;
    }
}

class People {

    private int age;
    private Group group;
    private String name;

    public People(String name, int age, Group group) {
        this.age = age;
        this.group = group;
        this.name = name;
        group.add();
    }

    public int getAge() {
        return age;
    }

    public Group getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }
}

