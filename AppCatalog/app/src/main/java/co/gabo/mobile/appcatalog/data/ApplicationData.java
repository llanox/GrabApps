package co.gabo.mobile.appcatalog.data;

import java.util.HashMap;
import java.util.List;

import co.gabo.mobile.appcatalog.model.Application;
import co.gabo.mobile.appcatalog.model.Category;

/**
 * Created by juangabrielgutierrez on 4/13/16.
 */
public interface ApplicationData {
    List<Application> findAll();


    Application findbyId(String string);
    
    List<Category> findAllCategories();
}
