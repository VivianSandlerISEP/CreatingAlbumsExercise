public class Performer {

    private Person person;

    public Performer(Person person){
        this.person = person;
    }
    public Person getPerson(){
        return person;
    }
    //toString
    public String toString(){
        return person.toString();
    }
}
