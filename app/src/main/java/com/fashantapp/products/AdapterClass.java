package com.fashantapp.products;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fashantapp.R;

import java.util.List;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.ViewHolder> {

    List<Getter> list;
    Context context;
    Toolbar tb;

    public AdapterClass(List<Getter> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Getter g =  list.get(position);
        holder.t11.setText(g.getHeading());
        holder.t22.setText(g.getBanner());
        holder.t33.setText(g.getTime());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder

    {
        private TextView t11,t22,t33;


        public ViewHolder(View itemView) {
            super(itemView);

            t11 = (TextView)itemView.findViewById(R.id.t1);
            t22 = (TextView)itemView.findViewById(R.id.t2);
            t33 = (TextView)itemView.findViewById(R.id.t3);
        }
    }
}
