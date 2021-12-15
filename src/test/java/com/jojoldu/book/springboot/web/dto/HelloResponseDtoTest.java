package com.jojoldu.book.springboot.web.dto;


import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {
    @Test
    public void 롬복_기능_테스트(){
        //given
        String name = "test";
        int amount = 1000;

        /**@RequiredArgsConstructor를 사용해서 생성자가 자동으로 생성이 되었는지 테스트*/
        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);


        /**@Geeter를 사용해서 get메소드가 잘 작동되는지 테스트*/
        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);

    }
}
