package cn.gn.food.service;

import java.util.List;
import java.util.Map;

import cn.gn.food.entity.Food;

public interface MyFoodService {

	/* (non-Javadoc)
	 * @see cn.gn.springmvc.lesson05.dao.MyFoodDao#queryFood(java.lang.String)
	 */
	public abstract List<Food> queryFood(String foodName);

	/* (non-Javadoc)
	 * @see cn.gn.springmvc.lesson05.dao.MyFoodDao#deleteFood(java.lang.String)
	 */
	public abstract void deleteFood(String foodid);

	/* (non-Javadoc)
	 * @see cn.gn.springmvc.lesson05.dao.MyFoodDao#saveFood(java.lang.String, java.lang.String)
	 */
	public abstract void saveFood(String foodName, String price);

	/* (non-Javadoc)
	 * @see cn.gn.springmvc.lesson05.dao.MyFoodDao#updateFood(java.lang.String, java.lang.String, java.lang.String)
	 */
	public abstract void updateFood(String foodId, String foodName, String price);

}