package com.pavangite.service;

import com.pavangite.enitity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    // creating fake records for contacts
    // you can get that records from database also using JPA repository layer
    List<Contact> contacts = List.of(
      new Contact(1L,"sagar@gmail","Sagar",11L),
      new Contact(2L,"Suraj@gmail","Suraj",11L),
      new Contact(3L,"Sandip@gmail","Sandip",12L),
      new Contact(4L,"Sumya@gmail","Sumya",13L),
      new Contact(5L,"Manas@gmail","Manas",13L),
      new Contact(6L,"Nikhil@gmail","Nikhil",13L),
      new Contact(7L,"Mayur@gmail","Mayur",14L),
      new Contact(8L,"Mahesh@gmail","Mahesh",14L)
    );
    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return contacts.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
