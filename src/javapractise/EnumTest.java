package javapractise;

public class EnumTest {

    public enum AccountType {
        SAVINGS, SALARY, STUDENT, INSURANCE;
        /*
        internally
        class AccountType{
        public static final AccountType SALARY = new AccountType();
        }

        //Every enum constant represents an object of type enum.
         */

        //enum can contain constructor and it is executed separately for each enum constant at the time of enum class loading
        private AccountType() {
            System.out.println("Constructor called for : "+this.toString());
        }
    }

    AccountType accountType;

    public EnumTest(AccountType accountType) {
        this.accountType = accountType;
    }

    public  void chooseAccount() {
        switch (accountType){
            case SAVINGS:
                System.out.println("SAVINGS Account");
                break;
            case SALARY:
                System.out.println("SALARY Account");
                break;
            case STUDENT:
                System.out.println("STUDENT Account");
                break;
            default:
                System.out.println("INSURANCE Account");
        }
    }

    public static void main(String[] args) {
        //String str = "SALARY";
       // EnumTest enumTest = new EnumTest(AccountType.valueOf(str));
        //enumTest.chooseAccount();

        // AccountType accountType = AccountType.valueOf(str);

        //for (AccountType accountType : AccountType.values())//The values() method returns an array containing all the values of the enum.
        //    System.out.println(accountType);

        //System.out.println(AccountType.valueOf("STUDENT").ordinal());
        //valueOf() method returns the value of given constant enum.
        // ordinal() method returns the index of the enum value.

        AccountType accountType = AccountType.SALARY;

    }
}