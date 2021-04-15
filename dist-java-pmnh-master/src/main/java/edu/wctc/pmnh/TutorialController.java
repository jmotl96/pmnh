package edu.wctc.pmnh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/tutorial")
public class TutorialController {
    @RequestMapping("/stairs")
    public String showStairs() {
        return "pages/stairs";
    }

    @RequestMapping("/confession")
    public String showConfession() {
        return "pages/confession";
    }

    @RequestMapping("/count")
    public String showCount() {
        return "pages/count";
    }
}
