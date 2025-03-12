package com.app.dao;

import java.util.Optional;

import org.apache.ibatis.session.SqlSession;

import com.app.mybatis.config.MyBatisConfig;
import com.app.vo.MemberVO;

public class MemberDAO {
	public SqlSession sqlSession;
	
	public MemberDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
//	회원가입
	public void insert(MemberVO memberVO) {
		sqlSession.insert("member.insert", memberVO);
	}
	
//	로그인
	public String selectByEmailAndPassword(MemberVO memberVO) {
		return sqlSession.selectOne("member.selectByEmailAndPassword", memberVO);
	}

//	멤버 조회
	public Optional<MemberVO> selectByEmail(String memberEmail){
		return Optional.ofNullable(sqlSession.selectOne("member.selectByEmail", memberEmail));
	}
	

}
