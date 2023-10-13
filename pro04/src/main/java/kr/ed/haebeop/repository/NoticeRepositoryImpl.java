package kr.ed.haebeop.repository;

import kr.ed.haebeop.domain.Notice;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NoticeRepositoryImpl implements NoticeRepository{
    @Autowired
    private SqlSession sqlSession;

    @Override
    public List<Notice> noticeList() throws Exception {
        return sqlSession.selectList("notice.noticeList");
    }

    @Override
    public Notice getNotice(int no) throws Exception {
        return sqlSession.selectOne("notice.getNotice", no);
    }

    @Override
    public void noticeInsert(Notice notice) throws Exception {
        sqlSession.insert("notice.noticeInsert", notice);
    }

    @Override
    public void noticeUpdate(Notice notice) throws Exception {
        sqlSession.update("notice.noticeUpdate", notice);
    }

    @Override
    public void countUp(int no) throws Exception {
        sqlSession.update("notice.countUp", no);
    }

    @Override
    public void noticeDelete(int no) throws Exception {
        sqlSession.delete("notice.noticeDelete", no);
    }
}
