package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussnongchanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussnongchanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussnongchanpinView;


/**
 * 农产品评论表
 *
 * @author 
 * @email 
 * @date 2021-03-04 16:04:31
 */
public interface DiscussnongchanpinService extends IService<DiscussnongchanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussnongchanpinVO> selectListVO(Wrapper<DiscussnongchanpinEntity> wrapper);
   	
   	DiscussnongchanpinVO selectVO(@Param("ew") Wrapper<DiscussnongchanpinEntity> wrapper);
   	
   	List<DiscussnongchanpinView> selectListView(Wrapper<DiscussnongchanpinEntity> wrapper);
   	
   	DiscussnongchanpinView selectView(@Param("ew") Wrapper<DiscussnongchanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussnongchanpinEntity> wrapper);
   	
}

