package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); // 회원을 저장하면 저장한 회원이 반환
    Optional<Member> findById(Long id); // Optional은 java8의 기능
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
