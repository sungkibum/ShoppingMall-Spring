package com.example.shop.entity;

import com.example.shop.constant.ItemSellStatus;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item {

    @Id     // 기본키
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
    @Column(name = "item_id")
    private Long id;        //상품 아이디

    @Column(nullable = false, length = 50)
    private String itemNm;      //상품 이름

    private int price;      //가격    숫자는 nullable이 원래 허용 안되기 때문에 세팅할 필요X

    private int stockNumber;        //재고 수량

    @Lob
    @Column(nullable = false)
    private String itemDetail;      //상품 상세 설명

    @Enumerated(EnumType.STRING)
    private ItemSellStatus itemSellStatus;      //상품 판매 상태

    private LocalDateTime regTime;      //상품 등록 시간

    private LocalDateTime updateTime;       //상품 수정 시간
}
