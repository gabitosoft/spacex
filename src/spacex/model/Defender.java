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
public abstract class Defender extends SpaceObject{
    
    public Defender(int shield, int status, int posX, int posY, String name, SpaceObjectType type, String description, Image image, int height, int width) {
        super(shield, status, posX, posY, name, type, description, image, height, width);
    }
    
}
