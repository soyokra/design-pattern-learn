package aasingleton.eg01;

import java.util.concurrent.atomic.AtomicLong;

// 饿汉式
public class IdGenerator {
    private AtomicLong id = new AtomicLong (0);

    private static final IdGenerator instance = new IdGenerator();

    private IdGenerator() {}

    public static IdGenerator getInstance() {
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
