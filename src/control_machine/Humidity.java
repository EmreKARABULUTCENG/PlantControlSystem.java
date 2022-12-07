package control_machine;

public class Humidity extends feature {


    Sensor humidity_sensor = new Sensor(70, 60, "humidity_sensor");

    LED hum_led = new LED();

    public Humidity() {
        //These are default possible values for this feature.
        this.set_max = 60;
        this.set_min = 30;
        //********************
    }

    public void set() {
        System.out.print("Please, enter the minimum humidity value that you want to be noticed: ");
        set_min = sc.nextInt();
        System.out.println("Your minimum humidity value: " + set_min);
        System.out.println();

        System.out.print("Please, enter the maximum humidity value that you want to be noticed: ");
        set_max = sc.nextInt();
        System.out.println("Your maximum humidity value: " + set_max);
    }

    public int currentValue() {
        return humidity_sensor.read();
    }

    public void warningLight() {
        int humWorth = humidity_sensor.read();
        if (set_max < humWorth) {
            hum_led.turnON("Red");

        } else if (set_min > humWorth) {
            hum_led.turnON("Blue");

        } else {
            hum_led.turnOFF();

        }

    }


}
