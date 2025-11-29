public class Performer {

    private Person performer;

    public Performer(Person performer){
        this.performer = performer;
    }
    public Person getPerformer(){
        return performer;
    }
    //toString
    public String toString(){
        return performer.toString();
    }
}
