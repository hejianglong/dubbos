package com.dubbos.consumer;

import com.dubbos.api.Notify;

public class NotifyImpl implements Notify {

    @Override
    public void onReturn(String msg) {
        System.out.println("onReturn:" + msg);
    }

    @Override
    public void onThrow(Throwable ex, String msg) {
        System.out.println("onError:" + msg);
    }
}
