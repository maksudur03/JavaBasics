package javapractise;

public class Hello {
    private static final int PIE = 1212;

    public int getPIE() {
        return PIE;
    }

    public static void main(String[] args) {


        String s = "Tomal";
        System.out.println(s.hashCode());
        s += " Hello";
        System.out.println(s.hashCode());

        Long a = new Long(32323L);

        StringBuilder stringBuilder = new StringBuilder("Tomal");
        System.out.println(stringBuilder.hashCode());
        stringBuilder.append(" Hello");
        System.out.println(stringBuilder.hashCode());

        Hello hello = new Hello();


        if (1 == 1) {
            return;
        }
    }

}
