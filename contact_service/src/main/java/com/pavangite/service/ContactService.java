package com.pavangite.service;

import com.pavangite.enitity.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getContactsOfUser(Long userId);
}
