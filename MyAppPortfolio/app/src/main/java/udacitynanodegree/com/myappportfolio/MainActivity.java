package udacitynanodegree.com.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void showToast(String msg){
        Toast.makeText(this,"This button will launch my "+msg+" app!",Toast.LENGTH_SHORT).show();
    }

    public void getPortfolioApp(View v){

        switch (v.getId()){

            case R.id.button_popular_movies_project:
                showToast(getString(R.string.popular_movies_project));
                break;

            case R.id.button_stock_hawk_project:
                showToast(getString(R.string.stock_hawk_project));
                break;

            case R.id.button_build_it_bigger_project:
                showToast(getString(R.string.build_it_bigger_project));
                break;

            case R.id.button_make_app_material_project:
                showToast(getString(R.string.make_app_material_project));
                break;

            case R.id.button_go_ubiquitous_project:
                showToast(getString(R.string.go_ubiquitous_project));
                break;

            case R.id.button_capstone_project:
                showToast(getString(R.string.capstone_project));
                break;

        }

    }
}
