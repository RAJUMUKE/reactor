package com.pack.mono;

import com.github.javafaker.Faker;
import reactor.core.publisher.Mono;

public class MonoEmptyOrError {

    public static void main(String[] args) {

         userRepo(1).subscribe(item -> System.out.println(item),err -> System.out.println(err.getMessage()), () -> System.out.println("Complete"));

    }

    public static Mono<String> userRepo(int userId){

        if(userId == 1){
            return Mono.just(Faker.instance().name().fullName());
        }else if(userId == 2){
            return Mono.empty();
        }else{
            return Mono.error(new RuntimeException("userId not found "));
        }
    }
}
