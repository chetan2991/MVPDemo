package example.chetan.com.mvpdemo.Model;

/**
 * Created by sachin on 2/8/16.
 */
public class LoginApi
{
    private String mUsername = "vishal";
    private String mPassword = "orangeit";
    public boolean authenticateUser( String username, String password )
    {
         if( username.equals(mUsername) && password.equals( mPassword ))
         {
             return true;
         }
            return false;

    }

}
