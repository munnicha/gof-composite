package com.munnicha.patterns.gof.structural.composite.model;

import java.util.List;

/**
 *
 * @author munnicha
 */
public abstract class Graphic {
    public abstract void draw();
    public abstract void add(Graphic g);
    public abstract void remove(Graphic g);
    public abstract Graphic getChild(int i);
    public abstract List<Graphic> getChildren();
}
