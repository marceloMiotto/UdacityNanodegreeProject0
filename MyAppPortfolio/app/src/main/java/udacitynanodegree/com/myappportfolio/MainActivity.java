package udacitynanodegree.com.myappportfolio;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void showToast(Button btn){
        if (toast != null) {
            toast.cancel();
        }
        String msg    = String.format(getString(R.string.button_action_message),btn.getText().toString());
        toast = Toast.makeText(this,msg,Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    public void onClick(View v) {
        showToast((Button) v);
    }


}
