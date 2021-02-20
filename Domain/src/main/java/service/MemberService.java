package service;

import Domain.Domain.Member;
import org.springframework.stereotype.Service;
import repository.MemberRepository;
import repository.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;

@Service // controller에서 autowired 하기 위함.
public class MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();



    /**
     * 회원 가입
     */
    public Long join(Member member) {
        //같은 이름이 있는 중복 회원X : 규칙 설정
        validateDuplicateMember(member); //중복회원 검증
        memberRepository.save(member); //통과 시, 저장
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        Optional<Member> result = memberRepository.findByName(member.getName());

        result.ifPresent(m -> {
            throw new IllegalStateException("이미 존재하는 회원입니다."); //m에 값이 있으면 로직 동작
        } );
    }

    /**
     * 전체 회원 조회
     */
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }


}
