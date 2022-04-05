package com.example.toast;

public class CallBackActivity {

    interface MyCallBackClass {
        void callBackRetrun();
    }

    MyCallBackClass myCallBackClass;

    void setMyCallBackClass(MyCallBackClass myCallBackClass) {
        this.myCallBackClass = myCallBackClass;
    }

    void doSomething() {
        myCallBackClass.callBackRetrun();
    }
}
