package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 教室信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-01-07 08:15:46
 */
@TableName("jiaoshixinxi")
public class JiaoshixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaoshixinxiEntity() {
		
	}
	
	public JiaoshixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 教室楼
	 */
					
	private String jiaoshilou;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：教室楼
	 */
	public void setJiaoshilou(String jiaoshilou) {
		this.jiaoshilou = jiaoshilou;
	}
	/**
	 * 获取：教室楼
	 */
	public String getJiaoshilou() {
		return jiaoshilou;
	}
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
