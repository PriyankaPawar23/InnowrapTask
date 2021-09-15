package com.example.innowraptask.adapter;

import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.innowraptask.R;
import com.example.innowraptask.model.item1;
import com.example.innowraptask.model.item2;
import com.example.innowraptask.model.item3;
import com.example.innowraptask.model.items;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final List<items> itemss;

    public Adapter(List<items> itemss) {
        this.itemss = itemss;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 0) {
            return new ViewHolder1(
                    LayoutInflater.from(parent.getContext()).inflate(
                            R.layout.item1, parent, false)
            );
        } else if (viewType == 1) {
            return new ViewHolder2(
                    LayoutInflater.from(parent.getContext()).inflate(
                            R.layout.item2, parent, false)
            );
        } else {
            return new ViewHolder3(
                    LayoutInflater.from(parent.getContext()).inflate(
                            R.layout.item3, parent, false)
            );
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == 0) {
            item1 item = (item1) itemss.get(position).getObj();
            ((ViewHolder1) holder).setData(item);
        } else if (getItemViewType(position) == 1) {
            item2 item = (item2) itemss.get(position).getObj();
            ((ViewHolder2) holder).setData(item);
        } else {
            item3 item = (item3) itemss.get(position).getObj();
            ((ViewHolder3) holder).setData(item);
        }
    }

    @Override
    public int getItemCount() {
        return itemss.size();
    }

    public int getItemViewType(int position) {
        return itemss.get(position).getType();
    }


    static class ViewHolder1 extends RecyclerView.ViewHolder {


        private final ImageView img;
        private final TextView text1;
        private final TextView text2;
        private final RelativeLayout color;

        public ViewHolder1(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.ImageTrip);
            text1 = itemView.findViewById(R.id.text1Item1);
            text2 = itemView.findViewById(R.id.text2Item1);
            color = itemView.findViewById(R.id.RelativeId);
        }

        void setData(item1 item) {
            img.setImageResource(item.getImage());
            text1.setText(item.getText1());
            text2.setText(item.getText2());
            color.setBackgroundColor(item.getColorBack());
            text2.setBackgroundColor(item.getColor());
        }
    }

    static class ViewHolder2 extends RecyclerView.ViewHolder {

        private final TextView text1;
        private final ImageView img;

        public ViewHolder2(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.text1Item2);
            img = itemView.findViewById(R.id.ImageItem2);

        }

        void setData(item2 item) {
            text1.setText(item.getText1());
            img.setImageResource(item.getImg());
            text1.setBackgroundColor(item.getColor());
        }
    }

    static class ViewHolder3 extends RecyclerView.ViewHolder {

        private final TextView text1, text2, text3;
        private final CardView colorB;

        public ViewHolder3(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.text1Item3);
            text2 = itemView.findViewById(R.id.text2Item3);
            text3 = itemView.findViewById(R.id.text3Item3);
            colorB = itemView.findViewById(R.id.CardViewId);
        }

        void setData(item3 item) {
            text1.setText(item.getText1());
            text2.setText(item.getText2());
            text1.setBackgroundColor(item.getColor());
            text3.setBackgroundColor(item.getColor());
            colorB.setCardBackgroundColor(item.getColorB());
        }
    }
}