package com.toy.everyboard.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter @Setter
public class MemberDTO {

    private int user_seq;
    private String user_id;
    private String user_pw;
    private String user_nickname;
    private Date user_Birth;
    private String user_address;
    private String user_photo;
    private Date user_join_date;

    public MemberDTO(int user_seq, String user_id, String user_pw, String user_nickname, Date user_Birth, String user_address, String user_photo, Date user_join_date) {
        this.user_seq = user_seq;
        this.user_id = user_id;
        this.user_pw = user_pw;
        this.user_nickname = user_nickname;
        this.user_Birth = user_Birth;
        this.user_address = user_address;
        this.user_photo = user_photo;
        this.user_join_date = user_join_date;
    }

    public MemberDTO() {
    }
}
