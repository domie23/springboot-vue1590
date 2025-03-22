package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongchanpinzixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongchanpinzixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongchanpinzixunView;


/**
 * 农产品资讯
 *
 * @author 
 * @email 
 * @date 2021-03-04 16:04:31
 */
public interface NongchanpinzixunService extends IService<NongchanpinzixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongchanpinzixunVO> selectListVO(Wrapper<NongchanpinzixunEntity> wrapper);
   	
   	NongchanpinzixunVO selectVO(@Param("ew") Wrapper<NongchanpinzixunEntity> wrapper);
   	
   	List<NongchanpinzixunView> selectListView(Wrapper<NongchanpinzixunEntity> wrapper);
   	
   	NongchanpinzixunView selectView(@Param("ew") Wrapper<NongchanpinzixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongchanpinzixunEntity> wrapper);
   	
}

