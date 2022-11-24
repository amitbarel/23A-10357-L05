package com.amitb.a23a_10357_l05;

import android.app.Application;

import com.amitb.a23a_10357_l05.Utils.MySPv3;
import com.amitb.a23a_10357_l05.Utils.SignalGenerator;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MySPv3.init(this);
        SignalGenerator.init(this);
    }
}
