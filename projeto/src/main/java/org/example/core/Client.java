package org.example.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Client {
    private String name;
    private String cpf;

    public Client(String name,String cpf)
    {
        this.name = name;
        this.cpf = cpf;
    }


}
