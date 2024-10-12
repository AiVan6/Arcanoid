package com.company.model;


public abstract class AbstractBlock extends AbstractActor {
    public int points=0;

    AbstractBlock(double x, double y, int sizeX, int sizeY) {
        this.x = x;
        this.y = y;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
}
