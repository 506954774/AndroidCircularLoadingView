package qdong.com.custom_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import qdong.com.mylibrary.CircularLoadingView;


public class MainActivity extends AppCompatActivity {



    private CircularLoadingView mDashedCircularProgress;
    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDashedCircularProgress= (CircularLoadingView) findViewById(R.id.simple);
        mTextView= (TextView) findViewById(R.id.number);
        mDashedCircularProgress.setOnValueChangeListener(
                new CircularLoadingView.OnValueChangeListener() {
                    @Override
                    public void onValueChange(float value) {
                        mTextView.setText((int) value + "");
                    }
                });

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    mDashedCircularProgress.setValue(66);//没有动画的,直接设置
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    mDashedCircularProgress.setValue(0);//无动画,归零
                    mDashedCircularProgress.setValueWithAnimation(100,2000);//带动画
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
