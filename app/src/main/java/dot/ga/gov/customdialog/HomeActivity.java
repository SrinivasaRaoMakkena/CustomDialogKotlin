package dot.ga.gov.customdialog;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class HomeActivity extends AppCompatActivity implements DataAdapter.RecyclerViewItemClickListener {
    Button clickButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        clickButton = (Button) findViewById(R.id.button);
    }

    CustomListViewDialog customDialog;

    public void clickHere(View view) {
        final String[] items = {"Apple Apple Apple ", "Banana", "Orange", "Grapes", "Apple", "Banana", "Orange", "Grapes", "Apple", "Banana", "Orange", "Grapes", "Apple", "Banana", "Orange", "Grapes", "Apple", "Banana", "Orange", "Grapes"};
//        final String[] items = { "Apple", "Banana", "Orange", "Grapes", "Apple", "Banana", "Orange", "Grapes"};

        DataAdapter dataAdapter = new DataAdapter(items, this);
        customDialog = new CustomListViewDialog(HomeActivity.this, dataAdapter);

        customDialog.show();
        customDialog.setCanceledOnTouchOutside(false);


    }

    @Override
    public void clickOnItem(String data) {
        clickButton.setText(data);

        if (customDialog != null){
            customDialog.dismiss();
        }
    }
}
