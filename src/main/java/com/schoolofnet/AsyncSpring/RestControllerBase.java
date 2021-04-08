package com.schoolofnet.AsyncSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RestController
@RequestMapping("/async")
public class RestControllerBase {

    @Autowired
    private AsyncTask task;

    public RestControllerBase(AsyncTask task) {
        this.task = task;
    }

    @GetMapping
    public String sayHello() throws ExecutionException, InterruptedException {
        Future<String> resultMethod = task.asyncReturnMethod();
        if (resultMethod.isDone()) {
            return resultMethod.get();
        }
        return "Not working..";
    }
}
