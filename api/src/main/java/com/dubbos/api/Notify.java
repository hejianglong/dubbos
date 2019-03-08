package com.dubbos.api;

public interface Notify {

    void onReturn(String msg);

    void onThrow(Throwable ex, String msg);
}
