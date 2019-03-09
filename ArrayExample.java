class ArrayExample{
	public static void main(String args[]){
		String[] names = {"Pavithra","Anuradha","Sameera","Nirupama"};
		String[] cars = {"BMW","VOLVO","LAMBO"};
		printFirstElement(cars);
		printSecondElement(names);
		printThirdElement(names);
		
	}
	private static void printFirstElement(String []x){
		System.out.println("First element is : "+x[0]);
	}
	public static void printSecondElement(String []x){
		System.out.println("Second element is : "+x[1]);
	}
	public static void printThirdElement(String []x){
		for(int i=0;i<x.length;i++){
			System.out.println("Third element is : "+x[i]);
		}
	}
}
