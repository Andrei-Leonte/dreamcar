package com.dreamcar.andreea.repositories;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.dreamcar.andreea.entites.Request;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RequestRepository extends JpaRepository<Request, Long> {
    @Query(value  = "SELECT * FROM Requests r WHERE r.status = 1", nativeQuery = true)
	public Collection<Request> getAllActive();

    @Query(value  = "SELECT * FROM Requests r WHERE r.status = 0", nativeQuery = true)
	public Collection<Request> getAllInactive();
}
