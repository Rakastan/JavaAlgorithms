package com.anakiou.ja.packing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RectPacker2 {
	
	Node root;
   
	static enum Fit {FAIL, PERFECT,FIT };

	RectPacker2(int width, int height) {
		root = new Node(new Rectangle2(0, 0, width, height));
	}

	void inspectRectangles(List<Rectangle2> rectangles) {
		root.getRectangles(rectangles);
	}

	Rectangle2 findRectangle(Integer key) {
		return root.findRectangle(key);
	}

	void clear() {
		root = new Node(root.rect);
	}

	Rectangle2 addNode(int width, int height, Integer key) {
		Node n = root.insert(width, height, key);

		if (n != null) {
			Rectangle2 r = new Rectangle2(n.rect.x, n.rect.y, n.rect.width, n.rect.height);
			return r;
		} else {
			return null;
		}
	}

	boolean remove(Integer key) {
		return root.remove(key);
	}

	int getWidth() {
		return root.rect.width;
	}

	int getHeight() {
		return root.rect.height;
	}

	class Node {
		
		Integer key;
		Rectangle2 rect;
		
		Node leftChild = null;
		Node rightChild = null;

		 Node(Rectangle2 r) {
			this.rect = r;
		}

		Rectangle2 findRectangle(Integer item) {
			if (isLeaf()) {
				if (item.equals(key)) {
					return rect;
				} else {
					return null;
				}
			} else {
				Rectangle2 l = leftChild.findRectangle(item);

				if (l != null) {
					return l;
				} else {
					return rightChild.findRectangle(item);
				}
			}
		}

		Node insert(int width, int height, Integer keyToInsert) {
			if (!isLeaf()) {
				Node r = leftChild.insert(width, height, keyToInsert);

				if (r == null) {
					r = rightChild.insert(width, height, keyToInsert);
				}

				return r;
			} else {
				if (key != null) {
					return null;
				}

				Fit fit = fits(width, height);

				switch (fit) {
				case FAIL:
					return null;
				case PERFECT:
					key = keyToInsert;
					return this;
				case FIT:
					split(width, height);
					break;
				}

				return leftChild.insert(width, height, keyToInsert);
			}
		}

		boolean isLeaf() {
			return leftChild == null;
		}

		boolean isOccupied() {
			return key != null || !isLeaf();
		}

		boolean remove(Integer keyToRemove) {
			if (isLeaf()) {
				if (key.equals(keyToRemove)) {
					key = null;

					return true;
				}
				return false;
			} else {
				boolean found = leftChild.remove(keyToRemove);
				if (!found) {
					found = rightChild.remove(keyToRemove);
				}

				if (found) {
					if (!leftChild.isOccupied() && !rightChild.isOccupied()) {
						leftChild = null;
						rightChild = null;
					}
				}

				return found;
			}
		}

		void split(int width, int height) {
			int dw = rect.width - width;
			int dh = rect.height - height;

			assert dw >= 0;
			assert dh >= 0;

			Rectangle2 r, l;
			if (dw > dh) {
				l = new Rectangle2(rect.x, rect.y, width, rect.height);

				r = new Rectangle2(l.x + width, rect.y, rect.width - width, rect.height);
			} else {
				l = new Rectangle2(rect.x, rect.y, rect.width, height);

				r = new Rectangle2(rect.x, l.y + height, rect.width, rect.height - height);
			}

			leftChild = new Node(l);
			rightChild = new Node(r);
		}

		Fit fits(int width, int height) {
			if (width <= rect.width && height <= rect.height) {
				if (width == rect.width && height == rect.height) {
					return Fit.PERFECT;
				} else {
					return Fit.FIT;
				}
			}

			return Fit.FAIL;
		}

		void getRectangles(List<Rectangle2> rectangles) {
			rectangles.add(rect);

			if (!isLeaf()) {
				leftChild.getRectangles(rectangles);
				rightChild.getRectangles(rectangles);
			}
		}
	}

	class Rectangle2 {

		int x;
		int y;
		int width;
		int height;

		Rectangle2(int x, int y, int width, int height) {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}

		Rectangle2(Rectangle2 r) {
			this.x = r.x;
			this.y = r.y;
			this.width = r.width;
			this.height = r.height;
		}

		@Override
		public String toString() {
			return "[ x: " + x + ", y: " + y + ", w: " + width + ", h: " + height + " ]";
		}
	}
	
	public static void main (String[] args){
		
		RectPacker2 packer = new RectPacker2(640, 480);
		Random r = new Random();
		
		for(int i = 0; i < 50; i++){
			packer.addNode(r.nextInt(110) + 20, r.nextInt(100) + 10, i);
		}
		
		List<Rectangle2> rectangles = new ArrayList<Rectangle2>();
		packer.inspectRectangles(rectangles);
		
		
		for(Rectangle2 rc : rectangles){
			System.out.println(rc);
		}
		
		  
	  }
}
