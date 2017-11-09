package ru.kpfu.itis.g11704.borisgk98.task63b

import java.lang.*;
import java.lang.reflect.Type;
import java.util.*;

import java.io.File;

interface Point {
    Object getX();
    Object getY();
}

class DoublePoint implements Point {
    protected Double x, y;
    DoublePoint(Double PointX, Double PointY) {
        x = PointX;
        y = PointY;
    }
    DoublePoint() {}
    public Double getX() {
        return x;
    }
    public Double getY() {
        return y;
    }
}

interface Arr {
    // code 4
    int getCapacity();
    // code 2
    boolean remove(int index);
}

interface PointArr extends Arr {
    // code 1
    DoublePoint get(int index);
    // code 3
    int add(DoublePoint point);
    //int indexOf(Point point);
}

interface Trimable {
    void trimToSize();
}

class PointLinkedList implements PointArr {
    private class LinkedPoint {
        public LinkedPoint next;
        public DoublePoint point;
        public int index;
        LinkedPoint(){}
        LinkedPoint(DoublePoint p, int i) {
            point = p;
            index = i;
        }
    }
    private LinkedPoint first;
    private int size = 0;

    // code 1
    public DoublePoint get(int index) {
        if (index >= size || index < 0) {
            return null;
        }
        LinkedPoint curPoint = first;
        while (curPoint.index != index) {
            curPoint = curPoint.next;
        }
        return curPoint.point;
    }
    // code 2
    public boolean remove(int index) {
        if (index >= size || index < 0) {
            return false;
        }
        if (index == 0) {
            first = first.next;
            size--;
            return true;
        }
        LinkedPoint curPoint = first.next, prefPoint = first;
        while (curPoint.index != index) {
            prefPoint = curPoint;
            curPoint = curPoint.next;
        }
        prefPoint.next = curPoint.next;
        size--;
        return true;
    }
    // code 3
    public int add(DoublePoint point) {
        if (first == null) {
            first = new LinkedPoint(point, 0);
            size = 1;
            return 0;
        }
        LinkedPoint curPoint = first;
        while (curPoint.next != null) {
            curPoint = curPoint.next;
        }
        curPoint.next = new LinkedPoint(point, size);
        size++;
        return 0;
    }
    // code 4
    public int getCapacity() {
        return size;
    }
}

class PointDynamicalArr implements PointArr, Trimable {
    private DoublePoint[] arr;
    private int size;
    // code 1
    public DoublePoint get(int index) {
        if (index >= size || index < 0) {
            return null;
        }
        return arr[index];
    }
    // code 2
    public boolean remove(int index) {
        if (index >= size)
            return false;
        size--;
        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        return true;
    }
    // code 3
    public int add(DoublePoint point) {
        size++;
        if (arr == null || size == 0) {
            arr = new DoublePoint[1];
            arr[0] = point;
            size = 1;
            return 0;
        }
        if (size < arr.length) {
            arr[size - 1] = point;
            return size - 1;
        }
        DoublePoint[] arrCopy = arr.clone();
        arr = new DoublePoint[size * 2];
        for (int i = 0; i < arrCopy.length; i++) {
            arr[i] = arrCopy[i];
        }
        arr[size - 1] = point;
        return size - 1;
    }
    // code 4
    public int getCapacity() {
        return size;
    }

    public void trimToSize() {
        if (size >= arr.length) {
            return;
        }
        DoublePoint[] cpArr = new DoublePoint[size];
        for (int i = 0; i < size; i++) {
            cpArr[i] = arr[i];
        }
        arr = cpArr;
    }
}

class Main {
    public static void main(String[] args) throws java.io.FileNotFoundException {
        Scanner scan;
        File file = new File("input.txt");
        scan = new Scanner(file);
        int n = scan.nextInt();
        PointDynamicalArr pointArr = new PointDynamicalArr();
        for (int i = 0; i < n; i++) {
            int code = scan.nextInt();
            if (code == 1) {
                DoublePoint p = pointArr.get(scan.nextInt());
                if (p == null) {
                    System.out.println(-1);
                    continue;
                }
                System.out.println(p.getX() + " " + p.getY());
            }
            if (code == 2) {
                System.out.println(pointArr.remove(scan.nextInt()));
            }
            if (code == 3) {
                System.out.println(pointArr.add(getPointFromScan(scan)));
            }
            if (code == 4) {
                System.out.println(pointArr.getCapacity());
            }
            pointArr.trimToSize();
        }
    }

    static DoublePoint getPointFromScan(Scanner scan) {
        return new DoublePoint(scan.nextDouble(), scan.nextDouble());
    }
}