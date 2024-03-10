package com.example.Repository;

import com.example.Entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts,Long> {

    Optional<Accounts> findByCustomerId(Long Id);

    @Transactional
    @Modifying
    void deleteByCustomerId(Long customerId);
}
