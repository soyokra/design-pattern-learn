package com.soyokra.learn.aasingleton.eg02;

import java.util.concurrent.atomic.AtomicLong;

// 双重检测
public class IdGenerator {
    private AtomicLong id = new AtomicLong (0);

    private static IdGenerator instance;

    private IdGenerator() {}

    public static synchronized IdGenerator getInstance() {
        if (instance == null) {
            instance = new IdGenerator();
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }

    public static void main(String[] args) {
        IdGenerator idGenerator = IdGenerator.getInstance();
        System.out.println(idGenerator.getId());
    }
}
