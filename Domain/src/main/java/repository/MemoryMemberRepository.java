package repository;

import Domain.Domain.Member;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>(); // 저장할 곳(store), Hashmap?
    private static long sequence = 0L; // 키값을 생성(sequence)

    @Override
    public Member save(Member member) {
        member.setId(++sequence); //sequence 값 올리기
        store.put(member.getId(), member); //store에 넣기
        return member;
    }

    @Override
    public Optional<Member> findById(long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream() //stream? 루프 돌리기
                .filter(member -> member.getName().equals(name)) // 넘어온 name이 같은지? 같은 경우, 필터링
                .findAny();


    }


    @Override
    public List<Member> findAll() { //멤버 리포지토리에 list로 선언되어 있음
        return new ArrayList<>(store.values()); //values는 store에 있는 멤버가 반환됨
    }
}
