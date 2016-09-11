
public class Assignment3 {

	public Assignment3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                    int c;
		    System.out.println("Please enter a number");
		    
		    int a =new Scanner(System.in).nextInt();
		   
		    Random t = new Random();
		 
		    // random integers in [0, 100]
		 
		    for (c = 1; c <= a-1; c++) {
		      System.out.println(t.nextInt(c));
		    }

	}

}
