package org.launchcode.skill_tracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
public class SkillController {
    @GetMapping
    @ResponseBody
    public String getSkills(){
        return "<h1>Skills Tracker</h1>" +
                "<h2>Here are a few of the languages to choose from!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";

    }
    @GetMapping("/form")
    @ResponseBody
    public String chooseSkills(){
String html = "<form action = '/form' method = 'post'>" +
        "<label>Name:</label>" +
        "<input type = 'text' name = 'name' >"+"<br>"+
        "<label>My favorite language:</label>" +"<br>"+
        "<select name = 'language' id='language'>" +
        "<option value = 'java'>Java</option>" +
        "<option value = 'javascript'>Javascript</option>" +
        "<option value = 'python'>Python</option>" +
        "</select>" +"<br>"+
        "<label>My second favorite language:</label>" +"<br>"+
        "<select name = 'language2' id='language2'>" +
        "<option value = 'java'>Java</option>" +
        "<option value = 'javascript'>Javascript</option>" +
        "<option value = 'python'>Python</option>" +
        "</select>" +"<br>"+
        "<label>My third favorite language:</label>" +"<br>"+
        "<select name = 'language3' id='language3'>" +
        "<option value = 'java'>Java</option>" +
        "<option value = 'javascript'>Javascript</option>" +
        "<option value = 'python'>Python</option>" +
        "</select>" +"<br>"+
        "<input type = 'submit' value = 'submit!' >" +
        "</form>";

return html;
    }
//    @PostMapping("/form")
//    @ResponseBody
//    public String processForm(@RequestParam String name,
//                              @RequestParam String language,
//                              @RequestParam String language2,
//                              @RequestParam String language3) {
//        return "<h1>"
//    }

}
