package com.pack.mono;

import com.github.javafaker.Faker;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;

public class MonoFromFuture {

    public static void main(String[] args) throws InterruptedException {

        Mono.fromFuture(getName()).subscribe(i -> System.out.println(i));
        Thread.sleep(1000);

    }

    private static CompletableFuture<String> getName() {

        return CompletableFuture.supplyAsync(() -> Faker.instance().name().fullName());
    }
}
