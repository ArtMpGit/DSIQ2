package br.unifacisa.si.p7.dsi.q2.produtos.controller;

import java.util.ArrayList; 
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unifacisa.si.p7.dsi.q2.produtos.domains.models.Produto;


@RestController
@RequestMapping("produtos")
public class ProdutoController {
	
	@GetMapping
	public ResponseEntity<List<Produto>> getAll(){
		List<Produto> ls = new ArrayList<>();
		Produto produto = new Produto();
		produto.setNome("Produto");
		produto.setValor(222);
		ls.add(produto);
		return new ResponseEntity<>(ls,HttpStatus.OK);
	}
	

}
