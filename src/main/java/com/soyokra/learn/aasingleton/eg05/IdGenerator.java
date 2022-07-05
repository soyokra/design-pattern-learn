package com.soyokra.learn.aasingleton.eg05;

import java.util.concurrent.atomic.AtomicLong;

// 枚举
public enum IdGenerator {
    INSTANCE;
    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }
}
