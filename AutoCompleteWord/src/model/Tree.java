package model;

public class Tree {
	
	private Node root;
	
	public void init(){
		this.root = new Node('K');
	}
	
	public void add(Node father,char info,String word){
		if(father.getListSons().size() == 0){
			father.addSon(new Node(info));
		}else{
			for (int i = 0; i < father.getListSons().size(); i++) {
				if(father.getListSons().get(i).getLetter()){
					
				}
			}
			Node son = new Node(info);
			son.setFather(father);
			father.addSon(son);
		
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
