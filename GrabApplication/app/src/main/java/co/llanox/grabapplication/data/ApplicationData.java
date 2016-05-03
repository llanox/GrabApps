package co.llanox.grabapplication.data;

import java.util.List;

import co.llanox.grabapplication.model.Category;

/**
 * Created by llanox on 4/20/16.
 */
public interface ApplicationData {
    List<Category> findCategories();
}
