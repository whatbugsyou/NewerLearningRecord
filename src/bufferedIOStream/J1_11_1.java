package bufferedIOStream;

public class J1_11_1 {
	public static void main(String[] args) {
		int bigAnimal;
		int smallAnimal=0;
		int meat=100;
		int sum=100;
		for(bigAnimal=1;bigAnimal<=meat;bigAnimal++) {
			smallAnimal=sum-bigAnimal;
			if(smallAnimal%3==0&&(smallAnimal/3+bigAnimal*3)==meat) {
				break;
			}
		}
		System.out.println("大动物"+bigAnimal+"头,小动物"+smallAnimal+"头");
	}
	
}
