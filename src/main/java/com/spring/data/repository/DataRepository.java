package com.spring.data.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.data.entity.Data;

public interface DataRepository extends JpaRepository<Data, Long> {

}
