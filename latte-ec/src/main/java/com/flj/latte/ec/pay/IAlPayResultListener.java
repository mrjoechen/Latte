package com.flj.latte.ec.pay;

/**
 * Created by chenqiao
 */

public interface IAlPayResultListener {

    void onPaySuccess();

    void onPaying();

    void onPayFail();

    void onPayCancel();

    void onPayConnectError();
}
