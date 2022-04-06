package com.example.toast;

public class SubClass {
    public interface MyCallBack {
        void callbackReturn();
    }

    MyCallBack myCallBack;

    public void setMyCallBack(MyCallBack myCallBack) {
        this.myCallBack = myCallBack;
    }

    public void doSomething() {
        myCallBack.callbackReturn();
    }


}
