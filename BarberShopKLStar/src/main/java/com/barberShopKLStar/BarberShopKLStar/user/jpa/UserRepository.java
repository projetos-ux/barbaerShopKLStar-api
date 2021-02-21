package com.barberShopKLStar.BarberShopKLStar.user.jpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.barberShopKLStar.BarberShopKLStar.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	Optional<User> findByLogin(String login);
	Optional<User> findByPassword(String password);
	boolean existsByLogin(String login);
	boolean existsByPassword(String password);
	boolean existsByEmail(String email);
	void deleteByLogin(String login);

}
