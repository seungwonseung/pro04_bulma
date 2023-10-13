package kr.ed.haebeop.service;

import kr.ed.haebeop.domain.Notice;
import kr.ed.haebeop.repository.NoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService{
    @Autowired
    private NoticeRepository noticeRepository;

    @Override
    public List<Notice> noticeList() throws Exception {
        return noticeRepository.noticeList();
    }

    @Override
    public Notice getNotice(int no) throws Exception {
        return noticeRepository.getNotice(no);
    }

    @Override
    public void noticeInsert(Notice notice) throws Exception {
        noticeRepository.noticeInsert(notice);
    }

    @Override
    public void noticeUpdate(Notice notice) throws Exception {
        noticeRepository.noticeUpdate(notice);
    }

    @Override
    public void countUp(int no) throws Exception {
        noticeRepository.countUp(no);
    }

    @Override
    public void noticeDelete(int no) throws Exception {
        noticeRepository.noticeDelete(no);
    }
}
