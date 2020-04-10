package t1708e.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import t1708e.exam.entity.BookDetails;

public interface BooksRepository extends JpaRepository<BookDetails, Integer>  {
}
