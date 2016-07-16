package ly.generalassemb.drewmahrt.shoppinglistwithdetailview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ShoppingSQLiteOpenHelper helper = ShoppingSQLiteOpenHelper.getInstance(DetailActivity.this);

        //get description and add to textview
        int id = getIntent().getIntExtra("id",-1);

        if(id >= 0){
            String description = helper.getDescriptionById(id);
            TextView textView = (TextView)findViewById(R.id.description_text);
            textView.setText(description);
        }
    }
}
