package io.jaime.fintech.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Where;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DynamicInsert
@DynamicUpdate
@Where(clause = "is_deleted=false")
@Entity
public class Counsel extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long counselId;

    @Column(nullable = false, columnDefinition = "varchar(20) COMMENT '상담 요청자'")
    private String name;

    @Column(nullable = false, columnDefinition = "varchar(20) COMMENT '전화번호'")
    private String cellPhone;

    @Column(columnDefinition = "varchar(50) DEFAULT NULL COMMENT '상담 요청자 이메일'")
    private String email;

    @Column(columnDefinition = "text DEFAULT NULL COMMENT '상담 메모'")
    private String memo;

    @Column(columnDefinition = "varchar(50) DEFAULT NULL COMMENT '주소'")
    private String address;

    @Column(columnDefinition = "varchar(50) DEFAULT NULL COMMENT '상세 주소'")
    private String addressDetail;

    @Column(columnDefinition = "varchar(5) DEFAULT NULL COMMENT '우편번호'")
    private String zipCode;

    @Column(nullable = false, columnDefinition = "datetime COMMENT '신청일자'")
    private LocalDateTime appliedAt;

}
