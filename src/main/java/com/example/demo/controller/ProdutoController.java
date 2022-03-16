package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

	@GetMapping("/inserirProduto")
	public String inserirProduto(@RequestParam(value = "nome") final String nome) throws Exception {

		int foo = 1;

		return nome;
	}
}
