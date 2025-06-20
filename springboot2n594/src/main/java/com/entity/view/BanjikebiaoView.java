package com.entity.view;

import com.entity.BanjikebiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 班级课表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-07 08:15:46
 */
@TableName("banjikebiao")
public class BanjikebiaoView  extends BanjikebiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BanjikebiaoView(){
	}
 
 	public BanjikebiaoView(BanjikebiaoEntity banjikebiaoEntity){
 	try {
			BeanUtils.copyProperties(this, banjikebiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
