package com.entity.model;

import com.entity.DiaokeshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 调课申请
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-01-07 08:15:46
 */
public class DiaokeshenqingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 调课课程
	 */
	
	private String diaokekecheng;
		
	/**
	 * 调课时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date diaokeshijian;
		
	/**
	 * 调课原因
	 */
	
	private String diaokeyuanyin;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：调课课程
	 */
	 
	public void setDiaokekecheng(String diaokekecheng) {
		this.diaokekecheng = diaokekecheng;
	}
	
	/**
	 * 获取：调课课程
	 */
	public String getDiaokekecheng() {
		return diaokekecheng;
	}
				
	
	/**
	 * 设置：调课时间
	 */
	 
	public void setDiaokeshijian(Date diaokeshijian) {
		this.diaokeshijian = diaokeshijian;
	}
	
	/**
	 * 获取：调课时间
	 */
	public Date getDiaokeshijian() {
		return diaokeshijian;
	}
				
	
	/**
	 * 设置：调课原因
	 */
	 
	public void setDiaokeyuanyin(String diaokeyuanyin) {
		this.diaokeyuanyin = diaokeyuanyin;
	}
	
	/**
	 * 获取：调课原因
	 */
	public String getDiaokeyuanyin() {
		return diaokeyuanyin;
	}
				
	
	/**
	 * 设置：教师工号
	 */
	 
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
