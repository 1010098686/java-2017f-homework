package Homework3;

public class HuluBrother implements Creature{
	int ID;
	String Name;
	
	HuluBrother(int order){
		this.ID = 4 + order;
		switch(order){
			case 1:
				this.Name = "�ϴ�       ";
				break;
			case 2:
				this.Name = "�϶�       ";
				break;
			case 3:
				this.Name = "����       ";
				break;
			case 4:
				this.Name = "����       ";
				break;
			case 5:
				this.Name = "����       ";
				break;
			case 6:
				this.Name = "����       ";
				break;
			case 7:
				this.Name = "����       ";
				break;
			default:
				break;
		}
	}
	
	@Override
	public int returnID(){
		return this.ID;
	}
	
	@Override
	public String returnName(){
		return this.Name;
	}
}