package com.fashantapp.products;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;

import com.fashantapp.R;

import java.util.ArrayList;
import java.util.List;

public class NotificationActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    Toolbar tb;
    private RecyclerView.Adapter adapter;
    private List<Getter> list =  new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        recyclerView = (RecyclerView) findViewById(R.id.rc);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        tb = (Toolbar) findViewById(R.id.os_texts);


        tb.setTitle("           NOTIFICATION");
        tb.setTitleTextColor(Color.parseColor("#696969"));
        setSupportActionBar(tb);
        //  tb.setSubtitle("     Tadiyal");
        getSupportActionBar().setIcon(getDrawable(R.drawable.bell));

        // For HardCore value
        for(int i=0;i<=10;i++)
        {
            Getter listItem = new Getter("Albert Sose","like your post","12m");
            list.add(listItem);
        }
        adapter = new AdapterClass(list,this);
        recyclerView.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mii = getMenuInflater();
        mii.inflate(R.menu.settings,menu);

        /*MenuItem mi = menu.findItem(R.id.search1);
        SearchView sv = (SearchView) mi.getActionView();

        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

          //      arrayadapter.getFilter().filter(newText);
                return false;
            }
        });
*/
        return true;

    }
}
