package study;

public class WhileExam031 {

	public static void main(String[] args) {

		int i=1,simbol=1,sum=0;
		
		while(i<=100) {
			//if( i % 2 !=0)
			simbol = -simbol;
			sum+= simbol*(i*i);
			i++;
		}
		System.out.println(sum);	
		
		
	}
	}

