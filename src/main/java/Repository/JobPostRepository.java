package Repository;

import JobCategory.JobPost;
import org.springframework.data.repository.CrudRepository;

public interface JobPostRepository extends CrudRepository<JobPost, Long> {
}
