package com.dao;

import com.entity.NongchanpinzixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongchanpinzixunVO;
import com.entity.view.NongchanpinzixunView;


/**
 * 农产品资讯
 * 
 * @author 
 * @email 
 * @date 2021-03-04 16:04:31
 */
public interface NongchanpinzixunDao extends BaseMapper<NongchanpinzixunEntity> {
	
	List<NongchanpinzixunVO> selectListVO(@Param("ew") Wrapper<NongchanpinzixunEntity> wrapper);
	
	NongchanpinzixunVO selectVO(@Param("ew") Wrapper<NongchanpinzixunEntity> wrapper);
	
	List<NongchanpinzixunView> selectListView(@Param("ew") Wrapper<NongchanpinzixunEntity> wrapper);

	List<NongchanpinzixunView> selectListView(Pagination page,@Param("ew") Wrapper<NongchanpinzixunEntity> wrapper);
	
	NongchanpinzixunView selectView(@Param("ew") Wrapper<NongchanpinzixunEntity> wrapper);
	
}
