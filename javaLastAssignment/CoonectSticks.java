package javaLastAssignment;

import java.util.PriorityQueue;
import java.util.Scanner;

//Given n sticks of different lengths, you need to connect them into a single stick. 
//The cost to connect two sticks is equal to the sum of their lengths. 
//Your task is to connect the sticks with the minimum cost.
public class CoonectSticks {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		 int sum=0,mincost=0;
		 // Create a priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i = 0; i < n; i++) {
        	int sticksize=scan.nextInt();
        	pq.add(sticksize);
        }
        while(pq.size()>1) {
        
       
        	int s1=pq.poll();//small number 
        	int s2=pq.poll();//2nd small number
        	sum=s1+s2;
        	mincost=mincost+sum;
        	pq.add(sum);
        }
        System.out.println("Total minimum cost: " + mincost);
        scan.close();
	}

}
