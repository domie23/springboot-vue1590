package com.entity.view;

import com.entity.NongchanpinfenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 农产品分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-04 16:04:31
 */
@TableName("nongchanpinfenlei")
public class NongchanpinfenleiView  extends NongchanpinfenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NongchanpinfenleiView(){
	}
 
 	public NongchanpinfenleiView(NongchanpinfenleiEntity nongchanpinfenleiEntity){
 	try {
			BeanUtils.copyProperties(this, nongchanpinfenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
