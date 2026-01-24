package Spring_day_15;

class OrderServiceTest {

    private OrderService orderService;

    @BeforeEach
    void setUp() {
        orderService = new OrderService();
    }

    @Test
    void shouldCalculateTotalCorrectly() {
        double total = orderService.calculateTotal(100, 2);
        assertEquals(200, total);
    }

    @Test
    void shouldThrowExceptionForInvalidQuantity() {
        assertThrows(IllegalArgumentException.class, () ->
                orderService.calculateTotal(100, 0));
    }
}
