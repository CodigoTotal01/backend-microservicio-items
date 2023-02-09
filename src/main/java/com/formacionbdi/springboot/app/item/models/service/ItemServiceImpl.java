package com.formacionbdi.springboot.app.item.models.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.formacionbdi.springboot.app.item.models.Producto;
import com.formacionbdi.springboot.app.item.models.Item;


@Service("serviceRestTemplate")
public class ItemServiceImpl implements ItemService {

	//Para comunicaciones api rest - le cambiamos el nombre al bean
	@Autowired
	private RestTemplate clienteRest;

	@Override
	public List<Item> findAll() {
		return null;
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		return null;
	}
}
