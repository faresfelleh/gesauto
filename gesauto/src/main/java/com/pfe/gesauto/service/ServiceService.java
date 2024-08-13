package com.pfe.gesauto.service;
import com.pfe.gesauto.model.Services;
import com.pfe.gesauto.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;
    public Services addService(Services service) {
        return serviceRepository.save(service);
    }
    public List<Services> getAllServices() {
        return serviceRepository.findAll();
    }
    public void deleteServiceById(int id) {
        serviceRepository.deleteById(id);
  }
}
