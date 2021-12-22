package com.example.demo;

public class MainClass {
    public static void main(String[] args){
        BaseUserDao dao = new BaseUserDao();
        dao.createUser("diocane","diocanePassword");
        System.out.println(dao.retrievePassword("diocane"));
    }
}