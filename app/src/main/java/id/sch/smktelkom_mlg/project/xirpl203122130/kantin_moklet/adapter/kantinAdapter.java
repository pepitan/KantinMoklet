package id.sch.smktelkom_mlg.project.xirpl203122130.kantin_moklet.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl203122130.kantin_moklet.R;
import id.sch.smktelkom_mlg.project.xirpl203122130.kantin_moklet.model.kantin;

/**
 * Created by WildanZ on 20/11/2016.
 */
public class kantinAdapter extends RecyclerView.Adapter<kantinAdapter.ViewHolder> {

    ArrayList<kantin> kantinList;

    public kantinAdapter(ArrayList<kantin> kantinList) {
        this.kantinList = kantinList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        kantin kantin = kantinList.get(position);
        holder.tvJudul.setText(kantin.judul);
        holder.tvDeskripsi.setText(kantin.deskripsi);
        holder.ivFoto.setImageDrawable(kantin.foto);
    }

    @Override
    public int getItemCount() {
        if(kantinList != null)
            return kantinList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivFoto;
        TextView tvJudul;
        TextView tvDeskripsi;

        public ViewHolder(View itemView) {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsi);
        }
    }
}
