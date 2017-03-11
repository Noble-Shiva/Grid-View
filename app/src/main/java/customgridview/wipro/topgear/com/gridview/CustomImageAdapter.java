package customgridview.wipro.topgear.com.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;


public class CustomImageAdapter extends BaseAdapter {
    private Context mContext;

    // Keep all Images in array
    public Integer[] mPlayerArray = {
            R.drawable.ms_dhoni, R.drawable.virat_kohli,
            R.drawable.yuvraj_singh1, R.drawable.ajinkya_rahane_,
            R.drawable.ishant_sharma1, R.drawable.amit_mishra1,
            R.drawable.shikhar_dhawan, R.drawable.suresh_raina,
            R.drawable.lokesh_rahul1, R.drawable.rohit_sharma,
            R.drawable.shami_ahmed1, R.drawable.ravichandran_ashwin,
            R.drawable.ravindra_jadeja, R.drawable.cheteshwar_pujara1,
            R.drawable.umesh_yadav
    };

    // Constructor
    public CustomImageAdapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return mPlayerArray.length;
    }

    @Override
    public Object getItem(int position) {
        return mPlayerArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mPlayerArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(350, 350));
        return imageView;
    }

}