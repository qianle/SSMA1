package cn.gn.food.entity;

public class Food {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.foodid
     *
     * @mbg.generated Thu Nov 30 10:23:17 CST 2017
     */
    private Integer foodid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.foodname
     *
     * @mbg.generated Thu Nov 30 10:23:17 CST 2017
     */
    private String foodname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.price
     *
     * @mbg.generated Thu Nov 30 10:23:17 CST 2017
     */
    private Double price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.imggeurl
     *
     * @mbg.generated Thu Nov 30 10:23:17 CST 2017
     */
    private String imggeurl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.foodid
     *
     * @return the value of food.foodid
     *
     * @mbg.generated Thu Nov 30 10:23:17 CST 2017
     */
    public Integer getFoodid() {
        return foodid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.foodid
     *
     * @param foodid the value for food.foodid
     *
     * @mbg.generated Thu Nov 30 10:23:17 CST 2017
     */
    public void setFoodid(Integer foodid) {
        this.foodid = foodid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.foodname
     *
     * @return the value of food.foodname
     *
     * @mbg.generated Thu Nov 30 10:23:17 CST 2017
     */
    public String getFoodname() {
        return foodname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.foodname
     *
     * @param foodname the value for food.foodname
     *
     * @mbg.generated Thu Nov 30 10:23:17 CST 2017
     */
    public void setFoodname(String foodname) {
        this.foodname = foodname == null ? null : foodname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.price
     *
     * @return the value of food.price
     *
     * @mbg.generated Thu Nov 30 10:23:17 CST 2017
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.price
     *
     * @param price the value for food.price
     *
     * @mbg.generated Thu Nov 30 10:23:17 CST 2017
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.imggeurl
     *
     * @return the value of food.imggeurl
     *
     * @mbg.generated Thu Nov 30 10:23:17 CST 2017
     */
    public String getImggeurl() {
        return imggeurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.imggeurl
     *
     * @param imggeurl the value for food.imggeurl
     *
     * @mbg.generated Thu Nov 30 10:23:17 CST 2017
     */
    public void setImggeurl(String imggeurl) {
        this.imggeurl = imggeurl == null ? null : imggeurl.trim();
    }
}