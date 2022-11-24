package com.amitb.a23a_10357_l05.Utils;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;
import android.widget.Toast;

public class SignalGenerator {

    private static SignalGenerator sg = null;
    private Context context;
    private static Vibrator v;


    private SignalGenerator(Context context){
        this.context = context;
    }

    public static SignalGenerator getInstance(){
        return sg;
    }

    public static void init(Context context) {
        if (sg == null){
            sg = new SignalGenerator(context);
            v = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        }
    }

    private void toast(String str) {
        Toast.makeText(context,str,Toast.LENGTH_SHORT).show();
    }

    public void vibrate(){

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            Log.d("tag","Hello");
            v.vibrate(VibrationEffect.createOneShot(500,VibrationEffect.DEFAULT_AMPLITUDE));
        }else{
            v.vibrate(500);
        }
    }
}
