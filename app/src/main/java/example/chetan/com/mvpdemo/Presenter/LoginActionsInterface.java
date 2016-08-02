package example.chetan.com.mvpdemo.Presenter;

import android.support.annotation.StringRes;

/**
 * Created by sachin on 2/8/16.
 */
public interface LoginActionsInterface
{
    public String getUsername();
    public String getPassword();
    public void showUsernameEmptyError(@StringRes int regId);
    public void showPasswordEmptyError(@StringRes int regId);
    public void onLoginSucess();
    public void onLoginFail( @StringRes int regId );
}
