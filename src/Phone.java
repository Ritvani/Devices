public class Phone extends Device{

    public void makeCall(){
        value = value - 5;
        System.out.println("Battery remaining: " + value);
        if (value < 10){
            System.out.println("Battery critical");
        }
    }

    public void playGame(){
        value = value - 20;
        System.out.println("Battery remaining: " +value);
        if (value < 10){
            System.out.println("Battery critical");
        }
    }

    public void charge(){
        value = value + 50;
        System.out.println("Battery remaining: " +value);
    }


}
