package com.restaurent.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;

import com.restaurent.domain.MenuCategory;
import com.restaurent.domain.MenuItem;

public class MenuItemService {

	List<MenuItem> menuItems = new ArrayList<>();

	public MenuItemService() {
		menuItems.add(new MenuItem(1, "Soup of the day (v)",
				"A delicious soup made from the chef's choice of vegetables. Served with a home baked bread roll.",
				MenuCategory.STARTER, BigDecimal.valueOf(4.99)));
		menuItems.add(new MenuItem(2, "Asparagus filo parcels (v)",
				"Fresh seasonal asparagus, wrapped in a light filo pastry, served with a chilli dipping sauce.",
				MenuCategory.STARTER, BigDecimal.valueOf(6.99)));
		menuItems.add(new MenuItem(3, "Chicken Terrine",
				"Our terrine tastes of summer! We use only the finest organic chicken. Served with a mixed leaf salad. (contains nuts)",
				MenuCategory.STARTER, BigDecimal.valueOf(5.99)));
		menuItems.add(new MenuItem(4, "Lamb Shank",
				"Slow cooked to perfection, our organic lamb melts in the mouth. Served with mixed vegetables and seasonal potatoes.",
				MenuCategory.MAIN_COURSE, BigDecimal.valueOf(12.99)));
		menuItems.add(new MenuItem(5, "Sea Bass",
				"We pan fry our freshly caught sea bass to seal in the flavour. Served with mixed vegetables and seasonal potatoes.",
				MenuCategory.MAIN_COURSE, BigDecimal.valueOf(11.99)));
		menuItems.add(new MenuItem(6, "Butternut squash risotto",
				"People come from far and wide for our famous risotto. Served with a mixed leaf salad. (v)",
				MenuCategory.MAIN_COURSE, BigDecimal.valueOf(9.99)));
		menuItems.add(new MenuItem(7, "Raspberry cheesecake",
				"A delightfully sweet cheesecake, served with a sour raspberry compot, to form a perfect balance to end your meal.",
				MenuCategory.DESERT, BigDecimal.valueOf(6.99)));
		menuItems.add(new MenuItem(8, "Lemon mousse",
				"Feeling full? Our mousse is delightfully light and fluffy. Served with home baked shortbread.",
				MenuCategory.DESERT, BigDecimal.valueOf(6.99)));
		menuItems.add(new MenuItem(9, "Fruit skewers",
				"Our nostalgic 80s desert is super healthy... then we add luxurious vanilla ice-cream and chocolate sauce. ",
				MenuCategory.DESERT, BigDecimal.valueOf(6.99)));
		menuItems.add(new MenuItem(10, "Coffee", "Espresso, Americano, Latte or Capuccino? Tell us how you like it!",
				MenuCategory.DRINK, BigDecimal.valueOf(2.99)));
		menuItems.add(new MenuItem(11, "Tea", "We have a full range of classic and herbal teas.", MenuCategory.DRINK,
				BigDecimal.valueOf(2.99)));
	}

	public List<MenuItem> getFullMenu() {

		return menuItems;
	}

	public List<MenuItem> findMenuItems(String searchString) {
		List<MenuItem> result = null;
		if (searchString != null || searchString.length() != 0) {
			result = new ArrayList<>();
			for (MenuItem m : menuItems) {

				if (m.getName().contains(searchString) || m.getDescription().contains(searchString)) {
					result.add(m);
				}
			}
		}
		return result;
	}

}
