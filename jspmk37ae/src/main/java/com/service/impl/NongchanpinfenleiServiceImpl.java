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


import com.dao.NongchanpinfenleiDao;
import com.entity.NongchanpinfenleiEntity;
import com.service.NongchanpinfenleiService;
import com.entity.vo.NongchanpinfenleiVO;
import com.entity.view.NongchanpinfenleiView;

@Service("nongchanpinfenleiService")
public class NongchanpinfenleiServiceImpl extends ServiceImpl<NongchanpinfenleiDao, NongchanpinfenleiEntity> implements NongchanpinfenleiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongchanpinfenleiEntity> page = this.selectPage(
                new Query<NongchanpinfenleiEntity>(params).getPage(),
                new EntityWrapper<NongchanpinfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongchanpinfenleiEntity> wrapper) {
		  Page<NongchanpinfenleiView> page =new Query<NongchanpinfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NongchanpinfenleiVO> selectListVO(Wrapper<NongchanpinfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongchanpinfenleiVO selectVO(Wrapper<NongchanpinfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongchanpinfenleiView> selectListView(Wrapper<NongchanpinfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongchanpinfenleiView selectView(Wrapper<NongchanpinfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
