package syamsul.unsyiah.ac.id.listview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by syamsul kamal on 5/19/2016.
 */
public class CustomListViewAdapter extends ArrayAdapter<RowItem>{
    Context context;
    public CustomListViewAdapter(Context context, int resourceId, List<RowItem> items) {
        super(context, resourceId, items);
        this.context=context;
    }

    private class ViewHolder{
        ImageView imageView;
        TextView textName;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        RowItem rowItem = getItem(position);
        LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_view, null);
            holder = new ViewHolder();
            holder.imageView = (ImageView) convertView.findViewById(R.id.picture);
            holder.textName = (TextView) convertView.findViewById(R.id.name);
            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();

        holder.textName.setText(rowItem.getCountry());
        holder.imageView.setImageResource(rowItem.getImageId());

        return convertView;
    }
}
