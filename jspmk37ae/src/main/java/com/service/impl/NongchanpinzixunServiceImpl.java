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


import com.dao.NongchanpinzixunDao;
import com.entity.NongchanpinzixunEntity;
import com.service.NongchanpinzixunService;
import com.entity.vo.NongchanpinzixunVO;
import com.entity.view.NongchanpinzixunView;

@Service("nongchanpinzixunService")
public class NongchanpinzixunServiceImpl extends ServiceImpl<NongchanpinzixunDao, NongchanpinzixunEntity> implements NongchanpinzixunService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongchanpinzixunEntity> page = this.selectPage(
                new Query<NongchanpinzixunEntity>(params).getPage(),
                new EntityWrapper<NongchanpinzixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongchanpinzixunEntity> wrapper) {
		  Page<NongchanpinzixunView> page =new Query<NongchanpinzixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NongchanpinzixunVO> selectListVO(Wrapper<NongchanpinzixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongchanpinzixunVO selectVO(Wrapper<NongchanpinzixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongchanpinzixunView> selectListView(Wrapper<NongchanpinzixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongchanpinzixunView selectView(Wrapper<NongchanpinzixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
