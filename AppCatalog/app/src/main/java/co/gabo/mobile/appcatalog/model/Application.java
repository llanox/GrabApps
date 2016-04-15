package co.gabo.mobile.appcatalog.model;

import java.io.Serializable;

/**
 * Created by juangabrielgutierrez on 4/11/16.
 */
public class Application implements Serializable {



    private String id;
    private String title;
    private String summary;
    private String imageUrl;
    private String price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }






}
