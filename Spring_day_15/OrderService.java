package Spring_day_15;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public double calculateTotal(double price, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero");
        }
        return price * quantity;
    }
}
