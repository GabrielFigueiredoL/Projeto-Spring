package com.gabrielfigueiredo.springcourse.config;

import com.gabrielfigueiredo.springcourse.entities.Order;
import com.gabrielfigueiredo.springcourse.entities.User;
import com.gabrielfigueiredo.springcourse.entities.enums.OrderStatus;
import com.gabrielfigueiredo.springcourse.repositories.OrderRepository;
import com.gabrielfigueiredo.springcourse.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "fulano", "fulano@email.com", "988888888", "123456");
        User user2 = new User(null, "beltrano", "beltrano@email.com", "977777777", "123456");

        Order order1 = new Order(null, user1, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.CANCELED);
        Order order2 = new Order(null, user2, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.PAID);
        Order order3 = new Order(null, user1, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.SHIPPED);
        userRepository.saveAll(Arrays.asList(user1, user2));
        orderRepository.saveAll(Arrays.asList(order1, order2, order3));
    }


}
