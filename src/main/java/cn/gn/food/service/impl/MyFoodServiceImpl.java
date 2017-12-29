package cn.gn.food.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import cn.gn.food.dao.FoodMapper;
import cn.gn.food.entity.Food;
import cn.gn.food.entity.FoodExample;
import cn.gn.food.entity.FoodExample.Criteria;
import cn.gn.food.service.MyFoodService;


@Service
public class MyFoodServiceImpl implements  MyFoodService {
	@Autowired
	FoodMapper dao;
	/* (non-Javadoc)
	 * @see cn.gn.springmvc.lesson05.dao.MyFoodDao#queryFood(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see cn.gn.food.service.impl.MyFoodService#queryFood(java.lang.String)
	 */
	public List<Food> queryFood(String foodName){
		if(foodName==null ){
			foodName="";
		}
		FoodExample fe = new FoodExample();
		Criteria c= fe.createCriteria();
		c.andFoodnameLike("%"+foodName+"%");
		return dao.selectByExample(fe);
	}
	/* (non-Javadoc)
	 * @see cn.gn.springmvc.lesson05.dao.MyFoodDao#deleteFood(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see cn.gn.food.service.impl.MyFoodService#deleteFood(java.lang.String)
	 */
	public void deleteFood(String foodid) {
		dao.deleteByPrimaryKey(Integer.parseInt(foodid));
	}
	/* (non-Javadoc)
	 * @see cn.gn.springmvc.lesson05.dao.MyFoodDao#saveFood(java.lang.String, java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see cn.gn.food.service.impl.MyFoodService#saveFood(java.lang.String, java.lang.String)
	 */
	public void saveFood(String foodName,String price) {
		Food food = new Food();
		food.setFoodname(foodName);
		food.setPrice(Double.parseDouble(price));
		dao.insert(food);
	}
	/* (non-Javadoc)
	 * @see cn.gn.springmvc.lesson05.dao.MyFoodDao#updateFood(java.lang.String, java.lang.String, java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see cn.gn.food.service.impl.MyFoodService#updateFood(java.lang.String, java.lang.String, java.lang.String)
	 */
	public void updateFood(String foodId,String foodName,String price) {
		Food food = new Food();
		food.setFoodid(Integer.parseInt(foodId));
		food.setFoodname(foodName);
		food.setPrice(Double.parseDouble(price));
		dao.updateByPrimaryKey(food);
	}
}
