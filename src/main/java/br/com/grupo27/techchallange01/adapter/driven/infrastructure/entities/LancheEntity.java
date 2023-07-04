package br.com.grupo27.techchallange01.adapter.driven.infrastructure.entities;

import java.math.BigDecimal;

import br.com.grupo27.techchallange01.adapter.driven.infrastructure.entities.abstractions.ProdutoEntity;
import br.com.grupo27.techchallange01.core.domain.model.Lanche;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "LANCHE")
public class LancheEntity extends ProdutoEntity {

    protected LancheEntity() {}

    public LancheEntity(Long id, String nome, String descricao, BigDecimal preco) {
        this.setId(id);
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setPreco(preco);
    }

    public Lanche toLanche() {
        return new Lanche(this.getId(), this.getNome(), this.getDescricao(), this.getPreco());
    }

}

