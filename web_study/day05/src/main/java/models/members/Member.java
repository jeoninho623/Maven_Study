package models.members;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data @Getter @Setter
public class Member {
    private String userId;

    private String userPw;
    private String confirmUserPw;

    private String userNm;
    private String email;

}