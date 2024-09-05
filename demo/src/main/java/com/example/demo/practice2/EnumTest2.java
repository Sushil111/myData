package com.example.demo.practice2;

import java.util.Scanner;

import lombok.Data;

@Data
public class EnumTest2 {

	public static pizzaStatus status;

	public enum pizzaStatus {
		READY {
			@Override
			public boolean isReady() {
				return true;
			}

		},
		DELIVERED {
			@Override
			public boolean isDelivered() {
				return true;
			}
		},
		ORDERED {
			@Override
			public boolean isOrdered() {
				return true;
			}
		},
		COOKED {
			@Override
			public boolean isCooked() {
				return true;
			}
		};

		public boolean isReady() {
			return false;

		}

		public boolean isDelivered() {
			return false;

		}

		public boolean isOrdered() {
			return false;

		}

		public boolean isCooked() {
			return false;
		}

		private int timeValue;

		public int getTimeToDeliver() {
			return this.timeValue;
		}

	}

	public boolean isDelivered() {
		return pizzaStatus.DELIVERED.isDelivered();
	}

	public void printTimeToDeliver() {

		System.out.println("Time to deliver is :" + status.getTimeToDeliver());
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome to pizza delivery application !!\nPlease order :\nEnter digit 1 to order pizza");

		Scanner sc = new Scanner(System.in);
		int orderFlag = sc.nextInt();
		if (orderFlag == 1) {
			status = pizzaStatus.ORDERED;

		}
		System.out.println("My order status :" + EnumTest2.status);
		System.out.println("Order getting generated :");
		Thread.sleep(2000);
		System.out.println("Order is registered now :");
		System.out.println("Order is getting prepared :");
		if (EnumTest2.status.isOrdered()) {
			EnumTest2.status = pizzaStatus.COOKED;
		}
		Thread.sleep(5000);
		if (EnumTest2.status.isCooked()) {
			EnumTest2.status = pizzaStatus.READY;
		}
		System.out.println("Order is cooked and ready to deliver now :");
		if (EnumTest2.status.isReady()) {
			EnumTest2.status.timeValue = 4;
		}
		EnumTest2 enumTest2 = new EnumTest2();
		enumTest2.printTimeToDeliver();
		Thread.sleep(5000);
		EnumTest2.status = pizzaStatus.DELIVERED;
		if (EnumTest2.status.isDelivered()) {
			System.out.println("Order is reached at location !! Happy ordering with us !!");
		}
//		EnumTest2.status =
		sc.close();
	}

}
