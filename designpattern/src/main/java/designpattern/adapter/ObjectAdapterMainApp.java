package designpattern.adapter;

import designpattern.adapter.thirdparty.Rhombus;
import designpattern.adapter.thirdparty.Traingle;

public class ObjectAdapterMainApp {

	public static void main(String[] args) {
		System.out.println("Creating drawing of shapes...");
		Drawing drawing = new Drawing();
		drawing.addShape(new Rectangle());
		drawing.addShape(new Circle());
		drawing.addShape(new ShapeObjectAdapter(new Traingle()));
		drawing.addShape(new ShapeObjectAdapter(new Rhombus()));
		
		System.out.println("Drawing ...");
		drawing.draw();
		System.out.println("Resizing ...");
		drawing.resize();

	}

}
