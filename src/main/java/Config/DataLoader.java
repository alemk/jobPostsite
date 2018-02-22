package Config;

import Models.AppRole;
import Models.AppUser;
import Repository.AppRoleRepository;
import Repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    AppRoleRepository roleRepo;

    @Autowired
    AppUserRepository userRepository;

    @Override
    public void run(String... strings) throws Exception {

        //Add all data that should be in the database at the beginning of the application
        AppRole role = new AppRole();
        role.setRoleName("EMPLOYER");
        roleRepo.save(role);

        role = new AppRole();
        role.setRoleName("APPLICANT");
        roleRepo.save(role);

        role = new AppRole();
        role.setRoleName("RECRUITER");
        roleRepo.save(role);

        AppUser user = new AppUser();
        user.setUsername("Applicant");
        user.setPassword("password");
        user.addRole(roleRepo.findAppRoleByRoleName("APPLICANT"));
        userRepository.save(user);

        user = new AppUser();
        user.setUsername("Recruiter");
        user.setPassword("password");
        user.addRole(roleRepo.findAppRoleByRoleName("RECRUITER"));

        userRepository.save(user);

    }
}
