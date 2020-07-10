package onlai.dmt.com;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TraiCayAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Trai_cay> TraiCayList;

    public TraiCayAdapter(Context context, int layout, List<Trai_cay> traiCayList) {
        this.context = context;
        this.layout = layout;
        TraiCayList = traiCayList;
    }

    @Override
    public int getCount() {
        return TraiCayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(layout,null);

        //anh xạ view
        TextView textTrai = (TextView) convertView.findViewById(R.id.TenTrai);
        TextView textMoTa = (TextView) convertView.findViewById(R.id.MoTa);
        ImageView imgHinh = (ImageView) convertView.findViewById(R.id.HinhAnh);

        //gán Giá trị
        Trai_cay traicay = TraiCayList.get(position);
        textTrai.setText(traicay.getTen_Tri());
        textMoTa.setText(traicay.getMo_ta());
        imgHinh.setImageResource(traicay.getHinh_Trai());

        return convertView;
    }
}
