package co.llanox.grabapplication.model;

import java.io.Serializable;

/**
 * Created by llanox on 4/20/16.
 */
public class Application implements Serializable {
    private String imageUrl;
    private String summary;
    private String name;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
