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


import com.dao.DiscussbanjikebiaoDao;
import com.entity.DiscussbanjikebiaoEntity;
import com.service.DiscussbanjikebiaoService;
import com.entity.vo.DiscussbanjikebiaoVO;
import com.entity.view.DiscussbanjikebiaoView;

@Service("discussbanjikebiaoService")
public class DiscussbanjikebiaoServiceImpl extends ServiceImpl<DiscussbanjikebiaoDao, DiscussbanjikebiaoEntity> implements DiscussbanjikebiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussbanjikebiaoEntity> page = this.selectPage(
                new Query<DiscussbanjikebiaoEntity>(params).getPage(),
                new EntityWrapper<DiscussbanjikebiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussbanjikebiaoEntity> wrapper) {
		  Page<DiscussbanjikebiaoView> page =new Query<DiscussbanjikebiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussbanjikebiaoVO> selectListVO(Wrapper<DiscussbanjikebiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussbanjikebiaoVO selectVO(Wrapper<DiscussbanjikebiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussbanjikebiaoView> selectListView(Wrapper<DiscussbanjikebiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussbanjikebiaoView selectView(Wrapper<DiscussbanjikebiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
