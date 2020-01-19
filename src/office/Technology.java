package office;

public class Technology extends Employee {

    public int rating;

    public Technology() {
        super();
    }

    public Technology(String name) {
        super(name);
    }

    public Technology(String name, int id, String division) {
        super(name, id, division);
    }

    public Technology(String name, int id){
        super(name,id);
    }
    public Technology(String name, int id,int rating){
        super(name,id);
        this.rating=rating;
    }
    public int getRating() {
        return rating;
    }

}
