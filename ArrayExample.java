class ArrayExample{
	public static void main(String args[]){
		String[] names = {"Pavithra","Anuradha","Sameera","Nirupama"};
		String[] cars = {"BMW","VOLVO","LAMBO"};
		printFirstElement(cars);
		printSecondElement(names);
		
	}
	private static void printFirstElement(String []x){
		System.out.println("First element is : "+x[0]);
	}
	public static void printSecondElement(String []x){
		System.out.println("Second element is : "+x[1]);
	}
		
}
