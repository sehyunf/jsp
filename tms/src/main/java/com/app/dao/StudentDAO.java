package com.app.dao;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.session.SqlSession;

import com.app.dto.StudentDTO;
import com.app.mybatis.config.MyBatisConfig;
import com.app.vo.StudentVO;

public class StudentDAO {
	public SqlSession sqlSession;
	
	public StudentDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
//	학생 등록
	public void insert(StudentVO studentVO) {
		sqlSession.insert("student.insert", studentVO);
	}
	
//	학생 리스트
	public List<StudentDTO> selectAll(){
		return sqlSession.selectList("student.selectAll");
	}
	
//	학생 read
	public StudentDTO select(long id) {
		return sqlSession.selectOne("student.select", id);
	}
	
//	학생 update
	
//	학생 delete
	public void delete(long id) {
		sqlSession.delete("student.delete", id);
	}
	
}
