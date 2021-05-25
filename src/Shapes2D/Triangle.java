/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes2D;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author DELL
 */
public class Triangle implements Shape2D{
    private Point A, B, C;
    private int size;
    private Color color;

    public Triangle() {
    }

    public Triangle(Point A, Point B, Point C, int size, Color color) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.size = size;
        this.color = color;
    }

    public Point getA() {
        return A;
    }

    public void setA(Point A) {
        this.A = A;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point B) {
        this.B = B;
    }

    public Point getC() {
        return C;
    }

    public void setC(Point C) {
        this.C = C;
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

    public void draw(Graphics g) {
        g.setColor(color);
        
        Line line;
        line = new Line(A, B, size, color);
        line.draw(g);
        line = new Line(B, C, size, color);
        line.draw(g);
        line = new Line(C, A, size, color);
        line.draw(g);
    }
    
    public void triaDash(Graphics g){
        g.setColor(color);
        
        Line line;
        
        line = new Line(A, B, size, color);
        line.dashedLine(g);
        line = new Line(B, C, size, color);
        line.dashedLine(g);
        line = new Line(C, A, size, color);
        line.dashedLine(g);
    }
    
    public void triaDot(Graphics g){
        g.setColor(color);
        Line line;
        
        line = new Line(A, B, size, color);
        line.dotLine(g);
        line = new Line(B, C, size, color);
        line.dotLine(g);
        line = new Line(C, A, size, color);
        line.dotLine(g);
    }
    
    public void triaDD(Graphics g){
        g.setColor(color);
        Line line;
        
        line = new Line(A, B, size, color);
        line.dashedDotLine(g);
        line = new Line(B, C, size, color);
        line.dashedDotLine(g);
        line = new Line(C, A, size, color);
        line.dashedDotLine(g);
    }
    
    public void triaDDD(Graphics g){
        g.setColor(color);
        Line line;
        
        line = new Line(A, B, size, color);
        line.dashedDotDotLine(g);
        line = new Line(B, C, size, color);
        line.dashedDotDotLine(g);
        line = new Line(C, A, size, color);
        line.dashedDotDotLine(g);
    }
    
    public void triaArrow(Graphics g){
        g.setColor(color);
        Line line;
        
        line = new Line(A, B, size, color);
        line.arrowLine(g);
        line = new Line(B, C, size, color);
        line.arrowLine(g);
        line = new Line(C, A, size, color);
        line.arrowLine(g);
    }

    public void init(Point a, Point b, int size, Color color) {
        this.setA(new Point((a.x + b.x)/2, a.y));
        this.setB(b);
        this.setC(new Point(a.x, b.y));
        this.setSize(size);
        this.setColor(color);
    }

    @Override
    public void move(Point start, Point end) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean impact(Point p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rotate(Point start, Point end) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void scale(Point start, Point end) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
