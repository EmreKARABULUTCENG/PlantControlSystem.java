package control_machine;

public class LED {
    private String isON;


    public LED() {
        //These are default possible values for this feature.
        this.isON = "Off";

    }

    public void turnON(String color) {

        this.isON = color;

        if (color == "Red") {
            System.out.println("Warning led is shining red.");
        } else if (color == "Blue") {
            System.out.println("Warning led is shining blue.");
        }

    }

    public void turnOFF() {

        this.isON = "Off";
        System.out.println("Warning led is not shining.");

    }


}
