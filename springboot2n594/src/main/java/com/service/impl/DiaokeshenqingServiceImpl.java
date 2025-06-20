package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiaokeshenqingDao;
import com.entity.DiaokeshenqingEntity;
import com.service.DiaokeshenqingService;
import com.entity.vo.DiaokeshenqingVO;
import com.entity.view.DiaokeshenqingView;

@Service("diaokeshenqingService")
public class DiaokeshenqingServiceImpl extends ServiceImpl<DiaokeshenqingDao, DiaokeshenqingEntity> implements DiaokeshenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiaokeshenqingEntity> page = this.selectPage(
                new Query<DiaokeshenqingEntity>(params).getPage(),
                new EntityWrapper<DiaokeshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiaokeshenqingEntity> wrapper) {
		  Page<DiaokeshenqingView> page =new Query<DiaokeshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiaokeshenqingVO> selectListVO(Wrapper<DiaokeshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiaokeshenqingVO selectVO(Wrapper<DiaokeshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiaokeshenqingView> selectListView(Wrapper<DiaokeshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiaokeshenqingView selectView(Wrapper<DiaokeshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
