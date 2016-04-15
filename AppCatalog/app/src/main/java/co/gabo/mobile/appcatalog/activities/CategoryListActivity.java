package co.gabo.mobile.appcatalog.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;


import co.gabo.mobile.appcatalog.Constants;
import co.gabo.mobile.appcatalog.adapters.CategoryAdapter;
import co.gabo.mobile.appcatalog.data.ApplicationData;
import co.gabo.mobile.appcatalog.data.ApplicationDataImpl;
import co.gabo.mobile.appcatalog.fragments.ApplicationListFragment;
import co.gabo.mobile.appcatalog.R;
import co.gabo.mobile.appcatalog.model.Category;

import java.util.List;

/**
 * An activity representing a list of Applications. This activity
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

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getTitle());



        View recyclerView = findViewById(R.id.application_list);
        assert recyclerView != null;

        mApplicationData = new ApplicationDataImpl();
        setupRecyclerView((RecyclerView) recyclerView);

        if (findViewById(R.id.application_list_container) != null) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-w900dp).
            // If this view is present, then the
            // activity should be in two-pane mode.
            mTwoPane = true;
        }


    }

    private void setupRecyclerView(@NonNull RecyclerView recyclerView) {
        List<Category> items = mApplicationData.findAllCategories();
        recyclerView.setAdapter(new CategoryAdapter(items, this));
    }


    @Override
    public void onClick(View v) {


        if (mTwoPane) {

            Bundle arguments = new Bundle();
            arguments.putSerializable(Constants.CATEGORY_OBJECT_KEY,((Category)v.getTag()));
            ApplicationListFragment fragment = new ApplicationListFragment();
            fragment.setArguments(arguments);

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.application_list_container, fragment)
                    .commit();

        }else{

            Context context = v.getContext();
            Intent intent = new Intent(context, ApplicationListActivity.class);
            intent.putExtra(Constants.CATEGORY_OBJECT_KEY, ((Category) v.getTag()));

            context.startActivity(intent);


        }


    }
}
