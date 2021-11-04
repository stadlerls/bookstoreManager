package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookstoremanager.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
