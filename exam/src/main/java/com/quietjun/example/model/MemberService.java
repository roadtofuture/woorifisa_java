package com.quietjun.example.model;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.quietjun.example.model.entity.Member;
import com.quietjun.example.model.repository.MemberRepository;

// TODO: 04. Service 타입의 빈으로 동작하도록 annotation을 추가하시오.
@Service
// END
public class MemberService {

	// TODO: 05.MemberRepository 타입의 빈을 자동 연결하시오.
	@Autowired
	// END
	MemberRepository repo;

	public Member login(Member member) {
		// TODO: 06. 전달받은 member의 id와 pass가 db에 있는지 확인해서 있으면 이름까지 설정된 Entity를 반환하고 없을
		// 경우는 null을 반환하시오.
		Optional<Member> result = repo.findById(member.getMemberId());
		if (result.isPresent()) {
			Member selected = result.get();
			if (selected.getMemberPass().equals(member.getMemberPass())) {
				return selected;
			}
		}
		// END
		return null;
	}

	public Page<Member> list(int page) {
		Pageable pageable = null;
		// TODO: 10.1페이지에 5개씩 memberId에 대한 오름차순으로 출력하도록 pageable을 설정하고 Member 목록을 반환하시오.
		// repo의 findAll(Pageable)을 호출하고 결과를 반환한다.
		pageable = PageRequest.of(page, 5, Direction.ASC, "memberId");
		Page<Member> pageInfo = repo.findAll(pageable);
		return pageInfo;
		// END

	}
}
