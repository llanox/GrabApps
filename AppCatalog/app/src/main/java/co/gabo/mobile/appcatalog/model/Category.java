package co.gabo.mobile.appcatalog.model;

import com.bignerdranch.expandablerecyclerview.Model.ParentListItem;

import java.io.Serializable;
import java.util.List;

/**
 * Created by juangabrielgutierrez on 4/14/16.
 */
public class Category  implements Serializable {

    private String title;
    private List<Application> apps;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Application> getApps() {
        return apps;
    }

    public void setApps(List<Application> apps) {
        this.apps = apps;
    }


}
