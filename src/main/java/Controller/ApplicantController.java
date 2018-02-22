package Controller;

import Applicants.Education;
import Applicants.Experiance;
import Applicants.Skills;
import JobCategory.JobPost;
import Repository.EducationRepository;
import Repository.ExperianceRepository;
import Repository.JobPostRepository;
import Repository.SkillssRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicantController {

    @Autowired
    private EducationRepository educationRepository;
    @Autowired
    private JobPostRepository jobPostRepository;
    @Autowired
    private SkillssRepository skillssRepository;
    @Autowired
    private ExperianceRepository experianceRepository;



    @RequestMapping("/listjobs")
    public String listBooks(Model model){
        model.addAttribute("jobs", jobPostRepository.findAll());
        return "joblist";
    }
    @RequestMapping("/addJobPost")
    public String addJobPost(Model model){
        model.addAttribute("jobPost", new JobPost());
        return "addJobPost";
    }
    @PostMapping("/addJobPost")
    public String processExperiance(@ModelAttribute JobPost jobPost, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "addJobPost";
        }
        jobPostRepository.save(jobPost);
        return "/";
    }

    @GetMapping("/addExperiance")
    public String addExperiance(Model model){
        model.addAttribute("experiance", new Experiance());
        return "addExperiance";
    }
    @PostMapping("/addExperiance")
    public String processExperiance(@ModelAttribute Experiance experiance, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "addExperiance";
        }
        experianceRepository.save(experiance);
        return "/";
    }
    @GetMapping("/addSkill")
    public String addSkill(Model model){
        model.addAttribute("experiance", new Skills());
        return "addExperiance";
    }
    @PostMapping("/addSkill")
    public String processSkill(@ModelAttribute  Skills skills, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "addExperiance";
        }
        skillssRepository.save(skills);
        return "/";
    }
    @GetMapping("/addEducation")
    public String addEducation(Model model){
        model.addAttribute("experiance", new Education());
        return "addExperiance";
    }
    @PostMapping("/addEducation")
    public String processEducation(@ModelAttribute Education education, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "addExperiance";
        }
        educationRepository.save(education);
        return "/";
    }

}


