package ch05;

public class MethodMission5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//�ߺ��� �ҽ� �ִ��� ����
	// �żҵ� ��Ȱ��
		
		int star = 3 ;
		
		//PrintStarLine(star); // *****
		//PrintStarSqure(star);
		//***** //***
		//***** //***
		//***** //***
		//***** 
		//*****
		PrintStarTri(star);
		//*
		//**
		//***
		//****
		//*****
		
	}

	public static void PrintStarLine(int a) {
		for(int i=1; i<=a; i++) {
		System.out.print("*");
		}	
	}
	
	public static void PrintStarSqure(int num) {
		for(int i=1;i<num;i++) {
			System.out.println("");
			PrintStarLine(num);
			}
		}
	public static void PrintStarTri(int a) {
		for(int i=1; i<=a; i++) {
			PrintStarLine(i);
			System.out.println("");
		}
	}
		
	}
