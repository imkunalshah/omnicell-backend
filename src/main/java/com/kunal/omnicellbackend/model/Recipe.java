package com.kunal.omnicellbackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;

@Document(collection = "recipes")
public class Recipe {
    @Id
    public String _id;
    @Field @NotNull @Indexed(unique = true)
    public int id;
    @Field @NotNull @Indexed(unique = true)
    public String name;
    @Field @NotNull @Indexed(unique = true)
    public String image;
    @Field @NotNull
    public String category;
    @Field @NotNull
    public String label;
    @Field @NotNull
    public String price;
    @Field @NotNull
    public String description;

    public Recipe() {
    }

    public Recipe(int id, String name, String image, String category, String label, String price, String description) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.category = category;
        this.label = label;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", category='" + category + '\'' +
                ", label='" + label + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
