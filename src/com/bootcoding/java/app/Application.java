package com.bootcoding.java.app;

import com.bootcoding.java.model.Customer;

public class Application {
    public static void main(String[] args) {
        Customer kalyani =new Customer();
        kalyani.setName("kalyani");
        kalyani.setCity("Nagpur");
        kalyani.setState("Maharashtra");
        kalyani.setDeliveryAddress("Lal darwaja tandapeth");
        kalyani.print();
        Customer Ram =new Customer();
        Ram.setName("Ram");
        Ram.setCity("pune");
        Ram.setState("Maharashtra");
        Ram.setDeliveryAddress("Lal darwaja tandapeth");
        Ram.print();
        Customer shyam =new Customer();
        shyam.setName("shyam");
        shyam.setCity("Nagpur");
        shyam.setState("Maharashtra");
        shyam.setDeliveryAddress("Lal darwaja tandapeth");
        shyam.print();
        Customer ramesh =new Customer();
        ramesh.setName("ramesh");
        ramesh.setCity("Nagpur");
        ramesh.setState("Maharashtra");
        ramesh.setDeliveryAddress("Lal darwaja tandapeth");
        ramesh.print();


    }
}
