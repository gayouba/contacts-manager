package com.fredericboisguerin.insa;

import java.util.*;

public class Interface {

    static Scanner sc = new Scanner(System.in);
    static String cmd = sc.toString();
    static ContactsManager contactsManager = new ContactsManager();

    public static void main(String [] args){
        while (true) {
            System.out.println(">");

            if (cmd == "add") {
                System.out.println("Entrez le contact sous le format suivant : nom email telephone");
                String name = sc.next();
                String email = sc.next();
                String phone = sc.next();

                try {
                    contactsManager.addContact(name, email, phone);
                } catch (InvalidContactNameException e1) {
                    System.out.println("Nom incorrect");
                } catch (InvalidEmailException e2) {
                    System.out.println("Email incorrect");
                }

            } else if (cmd == "print") {
                contactsManager.printAllContacts();
            } else if (cmd == "search") {
                String name= sc.next();
                contactsManager.searchContactByName(name);
            } else if (cmd == "quit") { break;

            } else {System.out.println("Cmd not found");}
            cmd=sc.next();
        }
    }
}
