package com.example.myhistorylibray.HomeController;

import com.example.myhistorylibray.entity.accountBook;
import com.example.myhistorylibray.service.accountBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class accountController {
    @Autowired
    private com.example.myhistorylibray.service.accountBookService accountBookService;


    @PostMapping("/accountWrite")
    public String accountbook(Model model, accountBook account) throws Exception {
        System.out.println("Controller Start");
        accountBookService.insert(account);
        model.addAttribute("message", "등록 되었습니다.");
//        model.addAttribute("searchUrl", "/board/list");
        System.out.println("Controller End");
        return "content";
    }
}
