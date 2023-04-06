package com.kyobo.whatshouldieat.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class CounterController {

    private final Integer serverNumber;

    public CounterController(@Value("${server-number}") final int serverNumber) {
        this.serverNumber = serverNumber;
    }

    private int count = 0;

    @GetMapping
    public ResponseEntity<Map<String,Integer>> count() {
        count++;
        Map<String,Integer> data = new HashMap<>();

        log.info("ServerNumber = " + serverNumber);
        log.info("VisitingCount = " + count);

        data.put("ServerNumber", serverNumber);
        data.put("VisitingCount" ,count);
        return ResponseEntity.ok(data);
    }

}
