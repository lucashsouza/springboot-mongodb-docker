package br.com.lucashsouza.docker.compose.dao;

import br.com.lucashsouza.docker.compose.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
}
