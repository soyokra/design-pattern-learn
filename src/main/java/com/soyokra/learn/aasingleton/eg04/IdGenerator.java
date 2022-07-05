package com.soyokra.learn.aasingleton.eg04;

import java.util.concurrent.atomic.AtomicLong;

// 静态内部类
public class IdGenerator {
    private AtomicLong id = new AtomicLong (0);

    private static IdGenerator instance;

    private IdGenerator() {}

    private static class SingletonHolder {
        private static final IdGenerator instance = new IdGenerator();
    }

    public static IdGenerator getInstance() {
        return SingletonHolder.instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }

    public static void main(String[] args) {
        IdGenerator idGenerator = IdGenerator.getInstance();
        System.out.println(idGenerator.getId());
    }
}
