package com.example.finalwork.repositories;

import com.example.finalwork.models.Order;
import com.example.finalwork.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> findByPerson(Person person);

    List<Order> findByPersonOrderByDateTimeAsc(Person person);

    List<Order> findByPersonOrderByDateTimeDesc(Person person);

    List<Order> findAllByOrderByDateTimeAsc();

    List<Order> findAllByOrderByDateTimeDesc();

    List<Order> findAllByNumber(String number);

    List<Order> findByNumberEndingWithIgnoreCaseOrderByDateTimeDesc(String number);

    List<Order> findByNumberEndingWith(String number);

    List<Order> findByNumberEndingWithIgnoreCase(String number);
}
