class Order {
    int orderId;
    String orderDate;

    public Order(int orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    String getOrderStatus(){
        return "Order Placed";
    }
    void displayDetails(){
        System.out.println("Order Id: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Order Status: " + getOrderStatus());
    }
}

class ShippedOrder extends Order {
    int trackingNumber;
    ShippedOrder(int orderId, String orderDate, int trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    String OrderStatus(){
        return "Order Shipped";
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrderd extends ShippedOrder{
    String deliveryDate;
    DeliveredOrderd(int orderId, String orderDate, int trackingNumber, String deliverDate){
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliverDate;
    }
    String OrderStatus(){
        return "Order delivered";
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

public class OnlineManagement {
    public static void main(String[] args) {
        Order order = new Order(198, "15/7/2025");
        ShippedOrder shippedOrder = new ShippedOrder(198, "15/7/2025", 185);
        DeliveredOrderd deliveredOrderd = new DeliveredOrderd(198, "15/7/2025", 185, "20/7/2025");
        order.displayDetails();
        shippedOrder.displayDetails();
        deliveredOrderd.displayDetails();
    }
}
