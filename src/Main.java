//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public class walkinCustomers implements Payment,takeOrder{
        public void pay_method(){
            System.out.println("accept walkincustomers payment");
        }
        public void order_details(){
            System.out.println("ORDER DETAILS");
        }
    }
    public class telephoneorders implements Payment,takeOrder{
        public void pay_method(){
            System.out.println("accept telephone order");
        }

        @Override
        public void order_details() {
            System.out.println("ORDER DETAILS.");
        }
    }
    public class onlineOrders implements Payment, takeOrder{
        @Override
        public void pay_method() {
            System.out.println("accept online order");
        }
        public void order_details(){
            System.out.println("ORDER DETAILS");
        }
    }
    public static void main(String[] args) {

    }
}