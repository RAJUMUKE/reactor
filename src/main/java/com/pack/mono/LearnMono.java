package com.pack.mono;

import reactor.core.publisher.Mono;

public class LearnMono {

    public static void main(String[] args) {
        //publisher
        Mono<Integer> mono = Mono.just(1);
        Mono<Integer> onError = Mono.just(1).map(item -> item/0);
//        mono.subscribe(i -> System.out.println("Received: "+i));

        //subscriber
        //OnComplete behaviour
        mono.subscribe(item -> System.out.println(item),err -> System.out.println(err.getMessage()), () -> System.out.println("Complete"));
        //OnError behaviour
        onError.subscribe(item -> System.out.println(item),err -> System.out.println(err.getMessage()), () -> System.out.println("Complete"));

    }
}
