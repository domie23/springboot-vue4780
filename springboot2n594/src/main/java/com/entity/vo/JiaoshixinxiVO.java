package com.entity.vo;

import com.entity.JiaoshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 教室信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-01-07 08:15:46
 */
public class JiaoshixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 容纳人数
	 */
	
	private Integer rongnarenshu;
		
	/**
	 * 教室号
	 */
	
	private String jiaoshihao;
		
	/**
	 * 教室设备
	 */
	
	private String jiaoshishebei;
		
	/**
	 * 教室介绍
	 */
	
	private String jiaoshijieshao;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：容纳人数
	 */
	 
	public void setRongnarenshu(Integer rongnarenshu) {
		this.rongnarenshu = rongnarenshu;
	}
	
	/**
	 * 获取：容纳人数
	 */
	public Integer getRongnarenshu() {
		return rongnarenshu;
	}
				
	
	/**
	 * 设置：教室号
	 */
	 
	public void setJiaoshihao(String jiaoshihao) {
		this.jiaoshihao = jiaoshihao;
	}
	
	/**
	 * 获取：教室号
	 */
	public String getJiaoshihao() {
		return jiaoshihao;
	}
				
	
	/**
	 * 设置：教室设备
	 */
	 
	public void setJiaoshishebei(String jiaoshishebei) {
		this.jiaoshishebei = jiaoshishebei;
	}
	
	/**
	 * 获取：教室设备
	 */
	public String getJiaoshishebei() {
		return jiaoshishebei;
	}
				
	
	/**
	 * 设置：教室介绍
	 */
	 
	public void setJiaoshijieshao(String jiaoshijieshao) {
		this.jiaoshijieshao = jiaoshijieshao;
	}
	
	/**
	 * 获取：教室介绍
	 */
	public String getJiaoshijieshao() {
		return jiaoshijieshao;
	}
			
}
