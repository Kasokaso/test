import java.util.*;

import javax.swing.text.Segment;

public class Nizovi {

	public static void inputArray(double a[]){

		Scanner unos = new Scanner(System.in);
		
		for(int i=0;i<a.length;i++){
			System.out.print("element "+i+": ");
			a[i] = unos.nextInt();
		}
	}
	
	
	
	public static void printArray(int a[]){
		
		for(int i=0; i<a.length;i++) System.out.printf((a[i])+" ");
		
		System.out.println();
	}
	
	
	
	public static void printArray(double a[]){
		
		for(int i=0; i<a.length;i++) System.out.printf("%.0f ",(a[i]));
		
		System.out.println();
	}	
	
	
	
	public static void updateArray(int a[], int b){
		
		for(int i=0;i<a.length;i++)
			if(a[i]>0) a[i]+=b;
			else a[i]-=b;
	}
	
	
	
	public static int minArray(int a[]){
	
		int min=a[0];
		
		for(int i=0;i<a.length-1;i++)	
			if(a[i]<min) min=a[i];
			
		return min;
	}
	
	
	
	public static int minArrayIndex(int a[]){
		
		int min=a[0],minIndex=0;
		
		for(int i=0;i<a.length-1;i++)	
			if(a[i]<min){
				min=a[i];
				minIndex=i;
			}	
		return minIndex;
	}

	

	public static void fillThirteenSeventeen(int a[], int b){
		
	int stop=1;
		
		for(int i=0;i<a.length;i++){
			
			do{
				
				if(((b%13)==0) || ((b%17)==0)){
					a[i]=b;
					stop=0;
				}
				b++;
			}while(stop!=0);
			stop=1;
		}
	}
	
	
	
	public static int zeroElem(int a[]){
		
		int zeroElem=0;
		
		for(int i=0;i<a.length;i++)
			if(a[i]%10==0) zeroElem++;
		
		return zeroElem;
	}
	
	
	
	public static int changeSign(int a[]){
		
		int count=0;
		
		for(int i=0;i<a.length-1;i++)
			if(a[i]*a[i+1]<0) count++;
		
		return count;
	}
	
	
	
	public static int oddSegment(int a[]){
		
		int segLen=0,maxSegLen=0,temp;
		
		for(int i=0;i<a.length;i++) if(a[i]%2!=0) segLen=1;
		
		temp=segLen;
		
		for(int i=0;i<a.length-1;i++){
			
			if((a[i+1]%2!=0) && a[i]%2!=0) segLen++; 
			
			if(segLen>maxSegLen) maxSegLen=segLen;
			
			if((a[i+1]%2==0) || a[i]%2==0) segLen=temp;
		}
		return maxSegLen;
	}
	
	
	
	public static void shiftLeft(int [] a){
		
		int temp=a[0];
		
		for(int i=0;i<a.length-1;i++) a[i]=a[i+1];
		
		a[a.length-1]=temp;
	}
	
	
	
	public static int bC(int k){
		
		int  a=0;
		
		for(double i=1;i<k;i*=10){
			if(k>i) a++;
		}
		return a;
	}
	
	
	
	public static int bC(){
    	
    	double k=stepen(2,100);
    	int  a=0;
    	
    	for(double i=1;i<k;i*=10){
    		if(k>i) a++;
    	}
    	return a;
    }
	

    public static double stepen(int n, int k){
		
		double st=1;
		
		for(int i=0;i<k;i++){
			st*=n;
		}
		return st;
	}
	
    
    
	public static void powerOfTwo(double a[]){
		
		double d1=10,d2=1,br=stepen(2,100);
		
		a[0]=bC();
		for(int i=1;i<a.length;i++){
			a[i]=br%d1/d2;
			d1*=10;
			d2*=10;
		}
	}
	
	
	
	public static boolean prost(int n){
		
		n=Math.abs(n);
		if(n==1 || n==0) return false;
		for(int i=2;i<n;i++){
			if(n%i==0) return false;
		}
		return true;
	}
	
	
	
	public static boolean stepenDvojke(int n){
		
		int i;
		
		for(i=1;i<n;i*=2);

		if(i==n) return true;
		return false;
	}
	
	
	
	public static void uslov(int a[]){
		
		for(int i=0;i<a.length;i++)
			if(prost(a[i]) || stepenDvojke(a[i])) System.out.print(a[i]+" ");
	}
	
	
	
	public static int[] cifreUNiz(int n){
		
		int a[]=new int[bC(n)];
		int c;
		
		for(int i=a.length-1;i>=0;i--){
			c=n%10;
			a[i]=c;
			n/=10;
		}
		
		return a;
	}
	
	
	
	public static int parnihUN(int n){
		
		int count=0;
		
		for(int i=0;i<cifreUNiz(n).length;i++)
			if(cifreUNiz(n)[i]%2==0) count++;
		
		return count;
	}
	
	
	
	public static int parneCifreUBroju(int n){
		
		int c,cf=0;
		
		for(int i=n;i>0;i--){
			
			c=n%10;
			if(c>0 && c%2==0) cf++;
			n/=10;
		}
		return cf;
	}
	
	
	
	public static int parneCifre(int a[], int k){
		
		int count=0;
		
		for(int i=0;i<a.length;i++){
			if(parneCifreUBroju(a[i])>=k){
				System.out.print(a[i]+" ");
				count++;
			}
		}
		System.out.println();
		return count;
	}
	
	
	
	public static void prosteCifre(int a[]){
		
		int c;
		
		for(int i=0; i<a.length;i++){
			for(int j=0;j<cifreUNiz(a[i]).length;j++)
				if(prost(cifreUNiz(a[i])[j])) System.out.print(a[i]+" ");
		}
	}
	
	
	
	/*public static int closestToArrMiddle(int a[]){
		
		double as=0;
		
		for(int i=0;i<a.length;i++) as+=a[i];
		
		as/=a.length;
		
		for(int i=0;i<a.length;i++){
			
		}
	}
	
	*/
	
	public static void frekvencija(int a[]){
	    
	    int tmp,count=0;
	    
	    for(int i=0;i<a.length;i++){
	        
	        tmp=a[i];
	        for(int j=0;j<a.length;j++)
	            if(tmp==a[j]) count++;
	        
	        System.out.println("Broj "+a[i]+" se pojavljuje "+count+" puta." );
	        count=0;
	    }
	}
	

	
	public static void randomNIza(int []x, int gr){
        
        Random r = new Random();
        
        for(int i=0;i < x.length;i++){
            x[i] = r.nextInt(gr+2);
        }
    }
	
	
	
	public static void kockica(int n){
	    
	    Random r = new Random();
	    
	    int a[]= new int[6],bacanje;
	    
	        for(int j=0;j<n;j++){
	            bacanje=1+r.nextInt(6);
	            a[bacanje-1]++;
	    }
	        
	        for(int i=0;i<a.length;i++)
	            System.out.println("Broj "+(i+1)+" se pojavljuje "+a[i]+" puta");
	}
	
	
	
	public static int[] unosOcjena(int brStudenata){
	    
	    Scanner unos = new Scanner(System.in);
	    
	    int x[] = new int[brStudenata];
	    
	    for(int i=0;i<x.length;i++){
	        System.out.print("Ocjena studenta "+(i+1)+": ");
	        x[i]=unos.nextInt();
	    }
	    return x;
	    
	}
	
	
	public static void ocjene(int a[]){
	    
	    int b[]=new int[6];
	    
	    for(int i=0;i<a.length;i++){
	             
	                if(a[i]>0 && a[i]<50) b[0]++;
	                if(a[i]>=50 && a[i]<60) b[1]++;
	                if(a[i]>=60 && a[i]<70) b[2]++;
	                if(a[i]>=70 && a[i]<80) b[3]++;
	                if(a[i]>=80 && a[i]<90) b[4]++;
	                if(a[i]>=90 && a[i]<=100) b[5]++;
                    
	    }
	    
	   
	    System.out.println("Ocjenu A dobilo je : "+b[5]+" studenata.");
	    System.out.println("Ocjenu B dobilo je : "+b[4]+" studenata.");
	    System.out.println("Ocjenu C dobilo je : "+b[3]+" studenata."); 
	    System.out.println("Ocjenu D dobilo je : "+b[2]+" studenata.");
	    System.out.println("Ocjenu E dobilo je : "+b[1]+" studenata.");
	    System.out.println("Ocjenu F dobilo je : "+b[0]+" studenata.");
	
	}
	
	public static void histogram(int a[]){
	    
	    
	    String b[]=new String[6];
	    
	    for(short x=0;x<b.length;x++){
	    	
	    	b[x] = "-";
	    }
        
        for(int i=0;i<a.length;i++){
                 
                    if(a[i]>0 && a[i]<50) b[0]="*";
                    else if(a[i]>=50 && a[i]<60) b[1]="*";
                    else if(a[i]>=60 && a[i]<70) b[2]="*";
                    else if(a[i]>=70 && a[i]<80) b[3]="*";
                    else if(a[i]>=80 && a[i]<90) b[4]="*";
                    else if(a[i]>=90 && a[i]<=100) b[5]="*"; 
        } 
        
        System.out.println(b[5]);
        System.out.println(b[4]);
        System.out.println(b[3]); 
        System.out.println(b[2]);
        System.out.println(b[1]);
        System.out.println(b[0]);
    
	}
	

	
	public static void main(String[] args) {
	
		int a[] = new int[10]; //{1,2,5,9,217,711,214,711,1,1,2,517,9,9,5,817};
		double b[] = new double[50];
		
	
		int z[]=unosOcjena(5);
		System.out.println(z[0]);
		//ocjene(z);
		histogram(z);
		//randomNIza(a, 6);
		//printArray(a);
		/*
		printArray(a);
		updateArray(a, 3);
		printArray(a);
		System.out.println(minArray(a));
		System.out.println(minArrayIndex(a));
		*/
		
		//System.out.println(parneCifre(a,3));	
		
		//prosteCifre(a);
		
		//powerOfTwo(b);
		//printArray(b);
		//printArray(b);
		//fillThirteenSeventeen(b, 0);
		//System.out.println(zeroElem(a));
		
		//kockica(10000000);
		

		
		//printArray(b);
		//System.out.println(changeSign(a));
		//System.out.println(oddSegment(a));
		//shiftLeft(a);
		//printArray(a);
		//uslov(a);
		
		//frekvencija(a);
		
	}

}