package kr.ed.haebeop.repository;

import kr.ed.haebeop.domain.Notice;

import java.util.List;

public interface NoticeRepository {
    public List<Notice> noticeList() throws Exception;
    public Notice getNotice(int no) throws Exception;

    public void noticeInsert(Notice notice) throws Exception;

    public void noticeUpdate(Notice notice) throws Exception;

    public void countUp(int no) throws Exception;

    public void noticeDelete(int no) throws Exception;


}
