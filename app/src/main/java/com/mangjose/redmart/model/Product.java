
package com.mangjose.redmart.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;


public class Product {

    @Expose
    private Attributes attributes;
    @Expose
    private List<Long> categories = new ArrayList<Long>();
    @Expose
    private String desc;
    @Expose
    private Details details;
    @Expose
    private Filters filters;
    @Expose
    private long id;
    @Expose
    private List<Image> images = new ArrayList<Image>();
    @Expose
    private Img img;
    @Expose
    private Inventory inventory;
    @Expose
    private Measure measure;
    @Expose
    private Pricing pricing;
    @Expose
    private String sku;
    @Expose
    private String title;
    @Expose
    private List<Long> types = new ArrayList<Long>();
    @Expose
    private Warehouse warehouse;

    /**
     * @return The attributes
     */
    public Attributes getAttributes() {
        return attributes;
    }

    /**
     * @param attributes The attributes
     */
    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    /**
     * @return The categories
     */
    public List<Long> getCategories() {
        return categories;
    }

    /**
     * @param categories The categories
     */
    public void setCategories(List<Long> categories) {
        this.categories = categories;
    }

    /**
     * @return The desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc The desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return The details
     */
    public Details getDetails() {
        return details;
    }

    /**
     * @param details The details
     */
    public void setDetails(Details details) {
        this.details = details;
    }

    /**
     * @return The filters
     */
    public Filters getFilters() {
        return filters;
    }

    /**
     * @param filters The filters
     */
    public void setFilters(Filters filters) {
        this.filters = filters;
    }

    /**
     * @return The id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return The images
     */
    public List<Image> getImages() {
        return images;
    }

    /**
     * @param images The images
     */
    public void setImages(List<Image> images) {
        this.images = images;
    }

    /**
     * @return The img
     */
    public Img getImg() {
        return img;
    }

    /**
     * @param img The img
     */
    public void setImg(Img img) {
        this.img = img;
    }

    /**
     * @return The inventory
     */
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * @param inventory The inventory
     */
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    /**
     * @return The measure
     */
    public Measure getMeasure() {
        return measure;
    }

    /**
     * @param measure The measure
     */
    public void setMeasure(Measure measure) {
        this.measure = measure;
    }

    /**
     * @return The pricing
     */
    public Pricing getPricing() {
        return pricing;
    }

    /**
     * @param pricing The pricing
     */
    public void setPricing(Pricing pricing) {
        this.pricing = pricing;
    }

    /**
     * @return The sku
     */
    public String getSku() {
        return sku;
    }

    /**
     * @param sku The sku
     */
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The types
     */
    public List<Long> getTypes() {
        return types;
    }

    /**
     * @param types The types
     */
    public void setTypes(List<Long> types) {
        this.types = types;
    }

    /**
     * @return The warehouse
     */
    public Warehouse getWarehouse() {
        return warehouse;
    }

    /**
     * @param warehouse The warehouse
     */
    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

}
