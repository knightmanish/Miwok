package com.example.android.learnmiwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private static class ViewHolder {
        TextView miwokLang;
        TextView defaultLang;
    }

    /**
     * Resource for parent is irrelevant here as we have defined out own getView, so we have passed 0.
     * @param context
     * @param objects
     */
    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> objects) {
        super(context, 0, objects);
    }

    /**
     * Provides a view for an AdapterView(ListView, GridView)
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Get the data item for this position
        Word word = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag
        if (convertView == null) {
            // If there's no view to re-use, inflate a brand new view for row
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.list_item, parent, false);
            viewHolder.miwokLang = (TextView) convertView.findViewById(R.id.miwokLang);
            viewHolder.defaultLang = (TextView) convertView.findViewById(R.id.defaultLang);
            // Cache the viewHolder object inside the fresh view
            convertView.setTag(viewHolder);
        } else {
            // View is being recycled, retrieve the viewHolder object from tag
            viewHolder = (ViewHolder) convertView.getTag();
        }
        // Populate the data from the data object via the viewHolder object
        // into the template view.
        viewHolder.miwokLang.setText(word.getMiwokLang());
        viewHolder.defaultLang.setText(word.getDefaultLang());
        // Return the completed view to render on screen
        return convertView;
    }
}
