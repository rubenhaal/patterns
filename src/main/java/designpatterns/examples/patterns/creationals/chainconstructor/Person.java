package designpatterns.examples.patterns.creationals.chainconstructor;

public class Person {
    public static final String DEFAULT_UNKNOWN = "unknown";
    public static final String DEFAULT_UNIDENTIFIED = "unidentified";
    public static final int DEFAULT_AGE = 0;
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public Person(String name, int age) {
        this(name, age, DEFAULT_UNKNOWN);
    }
    public Person(String name) {
        this(name, DEFAULT_AGE, DEFAULT_UNKNOWN);
    }

    public Person() {
        this(DEFAULT_UNIDENTIFIED, DEFAULT_AGE, DEFAULT_UNKNOWN);
    }
}
