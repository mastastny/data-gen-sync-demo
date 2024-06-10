package io.patriot_framework.data_gen_sync_demo;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

import java.util.Scanner;

/**
 * Hello world!
 *
 */



public class App 
{
    public static void main( String[] args )
    {
        JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));

        Scanner scanner = new Scanner(System.in);

        boolean loop = true;
        while (loop) {
            System.out.println("Enter 1, 2, or 3 to execute a demo. Write 'exit' to terminate the program:");
            String input = scanner.nextLine();
            try {
                switch (input.strip()) {
                    case "1":
                        junit.run(Demo1.class);
                        break;
                    case "2":
                        junit.run(Demo2.class);
                        break;
                    case "3":
                        junit.run(Demo3.class);
                        break;
                    case "exit":
                        loop = false;
                        System.out.println("Good bye.");
                        break;
                    default:
                        System.out.println("Invalid input, try it again.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        scanner.close();
    }
}
