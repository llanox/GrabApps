package co.llanox.grabapplication.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import co.llanox.grabapplication.Constants;
import co.llanox.grabapplication.R;
import co.llanox.grabapplication.adapters.CategoryRecyclerViewAdapter;
import co.llanox.grabapplication.data.ApplicationData;
import co.llanox.grabapplication.data.ApplicationDataMockImpl;
import co.llanox.grabapplication.dummy.DummyContent;
import co.llanox.grabapplication.fragments.ApplicationListFragment;
import co.llanox.grabapplication.model.Category;

import java.util.List;

/**
 * An activity representing a list of Categories. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * lead to a {@link ApplicationListActivity} representing
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 */
public class CategoryListActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private boolean mTwoPane;
    private ApplicationData mApplicationData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_list);
        mApplicationData = new ApplicationDataMockImpl();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getTitle());


        View recyclerView = findViewById(R.id.category_list);
        assert recyclerView != null;
        setupRecyclerView((RecyclerView) recyclerView);

        if (findViewById(R.id.applications_category_container) != null) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-w900dp).
            // If this view is present, then the
            // activity should be in two-pane mode.
            mTwoPane = true;
        }
    }

    private void setupRecyclerView(@NonNull RecyclerView recyclerView) {
        List<Category> categories = mApplicationData.findCategories();
        recyclerView.setAdapter(new CategoryRecyclerViewAdapter(categories, this));
    }

    @Override
    public void onClick(View v) {

        Category category = (Category) v.getTag();

        if (mTwoPane) {
            Bundle arguments = new Bundle();
            arguments.putSerializable(Constants.CATEGORY_INSTANCE, category);
            ApplicationListFragment fragment = new ApplicationListFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.applications_category_container, fragment)
                    .commit();
        } else {

            Context context = v.getContext();
            Intent intent = new Intent(context, ApplicationListActivity.class);
            intent.putExtra(Constants.CATEGORY_INSTANCE, category);
            context.startActivity(intent);
        }
    }


}
