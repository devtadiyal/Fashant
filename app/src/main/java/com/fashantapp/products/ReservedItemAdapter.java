package com.fashantapp.products;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.fashantapp.R;

import java.util.List;

public class ReservedItemAdapter extends RecyclerView.Adapter<ReservedItemAdapter.ViewHolder> {

    List<ReservedItemGetter> list;
    Context context;
    Toolbar tb;
    Button checkstatus1;

    public ReservedItemAdapter(List<ReservedItemGetter> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.reserveditemlist,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        ReservedItemGetter g =  list.get(position);
        holder.t11.setText(g.getHeading());
        holder.t22.setText(g.getBanner());
        holder.t33.setText(g.getSize());
        holder.t44.setText(g.getColor());
        holder.t55.setText(g.getQuantity());
        holder.t66.setText(g.getTag());
        holder.v11.setImageResource(g.getImg());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder

    {
        private TextView t11,t22,t33,t44,t55,t66;
private ImageView v11;

        public ViewHolder(View itemView) {
            super(itemView);

            t11 = (TextView)itemView.findViewById(R.id.t1);
            t22 = (TextView)itemView.findViewById(R.id.t2);
            t33 = (TextView)itemView.findViewById(R.id.t3);
            t44 = (TextView)itemView.findViewById(R.id.t4);
            t55 = (TextView)itemView.findViewById(R.id.t5);
            t66 = (TextView)itemView.findViewById(R.id.t6);
            v11 = (ImageView)itemView.findViewById(R.id.icon);
            checkstatus1= (Button) itemView.findViewById(R.id.checkstatus);

            checkstatus1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(context,CheckStatusActivity.class);
                    context.startActivity(i);
                }
            });
        }


    }
}
