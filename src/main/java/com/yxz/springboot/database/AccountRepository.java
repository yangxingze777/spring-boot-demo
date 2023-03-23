package com.yxz.springboot.database;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
	ArrayList<Account> findByName(String name);
	ArrayList<Account> findByGender(String gender);
}
