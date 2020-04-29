package com.library.speedreader.repositories;

import com.library.speedreader.models.InputString;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InputStringRepo extends JpaRepository<InputString, Long> {
    InputString findInputStringById(long id);
}
