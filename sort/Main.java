package Lesson16.sort;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Contact [] contacts=new Contact[100];
        int count=0;
        contacts[count++]=new Contact("Sanjar","123");
        contacts[count++]=new Contact("Erkin","123");
        contacts[count++]=new Contact("Omon","123");
        contacts[count++]=new Contact("Ali","123");

        Arrays.sort(contacts,0,count);
        System.out.println(Arrays.deepToString(contacts));

        List <Contact> contactList=new ArrayList<>();
        contactList.add(new Contact("Sanjar","123"));
        contactList.add(new Contact("Erkin","123"));
        contactList.add(new Contact("Ali","123"));
        Collections.sort(contactList);
      
        System.out.println(contactList);


    }
}
