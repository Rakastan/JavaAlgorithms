package com.anakiou.ja.packing;

public class MaxRects {
	
	private int binWidth;
	private int binHeight;
	
	public MaxRects(){
		binWidth = 0;
		binHeight = 0;
	}
	
	public MaxRects(int width, int height){
		binWidth = width;
		binHeight = height;
	}
	
	public void init(int width, int height){
		binWidth = width;
		binHeight = height;
		Rect n = new Rect();
		n.x = 0;
		n.y = 0;
		n.width = width;
		n.height = height;
	}
	
	class Rect{
		int x;
		int y;
		int width;
		int height;
	}
	
	class RectSize{
		int width;
		int height;
	}

}
