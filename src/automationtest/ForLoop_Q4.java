package automationtest;
/**
 * 4.1 Create the class with the name "ForLoop_Q4"
 * 4.2 Create a method with the name "printMyName" with no return type and two parameters with the type string and name "name" and int type name 'howManyTime'.
 * 4.3 Write the for loop into the "printMyName '' method which prints your name depending upon howManyTime's value.
 * 4.4	Create the main method
 * 4.5 Create the Object and call the 'printMyName' method into the main method.
 *
 * OutPut
 * howManyTime = 10 it will print your name 10 times
 * howManyTime = 15 it will print your name 15 times
 */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class ForLoop_Q4 {

    public void printMyName(String name, int howManyTime) {
        // action =  print name
        //  bigger action  = howManyTime * print a name
        // how many times do you want to repeat the action

        for (int i = 0; i < howManyTime; i++) {
            // small action
            System.out.println(name);
        }


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value");
        int number  = scanner.nextInt();

        ForLoop_Q4 q4 = new ForLoop_Q4();
        q4.printMyName("Nirali", number);
    }
}






