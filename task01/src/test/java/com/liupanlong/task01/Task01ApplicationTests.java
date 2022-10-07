package com.liupanlong.task01;

import com.liupanlong.task01.dao.UserInfo;
import com.liupanlong.task01.service.UserInfoRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class ApplicationTests {
/*

    @Autowired
    private UserInfoRepository userRepository;

    @Test
    public void test() throws Exception {
        // 创建10条记录
        userRepository.save(new UserInfo("CCC", 30));
        userRepository.save(new UserInfo("DDD", 40));
        userRepository.save(new UserInfo("EEE", 50));
        userRepository.save(new UserInfo("FFF", 60));
        userRepository.save(new UserInfo("GGG", 70));
        userRepository.save(new UserInfo("HHH", 80));
        userRepository.save(new UserInfo("III", 90));
        userRepository.save(new UserInfo("JJJ", 100));

        // 测试findAll, 查询所有记录
        Assertions.assertEquals(8, userRepository.findAll().size());

        // 测试findByName, 查询姓名为FFF的User
        Assertions.assertEquals(60, userRepository.findByName("FFF").getAge().longValue());

        // 测试findUser, 查询姓名为FFF的User
        Assertions.assertEquals(60, userRepository.findUser("FFF").getAge().longValue());

        // 测试findByNameAndAge, 查询姓名为FFF并且年龄为60的User
        Assertions.assertEquals("FFF", userRepository.findByNameAndAge("FFF", 60).getName());

        // 测试删除姓名为AAA的User
        userRepository.delete(userRepository.findByName("AAA"));

        // 测试findAll, 查询所有记录, 验证上面的删除是否成功
        Assertions.assertEquals(9, userRepository.findAll().size());


    }
*/
}
