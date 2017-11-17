package com.fredericboisguerin.insa;

import java.util.*;

public class Interface {

    static Scanner sc = new Scanner(System.in);
    static String cmd;
    static ContactsManager contactsManager = new ContactsManager();

    public static void main(String [] args){
        while (true) {
            System.out.println(">");
            cmd=sc.next();
            if (cmd.equals("add")) {
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

            } else if (cmd.equals("print")) {
                contactsManager.printAllContacts();
            } else if (cmd.equals("search")) {
                System.out.println("Entrez le nom du contact recherche");
                String name= sc.next();
                contactsManager.searchContactByName(name);
            } else if (cmd.equals("quit")) { break;

            } else {System.out.println("Cmd not found");}

        }
    }
}
