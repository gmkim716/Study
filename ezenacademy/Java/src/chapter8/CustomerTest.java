package chapter8;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		Customer customerLee = new Customer(10010, "�̼���");
		Customer customerShin = new Customer(10020, "�Ż��Ӵ�");
		Customer customerHong = new Customer(10030, "ȫ�浿");
		Customer customerYoul = new Customer(10040, "������");
		Customer customerKim = new VIPCustomer(10050, "������", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);
		
//		Customer customerLee = new Customer();
//		customerLee.setCustomerID(10010);
//		customerLee.setCustomerName("�̼���");
//		customerLee.bonusPoint = 1000;
//		
//		System.out.println(customerLee.showCustomerInfo());
//		
//		Customer customerKim = new VIPCustomer(10020, "������", 12345);
//		customerKim.bonusPoint = 1000;
//		
//		System.out.println(customerKim.showCustomerInfo());

		System.out.println("====== ���� ���� ��� ======");
		for(Customer customer: customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("====== �������� ���ʽ� ����Ʈ ��� =====");
		
		int price = 1000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "���� " + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName() + "���� ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint + "���Դϴ�.");
		}
		
//		int leePrice = customerLee.calcPrice(price);
//		int kimPrice = customerKim.calcPrice(price);
		
//		System.out.println(customerLee.getCustomerName() + "���� " + leePrice + "�� �����ϼ̽��ϴ�.");
//		System.out.println(customerLee.showCustomerInfo());
//		System.out.println(customerKim.getCustomerName() + "���� " + kimPrice + "�� �����ϼ̽��ϴ�.");
//		System.out.println(customerKim.showCustomerInfo());
	}

}