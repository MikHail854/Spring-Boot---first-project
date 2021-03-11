package ru.chigurov.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.chigurov.entities.ProviderEntity;
import ru.chigurov.repositories.ProviderRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProviderService {

    private final ProviderRepository providerRepository;

    public void saveAll(List<ProviderEntity> providerEntity){
        providerRepository.saveAll(providerEntity);
    }

    public void save(ProviderEntity providerEntity){
        providerRepository.save(providerEntity);
    }

    public List<ProviderEntity> getAll(){
        return providerRepository.findAll();
    }

}
