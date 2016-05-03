package co.llanox.grabapplication.data;

import java.util.ArrayList;
import java.util.List;

import co.llanox.grabapplication.model.Application;
import co.llanox.grabapplication.model.Category;

/**
 * Created by llanox on 4/20/16.
 */
public class ApplicationDataMockImpl  implements ApplicationData{
    @Override
    public List<Category> findCategories() {

        List<Category> categories = new ArrayList<>();
        List<Application> apps = new ArrayList<>();

        Category category = new Category();
        category.setLabel("cat1");
        categories.add(category);


        Application app = new Application();
        app.setName("app1");
        app.setImageUrl("http://is4.mzstatic.com/image/thumb/Purple69/v4/c8/32/a3/c832a31d-9671-56f3-b2f5-98ba3c909e51/mzl.fixbjtrh.png/53x53bb-85.png");
        app.setSummary("Play against other people online! Can you become the biggest snake?\\n\\nWatch out - if your head touches another snake, you will explode and then it's game over. But if you get other snakes to run into YOU, then THEY will explode and you can eat their remains!\\n\\nUnlike other games, you have a fighting chance even if you're tiny! If you're a nimble navigator, you can swerve in front of a much larger snake to defeat them - no matter what size you are!\\n\\nThe biggest snake of the day gets to set a victory message that the ENTIRE WORLD will see!");
        apps.add(app);
        category.setApplications(apps);

        category = new Category();
        category.setLabel("cat2");
        categories.add(category);

        category = new Category();
        category.setLabel("cat3");
        categories.add(category);

        category = new Category();
        category.setLabel("cat4");
        categories.add(category);

        category = new Category();
        category.setLabel("cat5");
        categories.add(category);

        category = new Category();
        category.setLabel("cat6");
        categories.add(category);

        category = new Category();
        category.setLabel("cat7");
        categories.add(category);



        return categories;
    }
}
