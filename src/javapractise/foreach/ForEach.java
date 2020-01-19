package javapractise.foreach;

public class ForEach {
    public static void main(String[] args) {
        int[] array={12,24,36,48};
        for (int element:array){
            System.out.print(element);
        }
    }
}
//forEach cannot modify the array
//doesn't have any index number
//only iterates over single steps
//can't process two decision making statements at once