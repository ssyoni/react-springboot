package com.board.backend.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.backend.test.mapper.*;
import com.board.backend.test.vo.*;

@Service
public class TestService {

    @Autowired
    public TestMapper mapper;

    public List<TestVo> selectTest(){
        return mapper.selectTest();
    }
    
}
