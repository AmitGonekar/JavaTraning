package Spring_day_15;

@SpringBootTest
@AutoConfigureMockMvc
class OrderIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldCreateOrderSuccessfully() throws Exception {
        mockMvc.perform(post("/orders")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("""
                    {
                      "price": 100,
                      "quantity": 2
                    }
                """))
                .andExpect(status().isCreated());
    }
}


//✅ What this validates:
//Controller mapping
//Service logic
//Repository save
//JSON request handling
