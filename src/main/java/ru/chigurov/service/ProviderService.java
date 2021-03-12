package ru.chigurov.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import ru.chigurov.entities.ProviderEntity;
import ru.chigurov.repositories.ProviderRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProviderService {

    private final ProviderRepository providerRepository;

    //на вход принимает сущность и сохраняет ее в базу
    public void save(ProviderEntity providerEntity){
        providerRepository.save(providerEntity);
    }

    // принимает на вход коллекцию сущностей и сохраняет ее в базу
    public void saveAll(List<ProviderEntity> providerEntity){
        providerRepository.saveAll(providerEntity);
    }

    //возвращает лист всех сущностей из базы
    public List<ProviderEntity> getAll(){
        return providerRepository.findAll();
    }

    //возвращяет запись из таблицы по id
    public Optional<ProviderEntity>getById(Integer id){
        return providerRepository.findById(id);
    }

    //удаляет запись из таблицы по id
    public void delById(Integer id){
        providerRepository.deleteById(id);
    }

    //возвращает true или false при поиске в таблице фруктов объекта,
    //который соответствует типу FruitEntity или  принадлежит к типу объекта, котоый наследуеся от FruitEntity
    public Boolean exist(Example<? extends ProviderEntity> example){
        return providerRepository.exists(example);
    }

}
