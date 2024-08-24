package br.com.javamysql.service;

import br.com.javamysql.entity.Word;
import org.springframework.data.domain.Page;

import java.util.List;

public interface WordService {
    Page<Word> searchWords(String ptWord, int page, int size);
    Word saveWord(Word word);
    Word updateWord(Long id, Word word);
    void deleteWord(Long id);
    List<Word> createDummyWords(int qty);
}
