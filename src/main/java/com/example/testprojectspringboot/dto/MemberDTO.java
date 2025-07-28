package com.example.testprojectspringboot.dto;

public class MemberDTO {
    private String name;
    private String email;
    private String organization;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getOrganization() {
        return organization;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", organization='" + organization + '\'' +
                '}';
    }
}


//@NoArgsConstructor -> 인자 없는 생성자 만들어주는 어노테이션
//@AllArgsConstructor -> 모든 필드를 인자로 받는 생성자 만들어주는 어노테이션
//@RequiredConstructor -> 특정 필드만 인자로 // final @NonNUll
//@EqualsAndHashCode


//아래는 lombok 사용 예제(위 코드랑 같음)
/*
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberDTO {

  private String name;
  private String email;
  private String organization;
}
 */