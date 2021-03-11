package ru.chigurov.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.chigurov.entities.FruitEntity;
import ru.chigurov.repositories.FruitRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor //внедрение зависимости через конструктор
public class FruitService {

    private final FruitRepository fruitRepository; //внедрение зависимости через конструктор




    //на вход принимает сущность и сохраняет ее в базу
    public void save(FruitEntity fruitEntity){
        fruitRepository.save(fruitEntity);//реализовали метод внедренного бина
    }


    //возвращает лист всех сущностей из базы
    public List<FruitEntity> getAll(){
        return fruitRepository.findAll();//реализовали метод внедренного бина
    }

    public void saveAll(List<FruitEntity> fruits){
        fruitRepository.saveAll(fruits);
    }


}
