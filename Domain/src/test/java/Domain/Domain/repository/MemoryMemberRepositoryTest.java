package Domain.Domain.repository;

import Domain.Domain.Member;
import org.junit.jupiter.api.Test;
import repository.MemoryMemberRepository;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();



    @Test
    public void save() {
        Member member = new Member();
        member.setName("KIM");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        System.out.println("result = " + (result == member)); //1.출력을 보는 방법
        assertEquals(member, result); //2. 출력은 없으나 오류 판단 가능(Junit) // * static import 하기
        assertThat(member).isEqualTo(result);//3. 코드 가독성이 좋다

    }

    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("KIM1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("KIM2");
        repository.save(member2);

        Member result = repository.findByName("KIM1").get();

        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll() {
        Member member1 = new Member();
        member1.setName("Kim1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("Kim2");
        repository.save(member2);

        List<Member> result = repository.findAll();

        assertThat(result.size()).isEqualTo(2);

    }


}
