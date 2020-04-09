package com.mkyong.core;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXBExampleObj {
    public static void main(String[] args) {

        try {

            File file = new File("C:\\JAXBexmp\\file.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
            System.out.println(customer.getName());
            System.out.println(customer.getAge());
            System.out.println(customer.getDept());

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}