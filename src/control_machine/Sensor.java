package control_machine;

public class Sensor {

    public String Sensor_name;
    private int value;
    private int max_value; //This value will not be in the real system, this is
    private int min_value;

    //Since we cannot read a real data from any Sensor, we generate a random value suitable for what kind of data the sensor reads.
    //So, to be able to test our aplication in a more reliable way, we have max and min values as in range of probabible values.
    public Sensor(int max_value, int min_value, String Sensor_name) {
        this.max_value = max_value;
        this.min_value = min_value;
        this.Sensor_name = Sensor_name;
    }

    public int read() {
        this.value = (int) (Math.random() * (max_value - min_value)) + min_value;
        return value;
    }
}
