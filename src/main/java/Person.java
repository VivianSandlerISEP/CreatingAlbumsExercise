public class Person {

    //variables
    private String name;
    private String stageName;
    private int age;

    //constructor
    public Person(String name, String stageName, int age) {
        this.name = name;
        this.stageName = stageName;
        this.age = age;
    }

    // Getter methods
    public String getName(){return this.name;}  //ou return just name
    public String getStageName(){return this.stageName;}
    public int getAge(){return this.age;}

    //public setter
    public void setAge(int age) {this.age = age;}

    //override for readability output
    public String toString() {
        return stageName + " (" + name + ")";
    }
}

