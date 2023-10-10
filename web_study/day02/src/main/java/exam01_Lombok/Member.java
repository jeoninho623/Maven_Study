package exam01_Lombok;

import lombok.*;

//@Getter @Setter @ToString
//@NoArgsConstructor(access = AccessLevel.PRIVATE)      // 기본 생성자 추가
//@NoArgsConstructor
//@AllArgsConstructor     // 모든 생성자 추가
//@EqualsAndHashCode      // equals, hashcode 메서드 자동 생성
//@RequiredArgsConstructor
@Data   // @Getter @Setter @ToString @EqualsAndHashCode
public class Member {
    private String userId;

   // @ToString.Exclude
    //@NonNull
    private String userPw;
    private String userNm;
}
