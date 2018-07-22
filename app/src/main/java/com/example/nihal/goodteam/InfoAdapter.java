package com.example.nihal.goodteam;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.ViewHolder> {

    List<Info> list;

    public InfoAdapter(List<Info> list) {
        this.list = list;
    }

  /*  @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view,parent,false);
        RecyclerView.ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder ;
    }*/

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View  view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
             Info info = list.get(position);
             holder.Name.setText(info.getName());
             holder.Id.setText(info.getId());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView Name,Id;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Name = (TextView) itemView.findViewById(R.id.t1);
            Id = (TextView) itemView.findViewById(R.id.t2);


        }
    }
}
