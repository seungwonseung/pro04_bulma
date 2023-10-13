package kr.ed.haebeop.service;

import kr.ed.haebeop.domain.Notice;
import kr.ed.haebeop.persistence.NoticeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeService2 {
    @Autowired
    private NoticeMapper noticeMapper;

    public List<Notice> noticeList() {
        return noticeMapper.noticeList();
    }

    public Notice getNotice(int no){
        return noticeMapper.getNotice(no);
    }

    public void noticeInsert(Notice notice){
        noticeMapper.noticeInsert(notice);
    }

    public void noticeUpdate(Notice notice){
        noticeMapper.noticeUpdate(notice);
    }

    public void countUp(int no){
        noticeMapper.countUp(no);
    }

    public void noticeDelete(int no){
        noticeMapper.noticeDelete(no);
    }
}
