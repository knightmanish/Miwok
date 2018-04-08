package com.example.android.learnmiwok;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int bgColorId;
    MediaPlayer mediaPlayer;

    private MediaPlayer.OnCompletionListener mOnCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayerReceived) {
            if (mediaPlayer != null) {
                mediaPlayer.release();
                mediaPlayer = null;
            }
        }
    };

    private static class ViewHolder {
        TextView miwokLang;
        TextView defaultLang;
        ImageView icon;
        int audioId;
    }

    @Override
    public String toString() {
        return "WordAdapter{" +
                "bgColorId=" + bgColorId +
                ", mediaPlayer=" + mediaPlayer +
                '}';
    }

    /**
     * Resource for parent is irrelevant here as we have defined out own getView, so we have passed 0.
     *
     * @param context
     * @param objects
     */

    /**
     * Resource for parent is irrelevant here as we have defined out own getView, so we have passed 0.
     *
     * @param context
     * @param objects
     * @param resId
     */
    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> objects, int resId) {
        super(context, 0, objects);
        this.bgColorId = resId;
    }

    /**
     * Provides a view for an AdapterView(ListView, GridView)
     *
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
            viewHolder.icon = (ImageView) convertView.findViewById(R.id.icon);
            LinearLayout textGroup = (LinearLayout) convertView.findViewById(R.id.textGroup);
            textGroup.setBackgroundResource(this.bgColorId);

            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ViewHolder viewHolder = (ViewHolder) view.getTag();

                    if (mediaPlayer != null) {
                        mediaPlayer.stop();
                        mediaPlayer.reset();
                        mediaPlayer.release();
                        mediaPlayer = null;
                    }
                    mediaPlayer = MediaPlayer.create(getContext(), viewHolder.audioId);
                    mediaPlayer.start();
                    mediaPlayer.setOnCompletionListener(mOnCompletionListener);
                }
            });
        } else {
            // View is being recycled, retrieve the viewHolder object from tag
            viewHolder = (ViewHolder) convertView.getTag();
        }
        // Populate the data from the data object via the viewHolder object
        // into the template view.
        viewHolder.miwokLang.setText(word.getMiwokLang());
        viewHolder.defaultLang.setText(word.getDefaultLang());
        viewHolder.audioId = word.getAudioId();

        // Cache the viewHolder object
        convertView.setTag(viewHolder);

        if (word.getReourceId() == -1) {
            viewHolder.icon.setVisibility(View.GONE);
        } else {
            viewHolder.icon.setImageResource(word.getReourceId());
        }
        // Return the completed view to render on screen
        return convertView;
    }
}
