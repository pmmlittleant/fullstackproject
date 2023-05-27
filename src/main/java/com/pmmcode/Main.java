package com.pmmcode;

import com.pmmcode.customer.Customer;
import lombok.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.beans.PersistenceDelegate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
       SpringApplication.run(Main.class, args);
    }

    @Bean
    public Foo getFoo() {
        return new Foo("bar");
    }

    public record Foo(String name) {}

}
