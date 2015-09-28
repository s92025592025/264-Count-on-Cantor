import java.util.Scanner;
class Main{
	static int getArea(int term){
		return (int)(Math.ceil((Math.sqrt(1+8*term)-1)/2));
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
			System.out.println(startFinding(sc.nextInt()));
		}
	}

	static String startFinding(int term){
		int area=getArea(term);
		int mother, son;
		if(area%2!=0){
			mother=term-(area-1)*area/2;
			son=area+1-mother;
		}else{
			son=term-(area-1)*area/2;
			mother=area+1-son;
		}

		return "TERM "+term+" IS "+son+"/"+mother;
	}
}