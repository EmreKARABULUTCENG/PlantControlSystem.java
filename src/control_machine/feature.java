package control_machine;

import java.util.Scanner;

public abstract class feature {
    Scanner sc = new Scanner(System.in);
    protected int set_max;
    protected int set_min;

    public void set() {
        System.out.print("Please, enter the minimum value that you want to be noticed: ");
        set_min = sc.nextInt();

        System.out.println();

        System.out.print("Please, enter the maximum value that you want to be noticed: ");
        set_max = sc.nextInt();
    }

    public void print() {
        System.out.println(set_max);
        System.out.println(set_min);
    }
}
