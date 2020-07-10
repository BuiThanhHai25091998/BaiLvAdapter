package onlai.dmt.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lwViewNho;
    ArrayList<Trai_cay> arrayTraicay;
    TraiCayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lwViewNho = (ListView) findViewById(R.id.lwViewNho);

        arrayTraicay = new ArrayList<>();
        arrayTraicay.add(new Trai_cay("Sầu Riêng","Sầu riêng miền tay",R.drawable.saurieng));
        arrayTraicay.add(new Trai_cay("Thanh Long","Thanh long Ở Long Thành",R.drawable.thanhlong));
        arrayTraicay.add(new Trai_cay("Mang Cut","Măng cụt ở miền tay",R.drawable.mangcut));
        arrayTraicay.add(new Trai_cay("Trái Soài","Tất cả 3 miền",R.drawable.soai));
        arrayTraicay.add(new Trai_cay("Trái Cam","Tất cả 3 miền",R.drawable.traicam));
        arrayTraicay.add(new Trai_cay("Sầu Riêng","Sầu riêng miền tay",R.drawable.saurieng));
        arrayTraicay.add(new Trai_cay("Thanh Long","Thanh long Ở Long Thành",R.drawable.thanhlong));
        arrayTraicay.add(new Trai_cay("Mang Cut","Măng cụt ở miền tay",R.drawable.mangcut));
        arrayTraicay.add(new Trai_cay("Trái Soài","Tất cả 3 miền",R.drawable.soai));
        arrayTraicay.add(new Trai_cay("Trái Cam","Tất cả 3 miền",R.drawable.traicam));

        adapter = new TraiCayAdapter(this,R.layout.activity_trai_cay,arrayTraicay);
        lwViewNho.setAdapter(adapter);

        lwViewNho.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"bạn đả chọn: " + arrayTraicay.get(position),Toast.LENGTH_LONG).show();
            }
        });

        lwViewNho.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                arrayTraicay.remove(position);
                adapter.notifyDataSetChanged();
                return false;
            }
        });
    }
}
