package syamsul.unsyiah.ac.id.listview;

/**
 * Created by syamsul kamal on 5/18/2016.
 */
public class RowItem {
    private int imageId;
    private String country;

    public RowItem(int imageId, String country){
        this.imageId=imageId;
        this.country=country;
    }


    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
