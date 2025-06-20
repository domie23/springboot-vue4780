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


import com.dao.BanjikebiaoDao;
import com.entity.BanjikebiaoEntity;
import com.service.BanjikebiaoService;
import com.entity.vo.BanjikebiaoVO;
import com.entity.view.BanjikebiaoView;

@Service("banjikebiaoService")
public class BanjikebiaoServiceImpl extends ServiceImpl<BanjikebiaoDao, BanjikebiaoEntity> implements BanjikebiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanjikebiaoEntity> page = this.selectPage(
                new Query<BanjikebiaoEntity>(params).getPage(),
                new EntityWrapper<BanjikebiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanjikebiaoEntity> wrapper) {
		  Page<BanjikebiaoView> page =new Query<BanjikebiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanjikebiaoVO> selectListVO(Wrapper<BanjikebiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanjikebiaoVO selectVO(Wrapper<BanjikebiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanjikebiaoView> selectListView(Wrapper<BanjikebiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanjikebiaoView selectView(Wrapper<BanjikebiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
