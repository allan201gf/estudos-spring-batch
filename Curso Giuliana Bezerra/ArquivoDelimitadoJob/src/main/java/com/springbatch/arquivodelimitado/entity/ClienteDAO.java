package com.springbatch.arquivodelimitado.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Document
public class ClienteDAO {

    @Id
    private ObjectId id;
    private String nome;
    private String sobrenome;
    private String idade;
    private String email;

}
