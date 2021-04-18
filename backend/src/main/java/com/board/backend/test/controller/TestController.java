package com.board.backend.test.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.board.backend.test.service.*;
import com.board.backend.test.vo.TestVo;


@RestController
public class TestController {
    @Autowired
    TestService testService;

    @Override
    public String toString() {
        return super.toString();
    }

    @RequestMapping(value = "/")
    public String home() throws Exception{
        return "hello world";
    }

    @RequestMapping(value = "/test")
    public ModelAndView test() throws Exception{
        ModelAndView mav = new ModelAndView("test");
        List<TestVo> testList = testService.selectTest();
       // System.out.println("testList >>>  "+ Arrays.deepToString(testList.toArray()));
        mav.addObject("list", testList);
        return mav;
    }

}
