package ru.chigurov.utils;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import ru.chigurov.entities.FruitEntity;
import ru.chigurov.entities.ProviderEntity;
import ru.chigurov.service.FruitService;
import ru.chigurov.service.ProviderService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class InitiateUtils implements CommandLineRunner {

    private final FruitService fruitService;
    private final ProviderService providerService;


    //метод который позволит выполнять методы приложения при запуске
    @Override
    public void run(String... args) throws Exception {

//инициализируем таблицу с фруктами
        List<FruitEntity> fruit = new ArrayList<>(
                Arrays.asList(
                        new FruitEntity()
                                .setFruitName("Fruit1")
                                .setProviderCode(Math.abs(new Random().nextInt() % 10)),
                        new FruitEntity()
                                .setFruitName("Fruit2")
                                .setProviderCode(Math.abs(new Random().nextInt() % 10)),
                        new FruitEntity()
                                .setFruitName("Fruit3")
                                .setProviderCode(Math.abs(new Random().nextInt() % 10)),
                        new FruitEntity()
                                .setFruitName("Fruit4")
                                .setProviderCode(Math.abs(new Random().nextInt() % 10)),
                        new FruitEntity()
                                .setFruitName("Fruit5")
                                .setProviderCode(Math.abs(new Random().nextInt() % 10)),
                        new FruitEntity()
                                .setFruitName("Fruit6")
                                .setProviderCode(Math.abs(new Random().nextInt() % 10)),
                        new FruitEntity()
                                .setFruitName("Fruit7")
                                .setProviderCode(Math.abs(new Random().nextInt() % 10)),
                        new FruitEntity()
                                .setFruitName("Fruit8")
                                .setProviderCode(Math.abs(new Random().nextInt() % 10)),
                        new FruitEntity()
                                .setFruitName("Fruit9")
                                .setProviderCode(Math.abs(new Random().nextInt() % 10))
                )
        );

//инициализируем таблицу с поставщиками
        List<ProviderEntity> provider = new ArrayList<>(
                Arrays.asList(
                        new ProviderEntity()
                                .setProviderName("Provider1"),
                        new ProviderEntity()
                                .setProviderName("Provider2"),
                        new ProviderEntity()
                                .setProviderName("Provider3"),
                        new ProviderEntity()
                                .setProviderName("Provider4"),
                        new ProviderEntity()
                                .setProviderName("Provider5")
                )
        );

        fruitService.saveAll(fruit);//сохраняем List фруктов
        System.out.println("\nТаблица фруктов");
        for (FruitEntity fruitEntity : fruit) {
            System.out.println(fruitEntity);
        }


        providerService.saveAll(provider);//сохраняем List поставщиков
        System.out.println("\nТаблица поставщиков");
        for (ProviderEntity providerEntity : provider){
            System.out.println(providerEntity);
        }


        //создаем несколько сущностей фруктов, через сеттеры заполняем поля

        /*FruitEntity fruitEntity1 = new FruitEntity();
        fruitEntity1.setFruitName("fruit1");
        fruitEntity1.setProviderCode(1);

        FruitEntity fruitEntity2= new FruitEntity();
        fruitEntity2.setFruitName("fruit2");
        fruitEntity2.setProviderCode(2);

        FruitEntity fruitEntity3 = new FruitEntity();
        fruitEntity3.setFruitName("fruit3");
        fruitEntity3.setProviderCode(3);

        List<FruitEntity> fruits = new ArrayList<>();
        fruits.add(fruitEntity1);
        fruits.add(fruitEntity2);
        fruits.add(fruitEntity3);

        fruitService.saveAll(fruits);


        //с помощью переменной сервиса вызываем методы сохранения в базу, по разу для одного объекта
        //fruitService.save(fruitEntity1);
        //fruitService.save(fruitEntity2);
        //fruitService.save(fruitEntity3);



        //здесь вытаскиваем базу обратно
        List<FruitEntity> all = fruitService.getAll();



        //и выводим что получилось
        for (FruitEntity entity : all){
            System.out.println(entity);
        }*/


    }
}
