package control_machine;

import java.util.Scanner;

public class system_main {
    public static void main(String[] args) {

        //int temp_environment= (int)(Math.random()*40 + 5); //Since we cannot read a data from any sensor, we will generate a random environment temperature
        //int humi_environment = (int)(Math.random()*100); //Since we cannot read a data from any sensor, we will generate a random soil humidity.
        // Then, we read those datas by our Sensor class' read() function.
        Temperature temp = new Temperature();
        Humidity humidity = new Humidity();
        welcome(temp, humidity);


    }

    public static void welcome(Temperature temp, Humidity humidity) { //This method works when the system is waken up from sleep mode.
        Scanner scanner = new Scanner(System.in);
        // if(user.press()){ //Later, don't forget to change static press method
        System.out.println("******************************************************");

        System.out.println("Your system initialized.");

        System.out.println("******************************************************");

        System.out.println("Welcome to Plant Control System, current values are:");

        System.out.println("******************************************************");

        System.out.println("Current environment temperature is : " + temp.currentValue()); //Print out value
        System.out.println("Current soil humidity is : " + humidity.currentValue()); //Print out value

        System.out.println("******************************************************");

        System.out.println("If you want to set a max or min value, press 'Enter' button to get into system. ");

        /*while (true){
            System.out.println("You can choose mode whatever you want: ");
            String key = scanner.nextLine();
        }*/
        if (user.press()) {
            System.out.println("---------------------------------------------------");
            System.out.println("You can set your values for temperature");
            System.out.println("---------------------------------------------------");
            temp.set();


            System.out.println("---------------------------------------------------");
            System.out.println("You can set your values for humidity");
            System.out.println("---------------------------------------------------");
            humidity.set();

        } else {
            System.out.println("---------------------------------------------------");
            System.out.println("You did not want to change system default values .");
            System.out.println("---------------------------------------------------");
        }
        System.out.println("******************************************************");
        System.out.println("LED state for temperature: ");
        temp.warningLight();
        System.out.println("******************************************************");
        System.out.println("LED state for humidity: ");
        humidity.warningLight();
        System.out.println("******************************************************");



        //  }
        /* else{
           System.out.println("You need to start your system.");
        } */


    }
}
