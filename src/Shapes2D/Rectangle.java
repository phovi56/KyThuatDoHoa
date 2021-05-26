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
public class Rectangle implements Shape2D{
    private Point A, B, C, D;
    private int size;
    private Color color;

    public Rectangle() {
    }

    public Rectangle(Point A, Point B, Point C, Point D, int size, Color color) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
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

    public Point getD() {
        return D;
    }

    public void setD(Point D) {
        this.D = D;
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
        Line line;
        
        line = new Line(A, B, size, color);
        line.draw(g);
        line = new Line(B, C, size, color);
        line.draw(g);
        line = new Line(C, D, size, color);
        line.draw(g);
        line = new Line(D, A, size, color);
        line.draw(g);
    }
    
    public void recDash(Graphics g){
        g.setColor(color);
        Line line;
        
        line = new Line(A, B, size, color);
        line.dashedLine(g);
        line = new Line(B, C, size, color);
        line.dashedLine(g);
        line = new Line(C, D, size, color);
        line.dashedLine(g);
        line = new Line(D, A, size, color);
        line.dashedLine(g);
    }
    
    public void recDot(Graphics g){
        g.setColor(color);
        Line line;
        
        line = new Line(A, B, size, color);
        line.dotLine(g);
        line = new Line(B, C, size, color);
        line.dotLine(g);
        line = new Line(C, D, size, color);
        line.dotLine(g);
        line = new Line(D, A, size, color);
        line.dotLine(g);
    }
    
    public void recDD(Graphics g){
        g.setColor(color);
        Line line;
        
        line = new Line(A, B, size, color);
        line.dashedDotLine(g);
        line = new Line(B, C, size, color);
        line.dashedDotLine(g);
        line = new Line(C, D, size, color);
        line.dashedDotLine(g);
        line = new Line(D, A, size, color);
        line.dashedDotLine(g);
    }
    
    public void recDDD(Graphics g){
        g.setColor(color);
        Line line;
        
        line = new Line(A, B, size, color);
        line.dashedDotDotLine(g);
        line = new Line(B, C, size, color);
        line.dashedDotDotLine(g);
        line = new Line(C, D, size, color);
        line.dashedDotDotLine(g);
        line = new Line(D, A, size, color);
        line.dashedDotDotLine(g);
    }
    
    public void recArrow(Graphics g){
        g.setColor(color);
        Line line;
        
        line = new Line(A, B, size, color);
        line.arrowLine(g);
        line = new Line(B, C, size, color);
        line.arrowLine(g);
        line = new Line(C, D, size, color);
        line.arrowLine(g);
        line = new Line(D, A, size, color);
        line.arrowLine(g);
    }

    @Override
    public void init(Point start, Point end, int size, Color color) {
        if(Math.abs(start.y - end.y) == Math.abs(start.x-end.x)){
            this.setA(start);
            this.setB(new Point(end.x, start.y));
            this.setC(end);
            this.setD(new Point(start.x, end.y));
        }else{
            this.setA(start);
            this.setB(new Point(end.x, start.y));
            this.setC(end);
            this.setD(new Point(start.x, end.y));
        }
        this.setColor(color);
        this.setSize(size);
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
