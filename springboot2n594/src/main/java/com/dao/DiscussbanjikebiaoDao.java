package com.dao;

import com.entity.DiscussbanjikebiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussbanjikebiaoVO;
import com.entity.view.DiscussbanjikebiaoView;


/**
 * 班级课表评论表
 * 
 * @author 
 * @email 
 * @date 2023-01-07 08:15:46
 */
public interface DiscussbanjikebiaoDao extends BaseMapper<DiscussbanjikebiaoEntity> {
	
	List<DiscussbanjikebiaoVO> selectListVO(@Param("ew") Wrapper<DiscussbanjikebiaoEntity> wrapper);
	
	DiscussbanjikebiaoVO selectVO(@Param("ew") Wrapper<DiscussbanjikebiaoEntity> wrapper);
	
	List<DiscussbanjikebiaoView> selectListView(@Param("ew") Wrapper<DiscussbanjikebiaoEntity> wrapper);

	List<DiscussbanjikebiaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussbanjikebiaoEntity> wrapper);
	
	DiscussbanjikebiaoView selectView(@Param("ew") Wrapper<DiscussbanjikebiaoEntity> wrapper);
	

}
