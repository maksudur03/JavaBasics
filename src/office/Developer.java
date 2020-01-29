package office;

public class Developer extends Technology implements ACM, Skills, Comparable<Developer> {

    public Developer(String name, int id) {
        super(name, id);
    }

    public Developer(String name, int id, int rating) {
        super(name, id, rating);
    }

//methods implemented from interface ACM


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void problemSolvingCapabilities(int point) {
        String rat = rating + "point/10";
        rating = rating + point / 10;
    }

    @Override
    public void problemCount(int count) {
        rating += count / 100;
    }

    @Override
    public void algoCount(int count) {
        rating += count / 5;
    }

    @Override
    public void CommunicationSkills(int remark) {
        rating += remark / 10;

    }

    @Override
    public void PresentationSkills(int remark) {
        rating += remark / 10;

    }
/*
    @Override
    public int compareTo(Developer o) {
        return this.getName().compareTo(o.getName());
    }
 */


    @Override
    public int compareTo(Developer o) {
        System.out.println(o.getName() + " comparing with " + this.getName() + " result " + (this.rating - o.rating));
        //return this.rating - o.rating;
        return o.rating-this.rating;
    }
}

