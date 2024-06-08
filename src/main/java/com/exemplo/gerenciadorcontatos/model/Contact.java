package com.exemplo.gerenciadorcontatos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //Indica que esta classe é uma entidade JPA
public class Contact {
    @Id //Indica o campo de identificação primária
    @GeneratedValue(strategy = GenerationType.AUTO) //Define a estratégia de geração do valor do ID (neste caso, AUTO)
    private Long id;
    private String name;
    private String email;
    private String phone;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
