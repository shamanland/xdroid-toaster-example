package com.shamanland.xdroid.example.mytoast;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import static xdroid.toaster.Toaster.toast;
import static xdroid.toaster.Toaster.toastLong;

public class MyActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    public void onButton1Click(View view) {
        toast("Simplest hard-coded toast");
    }

    public void onButton2Click(View view) {
        toast(R.string.simplest_toast);
    }

    public void onButton3Click(View view) {
        toastLong(R.string.this_is_long_toast);
    }

    public void onButton4Click(View view) {
        toast("Formatted toast: %s %d", this.getClass().getSimpleName(), this.hashCode());
    }

    public void onButton5Click(View view) {
        toast(R.string.formatted_toast, this.getClass().getSimpleName(), this.hashCode());
    }

    public void onButton6Click(View view) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                toast(R.string.toast_from_thread);
            }
        }).start();
    }
}
