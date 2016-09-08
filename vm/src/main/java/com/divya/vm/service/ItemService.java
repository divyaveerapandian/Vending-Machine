package com.divya.vm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divya.vm.entity.Item;
import com.divya.vm.repository.ItemRepository;
@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;
	@Transactional
	public List<Item> getAll() {
		return itemRepository.getAll();
	}
	@Transactional
	public int addItem(Item item) {
		return itemRepository.add(item);
	}
	@Transactional
	public void updateItem(Item item) {
		itemRepository.update(item);
	}
	@Transactional
	public void deleteItem(Item item) {
	   itemRepository.delete(item);
	}
}
