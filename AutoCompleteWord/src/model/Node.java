package model;

import java.util.ArrayList;

public class Node {
	private Node father;
	private int valueRecoment;
	private char letter;
	private ArrayList<Node> listSons;
	
	public Node(Node father, int value,char letter) {
		this.father = father;
		this.letter = letter;
		this.valueRecoment = value;
		this.listSons = new ArrayList<Node>();
	}
	
	public Node(char letter) {
		this.letter = letter;
		this.listSons = new ArrayList<Node>();
	}
	
	public void addSon(Node son){
		this.listSons.add(son);
	}


	public Node getFather() {
		return father;
	}


	public void setFather(Node father) {
		this.father = father;
	}


	public ArrayList<Node> getListSons() {
		return listSons;
	}

	public void setListSons(ArrayList<Node> listSons) {
		this.listSons = listSons;
	}

	public int getValueRecoment() {
		return valueRecoment;
	}

	public void setValueRecoment(int valueRecoment) {
		this.valueRecoment = valueRecoment;
	}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}
	
	


	
	
	
	
	
	
	

}
