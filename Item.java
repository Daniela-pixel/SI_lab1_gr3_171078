class Item {
	int id;
	String name;
	double price;
	char taxType;
	//TODO add variable.

	//TODO constructor
	public Item(int id, String name, double price, char taxType) 	{
		this.id = id;
		this.name = name;
		this.price = price;
		this.taxType = taxType;
	}
	//TODO setters and getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public char getTaxType() {
		return taxType;
	}

	public void setTaxType(char taxType) {
		this.taxType = taxType;
	}
	double getTaxReturn () {
		//TODO
		if(taxType == 'A') {
			return ((18/100.0)*price) * 15/100.0;
				}
		else if (taxType == 'B') {
			return ((5/100.0)*price) * 15/100.0;
		}
		return 0;
	}
}
class Receipt extends Item {
	List<Item> list;

	public Receipt(int id, String name, double price, char taxType, List<Item> list) {
		super(id, name, price, taxType);
		this.list = list;
	}
	
	int totalSum() {
		int sum = 0;
		for(int i=0;i<list.size();i++) {
			sum += list.get(i).getPrice();
		}
		return sum;
	}
	
	double totalTax() {
		double sum = 0.0;
		for(int i=0;i<list.size();i++) sum += list.get(i).getTaxReturn();
		return sum;
	}
	
}