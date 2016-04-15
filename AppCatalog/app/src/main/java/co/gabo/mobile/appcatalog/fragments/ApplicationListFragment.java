package co.gabo.mobile.appcatalog.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;

import java.util.List;

import co.gabo.mobile.appcatalog.Constants;
import co.gabo.mobile.appcatalog.R;
import co.gabo.mobile.appcatalog.activities.ApplicationListActivity;
import co.gabo.mobile.appcatalog.activities.CategoryListActivity;
import co.gabo.mobile.appcatalog.data.ApplicationData;
import co.gabo.mobile.appcatalog.model.Application;
import co.gabo.mobile.appcatalog.model.Category;

/**
 * A fragment representing a single Application detail screen.
 * This fragment is either contained in a {@link CategoryListActivity}
 * in two-pane mode (on tablets) or a {@link ApplicationListActivity}
 * on handsets.
 */
public class ApplicationListFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private List<Application> mItems;
    private ApplicationData mApplicationData;
    private AbsListView mListItems;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ApplicationListFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(Constants.CATEGORY_OBJECT_KEY)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItems = ((Category) getArguments().getSerializable(Constants.CATEGORY_OBJECT_KEY)).getApps();

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(this.getString(R.string.title_application_list));
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.application_list_detail, container, false);
        mListItems = (AbsListView) rootView.findViewById(R.id.list);

        ArrayAdapter<Application> itemsAdapter =
                new ArrayAdapter<>(this.getActivity(), android.R.layout.simple_list_item_1, mItems);

        mListItems.setAdapter(itemsAdapter);

        return rootView;
    }
}
