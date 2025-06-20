package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanjikebiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanjikebiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanjikebiaoView;


/**
 * 班级课表
 *
 * @author 
 * @email 
 * @date 2023-01-07 08:15:46
 */
public interface BanjikebiaoService extends IService<BanjikebiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanjikebiaoVO> selectListVO(Wrapper<BanjikebiaoEntity> wrapper);
   	
   	BanjikebiaoVO selectVO(@Param("ew") Wrapper<BanjikebiaoEntity> wrapper);
   	
   	List<BanjikebiaoView> selectListView(Wrapper<BanjikebiaoEntity> wrapper);
   	
   	BanjikebiaoView selectView(@Param("ew") Wrapper<BanjikebiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanjikebiaoEntity> wrapper);
   	

}

