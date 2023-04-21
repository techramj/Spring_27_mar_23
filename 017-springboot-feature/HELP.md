#step 1: 





#step 2: create then entity eg. Employee
	@Entity
	@Data
 	public class Employee {
	
		@Id
		@GeneratedValue
		private Long id;
		
		@Column(name="first_name")
		private String firstName;
		
		@Column(name="last_name")
		private String lastName;
		
		private double salary;
	}
	
	
#step 2: create the rest controller

##post method
	@PostMapping("/employee")
	//@RequestMapping(path="/employee", method = RequestMethod.POST)
	public Employee addEmployee() {
		
	}
	
	
#step 3: Jpa configuration (h2 database)
* In memory database
    spring.datasource.url=jdbc:h2:mem:db

* file base database
   
   
#step 4: set the logger level
	ALL
	Trace
	debug
	error
	fatal
	info
	warn
	
	trace<debug<warn<info<error<fatal
	
	add the log level in the properties file:
	#logger level
	logging.level.com.seed=warn
	logging.level.org.springframework=info
	logging.level.org.hibernate=debug
