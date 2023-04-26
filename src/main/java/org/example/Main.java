package org.example;

import org.example.dao.ProductDAO;

public class Main {
    public static void main(String[] args) {

        System.out.println(new ProductDAO().findByName("paquito"));
    }
}