package com.dao;

import com.entity.BanjikebiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BanjikebiaoVO;
import com.entity.view.BanjikebiaoView;


/**
 * 班级课表
 * 
 * @author 
 * @email 
 * @date 2023-01-07 08:15:46
 */
public interface BanjikebiaoDao extends BaseMapper<BanjikebiaoEntity> {
	
	List<BanjikebiaoVO> selectListVO(@Param("ew") Wrapper<BanjikebiaoEntity> wrapper);
	
	BanjikebiaoVO selectVO(@Param("ew") Wrapper<BanjikebiaoEntity> wrapper);
	
	List<BanjikebiaoView> selectListView(@Param("ew") Wrapper<BanjikebiaoEntity> wrapper);

	List<BanjikebiaoView> selectListView(Pagination page,@Param("ew") Wrapper<BanjikebiaoEntity> wrapper);
	
	BanjikebiaoView selectView(@Param("ew") Wrapper<BanjikebiaoEntity> wrapper);
	

}
