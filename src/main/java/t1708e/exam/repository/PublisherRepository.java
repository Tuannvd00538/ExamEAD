package t1708e.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import t1708e.exam.entity.PublisherCatalogs;

public interface PublisherRepository extends JpaRepository<PublisherCatalogs, Integer> {

}
