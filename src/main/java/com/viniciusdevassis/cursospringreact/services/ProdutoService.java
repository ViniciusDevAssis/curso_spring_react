package com.viniciusdevassis.cursospringreact.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viniciusdevassis.cursospringreact.models.Produto;
import com.viniciusdevassis.cursospringreact.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;
	
	public List<Produto> findAll(){
		return repository.findAll();
	}
}
