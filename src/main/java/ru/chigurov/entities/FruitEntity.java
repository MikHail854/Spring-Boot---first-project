package ru.chigurov.entities;

import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Accessors(chain = true)
@Data
@Entity
@Table(name = "fruit_table") //имя создаваемой таблицы
public class FruitEntity {

    @Id //аннотация из пакета avax.persistence.*, помечает поле как id
    @Column(name = "id_fruit") //в этой аннотации можно указать имя поля
    @GenericGenerator(name = "generator", strategy = "increment") //здесь указывается что id будет автоматически увеличиваться при новых записях
    @GeneratedValue(generator = "generator")//аннотация генерации id
    private Integer id;

    @Column(name = "fruit_name")
    private String fruitName;

    @Column(name = "provider_code")
    private Integer providerCode;

}
