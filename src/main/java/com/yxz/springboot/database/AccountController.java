package com.yxz.springboot.database;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/app")
public class AccountController {
	
	@Autowired
	private AccountRepository  accountRepository;
	
	@PostMapping("/add")
	public @ResponseBody String addNewAccount (@RequestParam String name,@RequestParam byte age,@RequestParam Integer id,@RequestParam String gender,@RequestParam String password,@RequestParam String permission) {
		Account user = new Account();
		user.setName(name);
		user.setAge(age);
		user.setID(id);
		user.setGender(gender);
		user.setPassword(password);
		user.setPermission(permission);
		System.out.println(user.getID());
		accountRepository.save(user);
		return "new user added";
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Account> findUserByID(@PathVariable(value = "id") Integer id) {
		Optional<Account> user = accountRepository.findById(id);
		if(user.isPresent())
			return ResponseEntity.ok().body(user.get());
		else
			return ResponseEntity.notFound().build();
		
	}
	
	@PutMapping("/gender={gender}")
	public ArrayList<Account> findByGender(@PathVariable(value="gender") String gender) {
		ArrayList<Account> users = accountRepository.findByGender(gender);
		return users;
	}
	
	@GetMapping("/allUsers")
	public Iterable<Account> getAllAccount() {
		return accountRepository.findAll();
		
	}
}
