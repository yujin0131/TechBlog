package com.project.inswave.domain.user;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;
import com.project.inswave.util.exception.NotFoundException;

import lombok.RequiredArgsConstructor;

@Service(value="SignInService")
@Configuration
@EnableJpaRepositories(basePackages = "com.project.inswave")
@RequiredArgsConstructor // final 필드에 대해 생성자 기본 생성
//@NoArgsConstructor
public class SignInService {

	@Resource(name="SignInRepository")
	private final SignInRepository signRepository;

	public User getUserInfo(int insNum) {
		AppLog.info("#####################100413.service####################" + insNum);
		return signRepository.findByinsNum(insNum).orElseThrow(() -> new NotFoundException("유저가 존재하지 않습니다."));
	}
}
