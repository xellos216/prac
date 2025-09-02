package org.example.expert.domain.todo.repository;

import org.example.expert.domain.todo.entity.Todo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    @EntityGraph(attributePaths = "user")
    Page<Todo> findAllByOrderByModifiedAtDesc(Pageable pageable);

    @EntityGraph(attributePaths = "user")
    Optional<Todo> findById(Long todoId);

}

// - JPQL fetch join 대신 @EntityGraph 사용
// - 리포지토리 메서드에 @EntityGraph(attributePaths="user") 지정
// - 단건: findById(Long id) 오버라이드에 @EntityGraph 적용
// - 목록: findAllByOrderByModifiedAtDesc(Pageable pageable)에도 적용
// - 장점: 선언적 로딩, 페이징 안전, N+1 제거