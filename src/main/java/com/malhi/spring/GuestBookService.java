package com.malhi.spring;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class GuestBookService {
    List<Guest> guests = new ArrayList<>();

    public boolean addguest(Guest guest){
        log.info("Adding guest : {} to the guest book",guest.getFirstName());
        return guests.add(guest);
    }

    public boolean delete(Integer id){
        log.info("Delete guest : {} to the guest book",id);
        return guests.removeIf(guest -> guest.getId()==id);
    }

    public void printGuest(){
        System.out.println(guests);
    }

}

