package com.quietjun.example.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
// TODO: 01.Member가 테이블과 연결되도록 필요한 Annotation을 설정하시오.
@Entity
// END
public class Member {
    // TODO: 02. memberId가 Primary Key로 설정되도록 필요한 Annotation을 설정하시오.
	@Id
    // END
    private String memberId;
    private String memberPass;
    private String memberName;
}
