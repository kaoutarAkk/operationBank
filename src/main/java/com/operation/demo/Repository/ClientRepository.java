package com.operation.demo.Repository;

import com.operation.demo.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
