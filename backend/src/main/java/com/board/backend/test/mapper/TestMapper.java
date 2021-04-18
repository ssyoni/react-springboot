package com.board.backend.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.board.backend.test.vo.*;


@Repository
@Mapper
public interface TestMapper {
    List<TestVo> selectTest();
}
