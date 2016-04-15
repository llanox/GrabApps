package co.gabo.mobile.appcatalog.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import co.gabo.mobile.appcatalog.model.Application;
import co.gabo.mobile.appcatalog.model.Category;

/**
 * Created by juangabrielgutierrez on 4/13/16.
 */
public class ApplicationDataImpl implements ApplicationData {
    @Override
    public List<Application> findAll() {

        List<Application> apps = new ArrayList<>();

        Application application = new Application();
        application.setTitle("app1");
        application.setImageUrl("http://is4.mzstatic.com/image/thumb/Purple69/v4/c8/32/a3/c832a31d-9671-56f3-b2f5-98ba3c909e51/mzl.fixbjtrh.png/53x53bb-85.png");
        application.setSummary("summmary summmary ");

        apps.add(application);

        application = new Application();
        application.setTitle("app2");
        application.setImageUrl("http://is4.mzstatic.com/image/thumb/Purple69/v4/c8/32/a3/c832a31d-9671-56f3-b2f5-98ba3c909e51/mzl.fixbjtrh.png/53x53bb-85.png");
        application.setSummary("summmary summmary ");
        apps.add(application);


        application = new Application();

        application.setTitle("app3");
        application.setImageUrl("http://is4.mzstatic.com/image/thumb/Purple69/v4/c8/32/a3/c832a31d-9671-56f3-b2f5-98ba3c909e51/mzl.fixbjtrh.png/53x53bb-85.png");
        application.setSummary("summmary summmary ");
        apps.add(application);

        application = new Application();
        application.setTitle("app4");
        application.setImageUrl("http://is4.mzstatic.com/image/thumb/Purple69/v4/c8/32/a3/c832a31d-9671-56f3-b2f5-98ba3c909e51/mzl.fixbjtrh.png/53x53bb-85.png");
        application.setSummary("summmary summmary ");
        apps.add(application);

        application = new Application();
        application.setTitle("app5");
        application.setImageUrl("http://is4.mzstatic.com/image/thumb/Purple69/v4/c8/32/a3/c832a31d-9671-56f3-b2f5-98ba3c909e51/mzl.fixbjtrh.png/53x53bb-85.png");
        application.setSummary("summmary summmary ");
        apps.add(application);


        return apps;
    }

    @Override
    public Application findbyId(String string) {
        Application application = new Application();
        application.setTitle("app1");
        application.setImageUrl("http://is4.mzstatic.com/image/thumb/Purple69/v4/c8/32/a3/c832a31d-9671-56f3-b2f5-98ba3c909e51/mzl.fixbjtrh.png/53x53bb-85.png");
        application.setSummary("summmary summmary ");

        return application;
    }

    @Override
    public List<Category> findAllCategories() {

        List<Category> categories = new ArrayList<>();

        Category category = new Category();
        category.setTitle("Games");
        category.setApps(findAll());

        categories.add(category);

        category = new Category();
        category.setTitle("Social Network");
        category.setApps(findAll());
        categories.add(category);

        category = new Category();
        category.setTitle("Food");
        category.setApps(findAll());
        categories.add(category);

        category = new Category();
        category.setTitle("Entertainment");
        category.setApps(findAll());
        categories.add(category);

        category = new Category();
        category.setTitle("Health");
        category.setApps(findAll());
        categories.add(category);

        return categories;
    }
}
