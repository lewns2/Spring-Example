package repository;

import Domain.Domain.Member;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    //기능 : 저장, id,name 으로 멤버 찾기, 전체회원 반환
    Member save(Member member);
    Optional<Member> findById(long id); //Null일때, optional로 감싸서 반환
    Optional<Member> findByName(String name);
    List<Member> findAll();


}
