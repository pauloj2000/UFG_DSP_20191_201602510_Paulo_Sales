package br.ufg.inf.pers.repositorio;

import br.ufg.inf.pers.entidades.Veiculo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * Created by aluno on 24/04/19.
 */
public class VeiculoRepositorio {

    private EntityManager entityManager;

    public VeiculoRepositorio(final EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public void cadastrar(Veiculo veiculo){
        entityManager.persist(veiculo);
    }

    public void alterar(Veiculo veiculo){
        entityManager.merge(veiculo);
    }

    public void excluir(Veiculo veiculo){
        entityManager.remove(veiculo);
    }

    public Veiculo consultar(int id){
        return entityManager.find(Veiculo.class,id);
    }
}
