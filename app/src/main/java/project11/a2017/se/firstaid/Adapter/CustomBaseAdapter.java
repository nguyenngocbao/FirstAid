package project11.a2017.se.firstaid.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import project11.a2017.se.firstaid.Model.Lession;
import project11.a2017.se.firstaid.R;

/**
 * Created by MinhChuong on 25/04/2017.
 */

public class CustomBaseAdapter extends BaseAdapter{
    Context context;
    int layout;
    List<Lession> lessionList;

    public CustomBaseAdapter(Context context, int layout, List<Lession> lessionList) {
        this.context = context;
        this.layout = layout;
        this.lessionList = lessionList;
    }

    @Override
    public int getCount() {
        return lessionList.size();
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
        convertView = inflater.inflate(layout,parent,false);
        ImageView lessionIcon = (ImageView) convertView.findViewById(R.id.imageview);
        TextView lessionName = (TextView) convertView.findViewById(R.id.lessionName);
        TextView lessionNumb = (TextView) convertView.findViewById(R.id.lessionContent);

        lessionIcon.setImageResource(lessionList.get(position).getIcon());
        lessionName.setText("Ten bai hoc : " + lessionList.get(position).getLessionName().toString());
        lessionNumb.setText("Bai: " + lessionList.get(position).getId().toString());
        return convertView;
     }
}
