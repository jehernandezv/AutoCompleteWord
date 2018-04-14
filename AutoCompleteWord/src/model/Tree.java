package model;

public class Tree {
	
	private Node root;
	
	public Tree() {
		init();
	}
	
	public void init(){
		Node node = new Node('K');
		node.setValueRecoment(0);
		this.root = node;
	}
	
	
	public void addString(String string,Node actual){
			if(string.length() > 0){
				if(actual.isLetter(string.charAt(0))){
				addString(string.substring(1), actual.refreshNode(string.charAt(0)));	
				}else{
					Node node = new Node(string.charAt(0));
					node.setValueRecoment(0);
					actual.addSon(node);
					addString(string.substring(1),node);
			}
		}	
	}
	

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public void add(Node father,int info){
		if(this.root != null){
			
		}
		this.root = father;
	}
	
	
	
	
	
	
	

}
