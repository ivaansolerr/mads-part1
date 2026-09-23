package demoapp;

import demoapp.service.ParService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ParServiceTest {
    @Autowired
    ParService parService;

    @Test
    public void contexLoads() throws Exception {
        assertThat(parService).isNotNull();
    }

    @Test
    public void isPar1(){
        Assertions.assertTrue(parService.isPar(2));
    }

    @Test
    public void isNotPar1(){
        Assertions.assertFalse(parService.isPar(3));
    }

}