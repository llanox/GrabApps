package co.llanox.grabapplication.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import co.llanox.grabapplication.R;
import co.llanox.grabapplication.dummy.DummyContent;
import co.llanox.grabapplication.model.Category;

/**
 * Created by llanox on 4/20/16.
 */
public class CategoryRecyclerViewAdapter extends RecyclerView.Adapter<CategoryRecyclerViewAdapter.ViewHolder> {

    public List<Category> mItems;
    public View.OnClickListener mOnClickListener;


    public CategoryRecyclerViewAdapter(List<Category> mItems, View.OnClickListener listener) {
        this.mItems = mItems;
        this.mOnClickListener = listener;
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.category_list_content, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mItem = mItems.get(position);
        holder.mContentView.setText( holder.mItem.getLabel());
        holder.mView.setOnClickListener(mOnClickListener);
        holder.mView.setTag(holder.mItem);
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final TextView mContentView;
        public Category mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView = (TextView) view.findViewById(R.id.id);
            mContentView = (TextView) view.findViewById(R.id.content);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}
