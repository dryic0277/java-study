public class WholeSaleCost{
	public static void main (String[] args) {
		double a;
		double b;
		double c;
		double initialShippingCost;
		double addtionalShippingCost;
		double price;
		a = 24.95;
		b = 60;
		c = 0.6;
		initialShippingCost = 3;
		addtionalShippingCost = 0.75;
		price = (a*b*c) + initialShippingCost + addtionalShippingCost * 59;
		System.out.printf("총 구매 가격은 %.3f입니다.", price);
	}
}