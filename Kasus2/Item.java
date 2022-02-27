package Kasus2;

public class Item {
	private String name;
	//Enkapsulasi
	private Item() {
		name = "Ipin";
	}
	public Item(String name) {
		//Memasukan item yang baru dari contructor item
		this.name = new Item().name;
		System.out.println(this.name);
	}

}
