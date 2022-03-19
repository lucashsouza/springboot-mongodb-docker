package br.com.lucashsouza.docker.compose.controller;

import br.com.lucashsouza.docker.compose.dao.BookRepository;
import br.com.lucashsouza.docker.compose.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository repository;

    @GetMapping
    public List<Book> getBooks() {
        return repository.findAll();
    }

    @PostMapping
    public Book saveBook(@RequestBody Book book) {
        return repository.save(book);
    }
}
