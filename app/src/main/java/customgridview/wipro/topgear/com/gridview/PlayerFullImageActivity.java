package customgridview.wipro.topgear.com.gridview;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class PlayerFullImageActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.players_full_image);

        // get intent data
        Intent i = getIntent();

        // Selected image id
        int position = i.getExtras().getInt("id");
        CustomImageAdapter imageAdapter = new CustomImageAdapter(this);

        ImageView imageView = (ImageView) findViewById(R.id.player_full_image_view);
        imageView.setImageResource(imageAdapter.mPlayerArray[position]);
    }

}
