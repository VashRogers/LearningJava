package EnumsExample;

import EnumsExample.entities.Order;
import EnumsExample.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String [] args) {
        Order order = new Order(12, new Date(), OrderStatus.SHIPPED);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
