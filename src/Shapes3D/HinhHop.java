/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes3D;

import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics2D;
import Shapes2D.Line;


/**
 *
 * @author Admin
 */
public class HinhHop extends Line {

    private int x, y, z, dai, rong, cao;

    public int ConvertX(int coor) {
        return coor * 5 + 990 / 2;
    }

    public int ConvertY(int coor) {
        return (-coor) * 5 + 500 / 2;
    }

    public HinhHop() {
    }

    public HinhHop(int x, int y, int z, int dai, int rong, int cao) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.dai = dai;
        this.rong = rong;
        this.cao = cao;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getDai() {
        return dai;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }

    public int getRong() {
        return rong;
    }

    public void setRong(int rong) {
        this.rong = rong;
    }

    public int getCao() {
        return cao;
    }

    public void setCao(int cao) {
        this.cao = cao;
    }

    public void draw(Graphics2D g) {

        //các điểm đáy trên
        Diem3D a1 = new Diem3D(x, y, z);
        Diem3D b1 = new Diem3D(x + dai, y, z);
        Diem3D c1 = new Diem3D(x + dai, y , z+ rong);
        Diem3D d1 = new Diem3D(x, y , z +rong);

        //các điểm đáy dưới
        Diem3D a2 = new Diem3D(x, y +cao, z );
        Diem3D b2 = new Diem3D(x + dai, y +cao, z );
        Diem3D d2 = new Diem3D(x, y + cao, z + rong);
        Diem3D c2 = new Diem3D(x + dai, y + cao, z + rong);

        //chuyển đổi sang 2D bằng phép chiếu Cabinet
        Point A1 = Cabinet.chieu(a1.getX(), a1.getY(), a1.getZ());
        Point B1 = Cabinet.chieu(b1.getX(), b1.getY(), b1.getZ());
        Point C1 = Cabinet.chieu(c1.getX(), c1.getY(), c1.getZ());
        Point D1 = Cabinet.chieu(d1.getX(), d1.getY(), d1.getZ());

        Point A2 = Cabinet.chieu(a2.getX(), a2.getY(), a2.getZ());
        Point B2 = Cabinet.chieu(b2.getX(), b2.getY(), b2.getZ());
        Point C2 = Cabinet.chieu(c2.getX(), c2.getY(), c2.getZ());
        Point D2 = Cabinet.chieu(d2.getX(), d2.getY(), d2.getZ());

        // chuyen đổi người dùng sang máy
        A1.x = ConvertX(A1.x);
        A1.y = ConvertY(A1.y);
        B1.x = ConvertX(B1.x);
        B1.y = ConvertY(B1.y);
        C1.x = ConvertX(C1.x);
        C1.y = ConvertY(C1.y);
        D1.x = ConvertX(D1.x);
        D1.y = ConvertY(D1.y);

        A2.x = ConvertX(A2.x);
        A2.y = ConvertY(A2.y);
        B2.x = ConvertX(B2.x);
        B2.y = ConvertY(B2.y);
        C2.x = ConvertX(C2.x);
        C2.y = ConvertY(C2.y);
        D2.x = ConvertX(D2.x);
        D2.y = ConvertY(D2.y);
        System.out.println(A2 + "A2");
        System.out.println(B2 + "B2");
        System.out.println(C2 + "C2");

        //Vẽ các đoạn thẳng đáy dưới
        Line A1B1 = new Line(A1, B1, 5, Color.yellow);
        A1B1.dashedLine(g);
        Line B1C1 = new Line(B1, C1, 5, Color.yellow);
        B1C1.draw(g);
        Line D1C1 = new Line(D1, C1, 5, Color.yellow);
        D1C1.draw(g);
        Line D1A1 = new Line(D1, A1, 5, Color.yellow);
        D1A1.dashedLine(g);

        //Vẽ các đoạn thẳng đáy trên
        Line A2B2 = new Line(A2, B2, 5, Color.yellow);
        A2B2.draw(g);
        Line B2C2 = new Line(B2, C2, 5, Color.yellow);
        B2C2.draw(g);
        Line D2C2 = new Line(D2, C2, 5, Color.yellow);
        D2C2.draw(g);
        Line D2A2 = new Line(D2, A2, 5, Color.yellow);
        D2A2.draw(g);

        //Vẽ các cạnh bên
        Line A1A2 = new Line(A1, A2, 5, Color.yellow);
        A1A2.dashedLine(g);
        Line B1B2 = new Line(B1, B2, 5, Color.yellow);
        B1B2.draw(g);
        Line C1C2 = new Line(C1, C2, 5, Color.yellow);
        C1C2.draw(g);
        Line D1D2 = new Line(D1, D2, 5, Color.yellow);
        D1D2.draw(g);

    }
}
