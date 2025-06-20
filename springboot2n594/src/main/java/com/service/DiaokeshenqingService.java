package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiaokeshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiaokeshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiaokeshenqingView;


/**
 * 调课申请
 *
 * @author 
 * @email 
 * @date 2023-01-07 08:15:46
 */
public interface DiaokeshenqingService extends IService<DiaokeshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiaokeshenqingVO> selectListVO(Wrapper<DiaokeshenqingEntity> wrapper);
   	
   	DiaokeshenqingVO selectVO(@Param("ew") Wrapper<DiaokeshenqingEntity> wrapper);
   	
   	List<DiaokeshenqingView> selectListView(Wrapper<DiaokeshenqingEntity> wrapper);
   	
   	DiaokeshenqingView selectView(@Param("ew") Wrapper<DiaokeshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiaokeshenqingEntity> wrapper);
   	

}

