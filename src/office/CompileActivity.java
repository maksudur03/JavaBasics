package office;



public class CompileActivity implements ClickListener {

    public static void main(String[] args) {


        CompileActivity compileActivity = new CompileActivity();
/*
        CTO cto = CTO.getCTO("Boss");
        CTO cto2=CTO.getCTO("boss2");
        System.out.println(cto.getName()+"  "+cto2.getName());
*/

        Button button = new Button();
        button.setClickListener(compileActivity);

        button.click();

        /*Developer d1=new Developer("Dipto",1,0);
        d1.algoCount(15);
        d1.problemCount(200);
        d1.problemSolvingSkills(20);
        System.out.println(d1.getRating());*/
    }

    @Override
    public void onClick() {
        System.out.println("In method: onClick");
    }
}
