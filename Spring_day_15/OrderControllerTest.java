package Spring_day_15;

@WebMvcTest(OrderController.class)
class OrderControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private OrderService orderService;

    @Test
    void shouldReturnOrderTotal() throws Exception {
        when(orderService.calculateTotal(100, 2)).thenReturn(200.0);

        mockMvc.perform(get("/orders/total")
                        .param("price", "100")
                        .param("quantity", "2"))
                .andExpect(status().isOk())
                .andExpect(content().string("200.0"));
    }
}

