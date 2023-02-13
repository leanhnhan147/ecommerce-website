package vn.iostar.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a = 1;
        int b = 2;
        int c = tinhTong(a,b);
        // System.out.println("Tổng a + b = " + c);

        Log.d("tag", "Tổng a + b = " + c);

//        int d = a - b;
//        System.out.println("Hiệu của a - b = " + d);

    }

    private int tinhTong(int a, int b){
        return a + b;
    }

}