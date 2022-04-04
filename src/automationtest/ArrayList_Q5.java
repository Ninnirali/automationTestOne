package automationtest;

import java.util.ArrayList;

/**
 * 5static int .1 Create the class with the name "ArrayList_Q5"
 * 5.2	Create the main method
 * 5.3 Declare the string type ArrayList and add the values "Scrum", "Java", "Jira", "Selenium", "Cucumber", "Postman", “Rest Assured”
 * 5.4 Print the list using a forEach loop.
 *
 * OutPut
 * Scrum
 * Java
 * Jira
 * Selenium
 * Cucumber
 * Postman
 * Rest Assured
 */
public class ArrayList_Q5 {
    public static void main(String[] args) {
        ArrayList <String> softwareList = new ArrayList<>();
        softwareList.add("Scrum");
        softwareList.add("Java");
        softwareList.add("Jira");
        softwareList.add("Selenium");
        softwareList.add("Cucumber");
        softwareList.add("Postman");
        softwareList.add("Rest Assured");


        for (String singleItem : softwareList) {
            System.out.println(singleItem);
        }


    }


}
