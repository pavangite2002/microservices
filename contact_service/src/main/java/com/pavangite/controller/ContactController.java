package com.pavangite.controller;

import com.pavangite.enitity.Contact;
import com.pavangite.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    private ContactService contactService;
    @GetMapping("/user/{userId}")
    public List<Contact> getContactsByUserId(@PathVariable Long userId) {
        return contactService.getContactsOfUser(userId);
    }

}
