package com.divya.vm;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.divya.vm.entity.Item;
import com.divya.vm.service.ItemService;
@ContextConfiguration(locations="classpath:spring-context.xml")
public class ItemTest extends AbstractTransactionalJUnit4SpringContextTests{

	@Autowired
	private ItemService itemService;
	@Test
//	@Rollback(false)
	public void testAll(){
		Item item = new Item("KitKat", 1, 20, 1.00);
		itemService.addItem(item);
		System.out.println(itemService.getAll());

	}
}
