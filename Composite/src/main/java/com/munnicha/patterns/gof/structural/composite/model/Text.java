package com.munnicha.patterns.gof.structural.composite.model;

import java.util.List;

/**
 *
 * @author munnicha
 */
public class Text extends Graphic{

    @Override
    public void draw() {
        System.out.println("Draw a text.");
    }

    @Override
    public void add(Graphic g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Graphic g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Graphic getChild(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Graphic> getChildren() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
