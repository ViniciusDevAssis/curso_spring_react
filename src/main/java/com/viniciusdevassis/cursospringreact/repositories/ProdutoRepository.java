package com.viniciusdevassis.cursospringreact.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viniciusdevassis.cursospringreact.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
