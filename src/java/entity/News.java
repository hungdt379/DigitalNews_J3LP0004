/*
* News.java
*
* All Right Reserved
* Copyright (c) 2020 FPT University
*/
package entity;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * News.<br>
 * 
 *<pre>
 * Class mô tả đối tượng News Class này sẽ tiến hành các xử lí dưới đây
 *
 * . GetId. . GetTitle. . GetDescription. . GetAuthor. . GetPostTime. . GetImage. . GetShortDes. .
 * SetId. . SetTile. . SetDescription. . SetAuthor. . SetPostTime. . SetImage. . SetShortDes.. 
 * ToString.
 * 
</pre>
 * 
 * @author dangt
 */
public class News {
    /**
     * Store Id
     */
    private int id;

    /**
     * Store Title
     */
    private String title;

    /**
     * Store Description
     */
    private String description;
    
    /**
     * Store Image
     */
    private String image;

    /**
     * Store Author
     */
    private String author;

    /**
     * Store Date
     */
    private Date postTime;
    
    /**
     * Store shortDescription
     */
    private String shortDes;

    /**
     * Get id.<br>
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Set id.<br>
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get title.<br>
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set title.<br>
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get description.<br>
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set description.<br>
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Get image.<br>
     *
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * Set image.<br>
     *
     * @param image the image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Get author.<br>
     *
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Set author.<br>
     *
     * @param author the author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Get postTime and format postTime.<br>
     *
     * @return the postTime
     */
    public String getPostTime() {       
        
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd yyyy-hh:mm");
        return sdf.format(this.postTime);
    }

    /**
     * Set postTime.<br>
     *
     * @param postTime the postTime
     */
    public void setPostTime(Date postTime) {    
        this.postTime = postTime;
    }
    
    /**
     * Get shortDes.<br>
     *
     * @return the shortDes
     */
    public String getShortDes() {    
        return shortDes;
    }

    /**
     * Set shortDes.<br>
     *
     * @param shortDes the shortDes
     */
    public void setShortDes(String shortDes) {    
        this.shortDes = shortDes;
    }
    
}
