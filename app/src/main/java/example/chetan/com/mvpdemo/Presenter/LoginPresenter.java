package example.chetan.com.mvpdemo.Presenter;

import example.chetan.com.mvpdemo.Model.LoginApi;
import example.chetan.com.mvpdemo.R;

/**
 * Created by sachin on 2/8/16.
 */
public class LoginPresenter
{
    private LoginActionsInterface mLoginActionInterface;
    private LoginApi mLoginApi;
    public LoginPresenter( LoginActionsInterface loginActionsInterface, LoginApi loginApi )
    {

        mLoginActionInterface = loginActionsInterface;
        mLoginApi = loginApi;
    }
    public void performLogin()
    {
        if(mLoginActionInterface.getUsername().isEmpty())
        {
            mLoginActionInterface.showUsernameEmptyError(R.string.user_name_empty_error_message );
        }
        else if( mLoginActionInterface.getPassword().isEmpty() )
        {
            mLoginActionInterface.showPasswordEmptyError( R.string.password_empty_error_message);
        }

        else if( mLoginApi.authenticateUser( mLoginActionInterface.getUsername(), mLoginActionInterface.getPassword() ))
        {
            mLoginActionInterface.onLoginSucess();
        }
        else
        {
            mLoginActionInterface.onLoginFail(R.string.invalide_login_error_message);
        }
    }


}
