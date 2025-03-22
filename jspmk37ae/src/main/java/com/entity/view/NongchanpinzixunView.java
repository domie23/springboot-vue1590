package com.entity.view;

import com.entity.NongchanpinzixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 农产品资讯
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-04 16:04:31
 */
@TableName("nongchanpinzixun")
public class NongchanpinzixunView  extends NongchanpinzixunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NongchanpinzixunView(){
	}
 
 	public NongchanpinzixunView(NongchanpinzixunEntity nongchanpinzixunEntity){
 	try {
			BeanUtils.copyProperties(this, nongchanpinzixunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
