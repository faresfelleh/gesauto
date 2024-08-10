package com.pfe.gesauto.model;

import lombok.Data;

@Data
public class Client {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;

}
