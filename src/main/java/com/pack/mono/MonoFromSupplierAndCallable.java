package com.pack.mono;

import com.github.javafaker.Faker;
import reactor.core.publisher.Mono;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class MonoFromSupplierAndCallable {

    public static void main(String[] args) {

        Supplier<String> stringSupplier = () -> getName();
        Mono.fromSupplier(stringSupplier).subscribe(item -> System.out.println(item));

        Callable<String> stringCallable = () -> getName();
        Mono.fromCallable(stringCallable).subscribe(item -> System.out.println(item));
    }

    private static String getName() {

        System.out.println("Generating name: ");
        return Faker.instance().name().fullName();
    }
}
