/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes2D;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Lương Vĩ Phú
 */
public class Pencil implements Shape2D {

    ArrayList<Point> points = new ArrayList<>();
    private int size;
    private Color color;

    public Pencil() {
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Point> points) {
        this.points = points;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
//        Line line;
        int length = points.size();
        for (int i = 0; i < length - 1; i++) {
//			line = new Line(points.get(i), points.get(i+1));
//			line.setSize(size);
//			line.setColor(color);
//			line.draw(g);
            g.drawLine(points.get(i).x, points.get(i).y, points.get(i + 1).x, points.get(i + 1).y);
        }
    }

    @Override
    public void init(Point start, Point end, int size, Color color) {
        points.add(end);
        this.setSize(size);
        this.setColor(color);
    }

    @Override
    public boolean impact(Point p) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void move(Point start, Point end) {
        // TODO Auto-generated method stub

    }

    @Override
    public void rotate(Point start, Point end) {
        // TODO Auto-generated method stub

    }

    @Override
    public void scale(Point start, Point end) {
        // TODO Auto-generated method stub

    }

}
