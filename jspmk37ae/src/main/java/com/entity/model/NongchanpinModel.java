package com.entity.model;

import com.entity.NongchanpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 农产品
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-04 16:04:31
 */
public class NongchanpinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 产品名称
	 */
	
	private String chanpinmingcheng;
		
	/**
	 * 农产品分类
	 */
	
	private String nongchanpinfenlei;
		
	/**
	 * 供应商
	 */
	
	private String gongyingshang;
		
	/**
	 * 来自地区
	 */
	
	private String laizidiqu;
		
	/**
	 * 产品介绍
	 */
	
	private String chanpinjieshao;
		
	/**
	 * 产品图片
	 */
	
	private String chanpintupian;
		
	/**
	 * 价格
	 */
	
	private Float price;
				
	
	/**
	 * 设置：产品名称
	 */
	 
	public void setChanpinmingcheng(String chanpinmingcheng) {
		this.chanpinmingcheng = chanpinmingcheng;
	}
	
	/**
	 * 获取：产品名称
	 */
	public String getChanpinmingcheng() {
		return chanpinmingcheng;
	}
				
	
	/**
	 * 设置：农产品分类
	 */
	 
	public void setNongchanpinfenlei(String nongchanpinfenlei) {
		this.nongchanpinfenlei = nongchanpinfenlei;
	}
	
	/**
	 * 获取：农产品分类
	 */
	public String getNongchanpinfenlei() {
		return nongchanpinfenlei;
	}
				
	
	/**
	 * 设置：供应商
	 */
	 
	public void setGongyingshang(String gongyingshang) {
		this.gongyingshang = gongyingshang;
	}
	
	/**
	 * 获取：供应商
	 */
	public String getGongyingshang() {
		return gongyingshang;
	}
				
	
	/**
	 * 设置：来自地区
	 */
	 
	public void setLaizidiqu(String laizidiqu) {
		this.laizidiqu = laizidiqu;
	}
	
	/**
	 * 获取：来自地区
	 */
	public String getLaizidiqu() {
		return laizidiqu;
	}
				
	
	/**
	 * 设置：产品介绍
	 */
	 
	public void setChanpinjieshao(String chanpinjieshao) {
		this.chanpinjieshao = chanpinjieshao;
	}
	
	/**
	 * 获取：产品介绍
	 */
	public String getChanpinjieshao() {
		return chanpinjieshao;
	}
				
	
	/**
	 * 设置：产品图片
	 */
	 
	public void setChanpintupian(String chanpintupian) {
		this.chanpintupian = chanpintupian;
	}
	
	/**
	 * 获取：产品图片
	 */
	public String getChanpintupian() {
		return chanpintupian;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
			
}
