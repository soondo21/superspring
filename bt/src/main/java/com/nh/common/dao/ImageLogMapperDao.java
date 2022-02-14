package com.nh.common.dao;

//import org.apache.ibatis.annotations.Mapper;
import com.nh.common.dto.log.ImageLogDto;

//@Mapper
public interface ImageLogMapperDao {
	public int insertImageLog(ImageLogDto dto);
	
	public int updateImageLog(ImageLogDto dto);
}
