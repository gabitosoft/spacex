/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacex.model;

/**
 *
 * @author Gabriel Delgado
 */
public abstract class SpaceObject {
    private int shield;
    private int status;
    private String name;
    private SpaceObjectType type;
    private String description;

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
    
    
}
