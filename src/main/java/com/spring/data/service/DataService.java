package com.spring.data.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.data.entity.Data;
import com.spring.data.repository.DataRepository;

@Service
public class DataService {
	 @Autowired
	    private DataRepository dataRepository;

	    public List<Data> getAllData() {
	        return dataRepository.findAll();
	    }

}
