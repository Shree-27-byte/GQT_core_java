package constructor;

class Brain {
    double weight;
    double Iq;

    public Brain(double weight, double iq) {
        this.weight = weight;
        this.Iq = iq;
    }

    public double getWeight() {
        return weight;
    }

    public double getIq() {
        return Iq;
    }
}

class Heart {
    double Weight;
    int valves;

    public Heart(double weight, int valves) {
        this.Weight = weight;
        this.valves = valves;
    }

    public double getWeight() {
        return Weight;
    }

    public int getValves() {
        return valves;
    }
}

class Human {
    Brain b = new Brain(45, 50.1);
    Heart h = new Heart(30, 4);
}

class Book {
    String name;
    int Cost;

    public Book(String name, int cost) {
        this.name = name;
        this.Cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return Cost;
    }
}

class MobileD {
    String name;
    float version;

    public MobileD(String name, float version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public float getVersion() {
        return version;
    }
}

class Student extends Human {
    void hasBook(Book bk) {
        System.out.println(bk.getName());
        System.out.println(bk.getCost());
    }

    void hasMobileD(MobileD m) {
        System.out.println(m.getName());
        System.out.println(m.getVersion());
    }
}

public class HasA_IsA_relationship2 {
    public static void main(String[] args) {
        Student s = new Student();
        Book bk = new Book("The Adventure Life", 130);
        MobileD m = new MobileD("POCO", 15f);

        // IS-A relationship (Student is a Human)
        System.out.println(s.b.getWeight());
        System.out.println(s.b.getIq());
        System.out.println("-----------");

        // HAS-A relationship
        s.hasBook(bk);
        s.hasMobileD(m);
    }
}
