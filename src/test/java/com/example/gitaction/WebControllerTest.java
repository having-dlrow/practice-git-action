package com.example.gitaction;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest // 웹 계층에 필요한 빈만 로드하는 어노테이션
@AutoConfigureMockMvc
public class WebControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testEndpoint() throws Exception {
        mockMvc.perform(get("/your-endpoint")) // 테스트할 엔드포인트 경로
               .andExpect(status().isOk()); // 예상되는 HTTP 상태 코드
    }
}