package Spring_day_8;

    // CRUD Using JdbcTemplate


@Repository
public class EmployeeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int save(Employee emp) {
        String sql = "INSERT INTO employee(name, salary) VALUES (?, ?)";
        return jdbcTemplate.update(sql, emp.getName(), emp.getSalary());
    }

    public List<Employee> findAll() {
        String sql = "SELECT * FROM employee";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Employee.class));
    }

    public int update(Employee emp) {
        String sql = "UPDATE employee SET salary=? WHERE id=?";
        return jdbcTemplate.update(sql, emp.getSalary(), emp.getId());
    }

    public int delete(int id) {
        String sql = "DELETE FROM employee WHERE id=?";
        return jdbcTemplate.update(sql, id);
    }
}

