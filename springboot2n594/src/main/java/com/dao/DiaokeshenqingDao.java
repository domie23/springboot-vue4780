package com.dao;

import com.entity.DiaokeshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiaokeshenqingVO;
import com.entity.view.DiaokeshenqingView;


/**
 * 调课申请
 * 
 * @author 
 * @email 
 * @date 2023-01-07 08:15:46
 */
public interface DiaokeshenqingDao extends BaseMapper<DiaokeshenqingEntity> {
	
	List<DiaokeshenqingVO> selectListVO(@Param("ew") Wrapper<DiaokeshenqingEntity> wrapper);
	
	DiaokeshenqingVO selectVO(@Param("ew") Wrapper<DiaokeshenqingEntity> wrapper);
	
	List<DiaokeshenqingView> selectListView(@Param("ew") Wrapper<DiaokeshenqingEntity> wrapper);

	List<DiaokeshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<DiaokeshenqingEntity> wrapper);
	
	DiaokeshenqingView selectView(@Param("ew") Wrapper<DiaokeshenqingEntity> wrapper);
	

}
