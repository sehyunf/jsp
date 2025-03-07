package com.app.dao;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.session.SqlSession;

import com.app.mybatis.config.MyBatisConfig;
import com.app.vo.PostVO;

public class PostDAO {
public SqlSession sqlSession;
	
	public PostDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
//	게시물 작성
	public void insert(PostVO postVO) {
		sqlSession.insert("post.insert", postVO);
	}
	
//	아이디
	public Long selectId() {
		return sqlSession.selectOne("post.selectId");
	}
	
//	리스트로 조회
//	리스트 뿌리고 페이지만들기
	public List<PostVO> selectAll() {
		return sqlSession.selectList("post.selectAll");
	}
	
	public Optional<PostVO> select(Long id) {
		return Optional.ofNullable(sqlSession.selectOne("post.select", id));
//		단일객체는 null일수도 있으니 Optional객체로 감싼다.
	}
	
//	상품 수정
	public void update(PostVO postVO) {
		sqlSession.update("post.update", postVO);
	}
	
//	상품 삭제
	public void delete(Long id) {
		sqlSession.delete("post.delete", id);
	}
	
}
