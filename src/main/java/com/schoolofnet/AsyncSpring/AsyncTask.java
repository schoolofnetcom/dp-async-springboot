package com.schoolofnet.AsyncSpring;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

@Service
public class AsyncTask {

    @Async
    public void asyncMethod() {
        System.out.println("Async Method working..." + Thread.currentThread().getName());
    }

    @Async
    public Future<String> asyncReturnMethod() {
        return new AsyncResult<String>("Async method working...");
    }
}
