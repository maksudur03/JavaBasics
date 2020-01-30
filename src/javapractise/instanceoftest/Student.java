package javapractise.instanceoftest;

public class Student {
    private String phoneNumber = "q77217272";

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        System.out.println("set phone number");
    }


    public void makePhoneCall() {
        excutePhoneCall(this.phoneNumber);
    }

    private void excutePhoneCall(String phoneNumber) {
        Runnable r = new Runnable() {
            public void run() {
                try {
                    System.out.println("thread start " + phoneNumber+" "+this);
                    Thread.sleep(2 * 1000);
                    System.out.println("thread end " + phoneNumber+" "+this);


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(r).start();
    }
}
