package com.fredericboisguerin.insa;

import java.util.ArrayList;
import java.util.List;

public class ContactsManager {

    List<Contact> contactList = new ArrayList<>();

    public void addContact(String name, String email, String phoneNumber) {
        Contact contact1 = new Contact(name,email,phoneNumber);
        contactList.add(contact1);
    }

    public void printAllContacts() {

        for (int i=0; i<contactList.size();i++){
            System.out.println(contactList.get(i).getName()+", "+contactList.get(i).getEmail()+", "+contactList.get(i).getPhoneNumber());
        }

    }

    public void searchContactByName(String name) {
        boolean found = false;
        int i=0;
        while (i<contactList.size()&&!found){
            if (contactList.get(i).getName().toLowerCase().contains(name)){
                found=true;
                System.out.println(contactList.get(i).getName()+", "+contactList.get(i).getEmail()+", "+contactList.get(i).getPhoneNumber());
            }
            i++;
        }
    }
}
