package com.mkyong.core;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JAXBExample {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setId(4100);
        customer.setName("papun");
        customer.setDept("ECE");
        customer.setAge(21);

        try {

            //File file = new File("C:\\JAXBexmp\\file.xml");

            File file = new File(
                    JAXBExample.class.getClassLoader().getResource("file.xml").getFile()
            );

            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(customer, file);
            jaxbMarshaller.marshal(customer, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
