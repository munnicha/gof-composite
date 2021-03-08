package com.munnicha.patterns.gof.structural.composite.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author munnicha
 */
public class Picture extends Graphic{
    
    List<Graphic> graphics = new ArrayList<>();

    @Override
    public void draw() {
        graphics.forEach(g -> {
            g.draw();
        });
    }

    @Override
    public void add(Graphic g) {
        graphics.add(g);
    }

    @Override
    public void remove(Graphic g) {
        graphics.remove(g);
    }

    @Override
    public Graphic getChild(int i) {
        return graphics.get(i);
    }

    @Override
    public List<Graphic> getChildren() {
        return graphics;
    }
    
}
