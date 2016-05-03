package co.llanox.grabapplication.model;

import java.io.Serializable;
import java.util.List;


public class Category implements Serializable {

    private String label;
    private List<Application> applications;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Application> getApplications() {
        return applications;
    }

    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }


}
