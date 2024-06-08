package com.exemplo.gerenciadorcontatos.repository;

import com.exemplo.gerenciadorcontatos.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Indica que esta interface é um repositório Spring Data JPA.
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
