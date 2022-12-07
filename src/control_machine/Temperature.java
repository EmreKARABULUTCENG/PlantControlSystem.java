package control_machine;

public class Temperature extends feature {


    Sensor temp_sensor = new Sensor(40, 25, "temp_sensor");

    LED temp_led = new LED();

    public Temperature() {
        //These are default possible values for this feature.
        this.set_max = 30;
        this.set_min = 20;
        //********************
    }


    public void set() {
        System.out.print("Please, enter the minimum temperature value that you want to be noticed: ");
        set_min = sc.nextInt();
        System.out.println("Your minimum temperature value: " + set_min);

        System.out.println();

        System.out.print("Please, enter the maximum temperature value that you want to be noticed: ");
        set_max = sc.nextInt();
        System.out.println("Your maximum temperature value: " + set_max);
    }

    public int currentValue() {
        return temp_sensor.read();
    }

    public void warningLight() {
        int tempWorth = temp_sensor.read();
        if (set_max < tempWorth) {
            temp_led.turnON("Red");
        } else if (set_min > tempWorth) {
            temp_led.turnON("Blue");
        } else {
            temp_led.turnOFF();
        }

    }

}
