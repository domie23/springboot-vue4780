package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussbanjikebiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussbanjikebiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussbanjikebiaoView;


/**
 * 班级课表评论表
 *
 * @author 
 * @email 
 * @date 2023-01-07 08:15:46
 */
public interface DiscussbanjikebiaoService extends IService<DiscussbanjikebiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussbanjikebiaoVO> selectListVO(Wrapper<DiscussbanjikebiaoEntity> wrapper);
   	
   	DiscussbanjikebiaoVO selectVO(@Param("ew") Wrapper<DiscussbanjikebiaoEntity> wrapper);
   	
   	List<DiscussbanjikebiaoView> selectListView(Wrapper<DiscussbanjikebiaoEntity> wrapper);
   	
   	DiscussbanjikebiaoView selectView(@Param("ew") Wrapper<DiscussbanjikebiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussbanjikebiaoEntity> wrapper);
   	

}

