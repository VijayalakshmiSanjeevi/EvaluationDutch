package com.example.demo.repository;


import com.example.demo.bo.Student;

public interface StudentRepository extends BaseRepository<Student,Integer> {
//	@Autowired
//	JdbcTemplate jdbcTemplate;
//	
//	class StudentRowMapper implements RowMapper<Student> {
//		@Override
//		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//			Student student = new Student(rowNum, null, null);
//			student.setId(rowNum);
//			student.setFullName(rs.getString("fullname"));
//			
//			return student;
//		}
//    
//}
//
//	@Override
//	public List<Student> findAll() {
//		// TODO Auto-generated method stub
//		return jdbcTemplate.query("select * from student", new StudentRowMapper());
////		return null;
//	}
//
//	@Override
//	public Student findById(int id) {
//		// TODO Auto-generated method stub
//		return jdbcTemplate.queryForObject("select * from student where id=?", new Object[] { id },
//				new BeanPropertyRowMapper<Student>(Student.class));
//	}

}
