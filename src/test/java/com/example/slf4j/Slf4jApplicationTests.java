package com.example.slf4j;

import com.example.slf4j.controller.MathController;
import com.example.slf4j.service.BaseMathService;
import com.example.slf4j.service.Slf4jService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.List;

import static org.mockito.Mockito.*;


@SpringBootTest
class Slf4jApplicationTests {
    private static final Logger LOGGER = LoggerFactory.getLogger(Slf4jApplicationTests.class);

    @Autowired
    private Slf4jService slf4jService;
    @Autowired
    private BaseMathService mathService;

    @Mock
    private BaseMathService mockMathService;
    @Mock
    Slf4jService slf4jMockService;
    @InjectMocks
    private MathController mathController;
    private MockMvc mockMvc;


    @Before
    public void setUp() {
//        mockMvc = MockMvcBuilders.standaloneSetup(new MathController()).build();
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void mockTest() throws Exception {
        List<Integer> mockedList = mock(List.class);


        // 行为验证
//        mockedList.add(1);
//        mockedList.add(1);
//        mockedList.clear();
//        // 不写,默认执行了times(1)
//        verify(mockedList, times(2)).add(1);
//        verify(mockedList).clear();
//        verify(mockedList,never()).add(666);
//        verify(mockedList,atMost(5)).add(888);

        // 测试桩 stub
//        when(mockMathService.add(2, 3)).thenReturn(5);
//        when(mockMathService.plus(2, 3)).thenReturn(6);
//        Assertions.assertEquals(5, mockMathService.add(2, 3));
//        Assertions.assertEquals(6, mockMathService.plus(2, 3));
//        verify(mockMathService).add(2, 3);times(1);

        // 参数匹配器 matcher
//        when(mockMathService.add(anyInt(), anyInt())).thenReturn(88);
//        Assertions.assertEquals(88, mockMathService.add(0, 0));

        // 为返回值为void的函数通过Stub抛出异常
//        doThrow(new RuntimeException()).when(slf4jMockService).putAnimal();
//        slf4jMockService.putAnimal();

        // 验证执行顺序
//        mockedList.add(1);
//        mockedList.add(2);
//        InOrder order = inOrder(mockedList);
//        order.verify(mockedList).add(1);
//        order.verify(mockedList).add(2);

        // 为连续调用做测试桩 stub
//        when(mockMathService.add(anyInt(), anyInt()))
//                .thenThrow(new RuntimeException())
//                .thenReturn(0);
//        Assert.assertThrows(RuntimeException.class, () -> mockMathService.add(0, 0));
//        Assert.assertEquals(0, mockMathService.add(0, 1));
//        // 第二次以后调用也是0
//        Assert.assertEquals(0, mockMathService.add(0, 12));
        // 连续调用的简短版本
//        when(mockMathService.plus(anyInt(), anyInt()))
//                .thenReturn(1, 2, 3);
//        Assert.assertEquals(1,mockMathService.plus(1,2));
//        Assert.assertEquals(2,mockMathService.plus(1,2));
//        Assert.assertEquals(3,mockMathService.plus(1,2));
//        Assert.assertEquals(3,mockMathService.plus(1,4));

        // 为spy对象打桩
//        doReturn(0).when(mockMathService).add(anyInt(), anyInt());
//        Assert.assertEquals(0, mockMathService.add(2,3));



        LOGGER.info("success");
    }


    @Test
    void contextLoads() {
        LOGGER.warn("this is a warn message.");
        slf4jService.open();
        slf4jService.putAnimal();
        slf4jService.close();
    }

    @Test
    void mathTest() {
        Assertions.assertEquals(6, mathService.add(2, 4));
        Assertions.assertEquals(4, mathService.plus(2, 2));
        LOGGER.info("success");
    }

}
