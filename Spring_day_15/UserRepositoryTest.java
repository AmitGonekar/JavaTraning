package Spring_day_15;

import org.springframework.beans.factory.annotation.Autowired;

@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository repository;

    @Test
    void shouldSaveAndFindUser() {
        User user = new User(null, "Amit");
        repository.save(user);

        Optional<User> result = repository.findByName("Amit");
        assertTrue(result.isPresent());
    }
}
