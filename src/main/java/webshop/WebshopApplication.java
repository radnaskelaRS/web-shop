package webshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;

import webshop.repository.EmployeeRepository;
import webshop.entity.Employee;

@SpringBootApplication
public class WebshopApplication implements CommandLineRunner {
    
    private final EmployeeRepository repository;
    
    @Autowired
	public WebshopApplication(EmployeeRepository repository) {
		this.repository = repository;
	}
    
	public static void main(String[] args) {
		SpringApplication.run(WebshopApplication.class, args);
	}
    
    @Override
	public void run(String... strings) throws Exception {
		this.repository.save(new Employee("Aleksandar", "Gerden", "Kurac"));
		this.repository.save(new Employee("Nikola", "Stefanovic", "Picka"));
		this.repository.save(new Employee("Filip", "Melka", "Govno"));
		this.repository.save(new Employee("Nikola", "Stankovic", "Sisa"));
	}
}
