package com.dao;

import com.entity.NongchanpinfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongchanpinfenleiVO;
import com.entity.view.NongchanpinfenleiView;


/**
 * 农产品分类
 * 
 * @author 
 * @email 
 * @date 2021-03-04 16:04:31
 */
public interface NongchanpinfenleiDao extends BaseMapper<NongchanpinfenleiEntity> {
	
	List<NongchanpinfenleiVO> selectListVO(@Param("ew") Wrapper<NongchanpinfenleiEntity> wrapper);
	
	NongchanpinfenleiVO selectVO(@Param("ew") Wrapper<NongchanpinfenleiEntity> wrapper);
	
	List<NongchanpinfenleiView> selectListView(@Param("ew") Wrapper<NongchanpinfenleiEntity> wrapper);

	List<NongchanpinfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<NongchanpinfenleiEntity> wrapper);
	
	NongchanpinfenleiView selectView(@Param("ew") Wrapper<NongchanpinfenleiEntity> wrapper);
	
}
