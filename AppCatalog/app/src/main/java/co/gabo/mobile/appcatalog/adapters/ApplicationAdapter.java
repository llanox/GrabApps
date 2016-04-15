package co.gabo.mobile.appcatalog.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import co.gabo.mobile.appcatalog.R;

/**
 * Created by juangabrielgutierrez on 4/15/16.
 */
public class ApplicationAdapter {









    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTitle;
        public ImageView mImageView;

        public ViewHolder(View itemView) {
            super(itemView);
            mTitle = (TextView) itemView.findViewById(R.id.header_title);
            mImageView =(ImageView)itemView.findViewById(R.id.btn_expand_toggle);
        }
    }
}
