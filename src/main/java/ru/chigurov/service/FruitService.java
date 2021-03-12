package ru.chigurov.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import ru.chigurov.entities.FruitEntity;
import ru.chigurov.repositories.FruitRepository;

import java.util.List;
import java.util.Optional;

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

    // принимает на вход коллекцию сущностей и сохраняет ее в базу
    public void saveAll(List<FruitEntity> fruits){
        fruitRepository.saveAll(fruits);
    }

    //возвращяет запись из таблицы по id
    public Optional<FruitEntity> getById(Integer id){
        return fruitRepository.findById(id);
    }

    //удаляет запись из таблицы по id
    public void delById(Integer id){
        fruitRepository.deleteById(id);
    }

    //возвращает true или false при поиске в таблице фруктов объекта,
    //который соответствует типу FruitEntity или  принадлежит к типу объекта, котоый наследуеся от FruitEntity
     public Boolean exist(Example<? extends FruitEntity> example){
        return fruitRepository.exists(example);
     }

     public List<String> joinString(){
        return fruitRepository.joinString();
     }

     public List<FruitEntity> joinFruit(){
        return fruitRepository.joinFruit();
     }




}
