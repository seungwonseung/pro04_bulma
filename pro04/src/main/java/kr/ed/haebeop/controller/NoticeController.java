package kr.ed.haebeop.controller;

import kr.ed.haebeop.domain.Notice;
import kr.ed.haebeop.service.NoticeService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class NoticeController {
    @Autowired
    private NoticeService2 noticeService;

    @GetMapping("/list.do")
    public String noticeList(Model model) {
        List<Notice> noticeList = noticeService.noticeList();
        model.addAttribute("noticeList", noticeList);
        return "/notice/noticeList";
    }
}
