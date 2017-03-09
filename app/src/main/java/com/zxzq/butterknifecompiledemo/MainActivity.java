package com.zxzq.butterknifecompiledemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Android Studio 使用ButterKnife步骤：
 * 1、project structure 添加依赖 或者 build.gradle手动添加依赖
 *      com.jakewharton:butterknife:8.5.1
 *      com.jakewharton:butterknife-compiler:8.5.1
 *      其他版本请自行百度依赖方法
 * 2、鼠标在布局（R.layout.activity_main）上右键generate中没有快捷方式的在
 *      设置->plugin中安装ButterKnife zelezny。
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Unbinder 对象用于解绑（官方推荐，不解绑无明显影响）
     * unbinder 对象从 ButterKnife.bind(this) 方法返回；
     */
    private Unbinder unbinder;

    /**
     * 绑定视图
     */
    @BindView(R.id.bt_1)
    Button bt1;
    @BindView(R.id.bt_2)
    Button bt2;
    @BindView(R.id.bt_3)
    Button bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);

        bt1.setText("自定义文本内容");
        //......
    }

    /**
     * butterKnife 点击事件
     */
    @OnClick({R.id.bt_1, R.id.bt_2, R.id.bt_3})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_1:


                break;
            case R.id.bt_2:


                break;
            case R.id.bt_3:


                break;
        }
    }

    /**
     * 在 onDestroy（） 中解绑
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        //视图销毁时解绑
        unbinder.unbind();
    }
}
