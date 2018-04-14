package model;

import java.util.ArrayList;

public class Node {
	private Node father;
	private int valueRecoment = 0;
	private char letter;
	private ArrayList<Node> listSons = new ArrayList<Node>();
	
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
	
	public boolean isLetter(char letter){
		boolean flag = false;
		for (int i = 0; i < this.listSons.size(); i++) {
			if(this.listSons.get(i).getLetter() == letter){
				flag = true;
			}
		}
		return flag;
	}
	
	public void sumRecoment(){
		this.valueRecoment ++;
	}
	
	public Node refreshNode(char letter){
		Node result = null;
		for (int i = 0; i < this.listSons.size(); i++) {
			if(this.listSons.get(i).getLetter() == letter){
				result = listSons.get(i);
			}
		}
		return result;
		
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
