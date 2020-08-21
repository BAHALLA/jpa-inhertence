package main;

import entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
    /*
            SINGLE_TABLE Strategy
     */
//        Animal animal = new Animal();
//        animal.setName("animal");
//
//        Cat cat = new Cat();
//        cat.setName("cat");
//        cat.setColor("Black");
//
//        entityManager.persist(animal);
//        entityManager.persist(cat);
     /*
            JOINED Strategy
     */
//        Product product = new Product();
//        product.setName("product A");
//
//        Chocolate chocolate = new Chocolate();
//        chocolate.setName("chocolate");
//        chocolate.setNumberKal(100);
//
//        entityManager.persist(product);
//        entityManager.persist(chocolate);
    /*
            TABLE_PER_CLASS Strategy
     */
//        Employee employee = new Employee();
//        employee.setId(1L);
//        employee.setName("Taoufiq");
//
//        Manager manager = new Manager();
//        manager.setId(2L);
//        manager.setName("BAHALLA");
//        manager.setResponsibility("CEO");
//
//        entityManager.persist(employee);
//        entityManager.persist(manager);

     /*
            MappedSupperClass Strategy
     */
        Car car =new Car();
        car.setName("Range rover");
        car.setSpeed(300);
        car.setCarType("Sport");

        Bicycle bicycle =new Bicycle();
        bicycle.setName("B Bicycle");
        bicycle.setSpeed(100);
        bicycle.setBicycleType("Sport");

        entityManager.persist(car);
        entityManager.persist(bicycle);
        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
