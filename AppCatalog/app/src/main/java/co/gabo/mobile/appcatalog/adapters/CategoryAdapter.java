package co.gabo.mobile.appcatalog.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import co.gabo.mobile.appcatalog.R;
import co.gabo.mobile.appcatalog.model.Category;

/**
 * Created by juangabrielgutierrez on 4/14/16.
 */
public class CategoryAdapter extends  RecyclerView.Adapter<CategoryAdapter.ViewHolder>  {

    private List<Category> categories;



    private View.OnClickListener onClickListener;

    public CategoryAdapter(List<Category> categories) {
        this.categories = categories;
    }

    public CategoryAdapter(List<Category> categories, View.OnClickListener onClickListener) {
        this(categories);
        this.onClickListener = onClickListener;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Category category = categories.get(position);
        holder.mTitle.setText(category.getTitle());
        holder.mTitle.setTag(category);
        holder.mImageView.setTag(category);

        if(onClickListener==null){
            return;
        }

        holder.mTitle.setOnClickListener(onClickListener);
        holder.mImageView.setOnClickListener(onClickListener);



    }

    @Override
    public int getItemCount() {
        return categories.size();
    }


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
