package com.fashantapp.products;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.fashantapp.R;
import java.util.ArrayList;
import java.util.List;

public class ReservedItemActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    Toolbar tb;
    public static String company_name,tag_line,quantity,color,size,cloth_type;
    String aa,bb,cc,dd,ee,ff;
    int gg;
private Button checkstatus1;
    public static String[] osNameList = {
            "SHIRT",
            "T-SHIRT",
            "JACKET",
            "SHOES",
            "DENIM",
            "PANTS",
            "SPORTS",
            "FORMAL",
            "ACCESSORIES",
    };



    private RecyclerView.Adapter adapter;
    List<Integer> l6 = new ArrayList<>();
    private List<ReservedItemGetter> list =  new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserved_item);


       //
            recyclerView = (RecyclerView) findViewById(R.id.rc);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(this,
                recyclerView, new ItemClickListener() {
            @Override
            public void onClick(View view, final int position) {
                //Values are passing to activity & to fragment as well

                int image_name = l6.get(position);
                 company_name = ((TextView) recyclerView.findViewHolderForAdapterPosition(position).itemView.findViewById(R.id.t1)).getText().toString();
                 cloth_type = ((TextView) recyclerView.findViewHolderForAdapterPosition(position).itemView.findViewById(R.id.t2)).getText().toString();
                 size = ((TextView) recyclerView.findViewHolderForAdapterPosition(position).itemView.findViewById(R.id.t3)).getText().toString();
                 color = ((TextView) recyclerView.findViewHolderForAdapterPosition(position).itemView.findViewById(R.id.t4)).getText().toString();
                 quantity = ((TextView) recyclerView.findViewHolderForAdapterPosition(position).itemView.findViewById(R.id.t5)).getText().toString();
                 tag_line = ((TextView) recyclerView.findViewHolderForAdapterPosition(position).itemView.findViewById(R.id.t6)).getText().toString();

                System.out.println("IMAGE NAME "+image_name);
                System.out.println("COMPANY NAME "+company_name);
                System.out.println("COMPANY CLOTH TYPE "+cloth_type);
                System.out.println("COMPANY SIZE "+size);
                System.out.println("COMPANY COLOR "+color);
                System.out.println("COMPANY QUANTITY "+quantity);
                System.out.println("COMPANY TAG "+tag_line);



            }

            @Override
            public void onLongClick(View view, int position) {

            }

        }));

            tb = (Toolbar) findViewById(R.id.os_texts);
            tb.setTitle("        My Reserved items");
            tb.setTitleTextColor(Color.parseColor("#696969"));
            setSupportActionBar(tb);
            //  tb.setSubtitle("     Tadiyal");
            getSupportActionBar().setIcon(getDrawable(R.drawable.back));
        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });

        StringBuilder builder = new StringBuilder();
        for(String s : osNameList) {
            builder.append(s);
        }
        String str = builder.toString();

            // For HardCore value
            for(int i=0;i<=10;i++)
            {

            }
        List<String> l = new ArrayList<>();
            l.add("Burberry");
            l.add("Levi's");


        List<String> l1 = new ArrayList<>();
        l1.add("Check Cotton Shirt");
        l1.add("Men Navy Printed Casual");

        List<String> l2 = new ArrayList<>();
        l2.add("M");
        l2.add("L");

        List<String> l3 = new ArrayList<>();
        l3.add("Red");
        l3.add("Blue");

        List<String> l4 = new ArrayList<>();
        l4.add("1");
        l4.add("3");

        List<String> l5 = new ArrayList<>();
        l5.add("The Galleria at sowwah square");
        l5.add("The Galleria at sowwah square");


        l6.add(R.drawable.redshirt);
        l6.add(R.drawable.shirt);

        for (int k = 0; k < l.size(); k++) {
            aa = l.get(k);
            bb=l1.get(k);
            cc=l2.get(k);
            dd=l3.get(k);
            ee=l4.get(k);
            ff=l5.get(k);
            gg=l6.get(k);

            ReservedItemGetter listItem = new ReservedItemGetter(gg,aa,bb,"Size :          "+"("+cc+")","Color :       "+dd,"Quantity :     "+ee,"Reserving  "+ff);
            list.add(listItem);

        }

            adapter = new ReservedItemAdapter(list,this);
            recyclerView.setAdapter(adapter);
    }
    class RecyclerTouchListener implements RecyclerView.OnItemTouchListener {

        private ItemClickListener clicklistener;
        private GestureDetector gestureDetector;

        RecyclerTouchListener(Context context, final RecyclerView recycleView, final ItemClickListener clicklistener) {

            this.clicklistener = clicklistener;
            gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
                @Override
                public boolean onSingleTapUp(MotionEvent e) {
                    return true;
                }

                @Override
                public void onLongPress(MotionEvent e) {
                    View child = recycleView.findChildViewUnder(e.getX(), e.getY());
                    if (child != null && clicklistener != null) {
                        clicklistener.onLongClick(child, recycleView.getChildAdapterPosition(child));
                    }
                }
            });
        }

        @Override
        public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
            View child = rv.findChildViewUnder(e.getX(), e.getY());
            if (child != null && clicklistener != null && gestureDetector.onTouchEvent(e)) {
                clicklistener.onClick(child, rv.getChildAdapterPosition(child));
            }

            return false;
        }

        @Override
        public void onTouchEvent(RecyclerView rv, MotionEvent e) {

        }

        @Override
        public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

        }
    }


}