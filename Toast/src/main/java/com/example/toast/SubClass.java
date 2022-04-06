package com.example.toast;

public class SubClass {
    interface MyCallBack {
        void callbackReturn();
    }

    MyCallBack myCallBack;

    void setMyCallBack(MyCallBack myCallBack) {
        this.myCallBack = myCallBack;
    }

    void doSomething() {
        myCallBack.callbackReturn();
    }


}
