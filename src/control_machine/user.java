package control_machine;

import java.util.Scanner;

public class user {

    private static int Start;

    public user() {

    }

    public static boolean press() {
        Scanner scanner = new Scanner(System.in);
        Start = scanner.nextInt();
        if (Start == 1) {
            return true;
        } else {
            return false;
        }
    }

}
