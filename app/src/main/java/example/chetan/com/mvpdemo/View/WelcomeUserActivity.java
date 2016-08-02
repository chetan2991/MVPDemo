package example.chetan.com.mvpdemo.View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import example.chetan.com.mvpdemo.R;

/**
 * Created by sachin on 2/8/16.
 */
public class WelcomeUserActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.welcome_activity_layout);
    }
}
