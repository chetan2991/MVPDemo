package example.chetan.com.mvpdemo.View;

import android.content.Intent;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import example.chetan.com.mvpdemo.Model.LoginApi;
import example.chetan.com.mvpdemo.Presenter.LoginActionsInterface;
import example.chetan.com.mvpdemo.Presenter.LoginPresenter;
import example.chetan.com.mvpdemo.R;

public class MainActivity extends AppCompatActivity implements LoginActionsInterface
{

    Button mLoginButton;
    EditText mUsernameEditText;
    EditText mPasswordEditText;
    LoginPresenter mLoginPresenter;
    LoginApi mLoginApi;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLoginButton = ( Button )findViewById( R.id.loginButton );
        mUsernameEditText = ( EditText )findViewById( R.id.usernameEditText );
        mPasswordEditText  = ( EditText )findViewById( R.id.passwordEditText );
        mLoginApi = new LoginApi();
        mLoginPresenter = new LoginPresenter(this, mLoginApi );
        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                mLoginPresenter.performLogin();
            }
        });
    }

    @Override
    public String getUsername()
    {
        return mUsernameEditText.getText().toString();
    }

    @Override
    public String getPassword() {
        return mPasswordEditText.getText().toString();
    }

    @Override
    public void showUsernameEmptyError(@StringRes int resId ) {
        mUsernameEditText.setError(getString(resId));
    }

    @Override
    public void showPasswordEmptyError(@StringRes int regId) {
        mPasswordEditText.setError( getString(regId) );
    }

    @Override
    public void onLoginSucess()
    {
        Intent intent  = new Intent( MainActivity.this,WelcomeUserActivity.class );
        startActivity( intent );
    }

    @Override
    public void onLoginFail( @StringRes int regId )
    {
        Toast.makeText( getApplicationContext(), ""+getString( regId ), Toast.LENGTH_LONG ).show();
    }
}
