package office;


import java.util.ArrayList;
import java.util.Collections;

public class CompileActivity {

    public static void main(String[] args) {

        ArrayList<Developer> developers = new ArrayList<>();
        developers.add(new Developer("Munif",417,8 ));
        developers.add(new Developer("Dipto",416,7));
        developers.add(new Developer("nahiyan",418,9));
        developers.add(new Developer("tasmia",415));

        RatingComparison ratingComparison = new RatingComparison();
        IdComparison idComparison = new IdComparison();

        Collections.sort(developers,idComparison);

        for(Developer developer : developers){
            System.out.println(developer.getName()+" "+developer.getId());
        }

        // System.out.print("Y"+"O");
        // System.out.print('L'+'O');//WIDENING PRIMITIVE CONVERSION
        //System.out.print('L');
        //System.out.println('O');

/*
        CompileActivity compileActivity = new CompileActivity();
        CTO cto = CTO.getCTO("Boss");
        CTO cto2=CTO.getCTO("boss2");
        System.out.println(cto.getName()+"  "+cto2.getName());
  */
/*
        Button button = new Button();
        button.setClickListener(compileActivity);

        button.click();
*/
        /*Developer d1=new Developer("Dipto",1,0);
        d1.algoCount(15);
        d1.problemCount(200);
        d1.problemSolvingSkills(20);
        System.out.println(d1.getRating());*/
    }

}
