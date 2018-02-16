/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacex.model;

import javafx.scene.image.Image;

/**
 *
 * @author Gabriel Delgado
 */
public abstract class SpaceObject {
    protected int shield;
    protected int status;
    protected int posX;
    protected int posY;
    protected String name;
    protected SpaceObjectType type;
    protected String description;
    protected Image image;
    protected int height;
    protected int width;

    public SpaceObject(int shield, int status, String name, SpaceObjectType type) {
        this.shield = shield;
        this.status = status;
        this.name = name;
        this.type = type;
    }

    public SpaceObject(int shield, int status, String name, SpaceObjectType type, String description) {
        this.shield = shield;
        this.status = status;
        this.name = name;
        this.type = type;
        this.description = description;
    }

    public SpaceObject(int shield, int status, int posX, int posY, String name, SpaceObjectType type) {
        this.shield = shield;
        this.status = status;
        this.posX = posX;
        this.posY = posY;
        this.name = name;
        this.type = type;
    }

    public SpaceObject(int shield, int status, int posX, int posY, String name, SpaceObjectType type, String description, Image image, int height, int width) {
        this.shield = shield;
        this.status = status;
        this.posX = posX;
        this.posY = posY;
        this.name = name;
        this.type = type;
        this.description = description;
        this.image = image;
        this.height = height;
        this.width = width;
    }
    
    
    /**
     * @return the shield
     */
    public int getShield() {
        return shield;
    }

    /**
     * @param shield the shield to set
     */
    public void setShield(int shield) {
        this.shield = shield;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public SpaceObjectType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(SpaceObjectType type) {
        this.type = type;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the posX
     */
    public int getPosX() {
        return posX;
    }

    /**
     * @param posX the posX to set
     */
    public void setPosX(int posX) {
        this.posX = posX;
    }

    /**
     * @return the posY
     */
    public int getPosY() {
        return posY;
    }

    /**
     * @param posY the posY to set
     */
    public void setPosY(int posY) {
        this.posY = posY;
    }

    /**
     * @return the image
     */
    public Image getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }
    
    
}
